/*
 * MIT License
 *
 * Copyright (c) 2020 ultranity
 * Copyright (c) 2019 Perol_Notsfsssf
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE
 */

package com.perol.asdpl.pixivez.core

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.LifecycleOwner
import com.bumptech.glide.Glide
import com.chad.brvah.viewholder.BaseViewHolder
import com.perol.asdpl.pixivez.R
import com.perol.asdpl.pixivez.base.DMutableLiveData
import com.perol.asdpl.pixivez.data.model.Illust
import com.perol.asdpl.pixivez.objects.FileUtil
import com.perol.asdpl.pixivez.objects.InteractionUtil
import com.perol.asdpl.pixivez.services.PxEZApp
import com.perol.asdpl.pixivez.services.Works
import com.perol.asdpl.pixivez.view.NiceImageView

fun ImageView.setLike(context: Context, status: Boolean) {
    if (status) {
        // setImageResource(R.drawable.heart_red)
        Glide.with(context).load(R.drawable.ic_love).into(this)
        // alpha = 0.9F
    } else {
        //TODO: WTF? Glide加载的 ic_action_heart 会变成别的图标，似乎与 res id值=0x7f08009a有关
        //setImageResource(R.drawable.ic_action_heart)
        Glide.with(context).load(R.drawable.ic_heart).into(this)
        // alpha = 0.8F
    }
}

class Payload(
    val type: String,
    val value: Any? = null
)

/**
 *  simple Adapter for image item with heart icon
 */
// TODO: rename
open class PicListXAdapter(
    filter: PicsFilter,
    layoutResId: Int = R.layout.view_recommand_item_s,
) :
    PicListAdapter(filter, layoutResId) {
    private val liveDataID = "likeLiveData".hashCode()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val holder = super.onCreateViewHolder(parent, viewType)
        val likeLiveData = DMutableLiveData(lastValue = false, onlyIfChanged = true)
        likeLiveData.observeAfterSet(parent.context as LifecycleOwner) {
            holder.getView<NiceImageView>(R.id.imageview_like).apply {
                setUILike(it, this)
            }
        }
        holder.itemView.setTag(liveDataID, likeLiveData)
        return holder
    }

    override fun convert(holder: BaseViewHolder, item: Illust) {
        (holder.itemView.getTag(liveDataID) as DMutableLiveData<Boolean>?)?.let {
            (holder.itemView.getTag(illustID) as Illust?)?.removeBinder(it)
            it.triggerValue(item.is_bookmarked)
            item.addBinder("${item.id}|${this.hashCode()}", it)
        }
        super.convert(holder, item)
        if (PxEZApp.CollectMode == 1) {
            holder.getView<NiceImageView>(R.id.imageview_like).apply {
                setOnClickListener {
                    // download
                    setBorderColor(colorPrimaryDark)
                    Works.imageDownloadAll(item)
                    // set like
                    if (!item.is_bookmarked) {
                        InteractionUtil.like(item, null) {
                            //setUILike(true, this)
                        }
                    }
                }
            }
        }
        else {
            holder.getView<NiceImageView>(R.id.imageview_like).apply {
                setOnClickListener {
                    if (item.is_bookmarked) {
                        InteractionUtil.unlike(item) {
                            //setUILike(false, this)
                        }
                    }
                    else {
                        InteractionUtil.like(item, null) {
                            //setUILike(true, this)
                        }
                    }
                }
                setOnLongClickListener {
                    setUIDownload(1, this)
                    Works.imageDownloadAll(item)
                    true
                }
            }
        }
        holder.getView<NiceImageView>(R.id.imageview_like).apply {
            //setUILike(item.is_bookmarked, this)
            setUIDownload(if (FileUtil.isDownloaded(item)) 2 else 0, this)
        }
    }

    override fun setUILike(status: Boolean, position: Int) {
        (getViewByAdapterPosition(
            position,
            R.id.imageview_like
        ) as NiceImageView?)?.setLike(context, status)
    }

    override fun setUILike(status: Boolean, view: View) {
        (view as NiceImageView).setLike(view.context, status)
    }

    override fun setUIDownload(status: Int, position: Int) {
        (
            getViewByAdapterPosition(
                position,
                R.id.imageview_like
            ) as NiceImageView?
            )?.let { setUIDownload(status, it) }
    }

    override fun setUIDownload(status: Int, view: View) {
        val like = view as NiceImageView
        when (status) {
            0 -> { // not downloaded
                like.setBorderColor(colorTransparent)
            }
            1 -> { // Downloading
                like.setBorderColor(colorPrimaryDark)
            }
            2 -> { // Downloaded
                like.setBorderColor(badgeTextColor)
            }
        }
    }
}

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

package com.perol.asdpl.pixivez.data

import com.perol.asdpl.pixivez.data.model.BookMarkTagsResponse
import com.perol.asdpl.pixivez.data.model.CommentsResponse
import com.perol.asdpl.pixivez.data.model.IllustNext
import com.perol.asdpl.pixivez.data.model.ListUserResponse
import com.perol.asdpl.pixivez.data.model.SearchUserResponse
import com.perol.asdpl.pixivez.data.model.SpotlightResponse
import com.perol.asdpl.pixivez.networks.RestClient
import com.perol.asdpl.pixivez.networks.ServiceFactory.gson
import com.perol.asdpl.pixivez.services.PixivApiService
import com.perol.asdpl.pixivez.services.PixivFileService

class RetrofitRepository {

    var api: PixivApiService =
        RestClient.retrofitAppApi.create(PixivApiService::class.java)
    var gif: PixivFileService =
        RestClient.gifAppApi.create(PixivFileService::class.java)

    private suspend inline fun <reified T> getNext(url: String): T =
        api.getUrl(url).let {
            gson.decodeFromString<T>(it.string())
        }

    suspend fun getNextUser(url: String): ListUserResponse = getNext(url)
    suspend fun getNextSearchUser(url: String): SearchUserResponse = getNext(url)
    suspend fun getNextTags(url: String): BookMarkTagsResponse = getNext(url)
    suspend fun getIllustNext(url: String): IllustNext = getNext(url)
    suspend fun getNextIllustComments(url: String): CommentsResponse = getNext(url)
    suspend fun getNextPixivisionArticles(url: String): SpotlightResponse = getNext(url)

    companion object {
        private var instance: RetrofitRepository? = null
        fun getInstance(): RetrofitRepository {
            if (instance == null) {
                synchronized(RetrofitRepository::class.java) {
                    if (instance == null) {
                        instance = RetrofitRepository()
                    }
                }
            }
            return instance!!
        }
    }
}

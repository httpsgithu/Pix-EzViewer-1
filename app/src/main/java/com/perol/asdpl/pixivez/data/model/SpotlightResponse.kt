/*
 * MIT License
 *
 * Copyright (c) 2022 ultranity
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
package com.perol.asdpl.pixivez.data.model

import kotlinx.serialization.Serializable

/**
 * spotlight_articles : [{"id":3504,"title":"君の癒しになりたくて♡膝枕を描いたイラスト特集","pure_title":"膝枕を描いたイラスト特集","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2017/12/05/22/13/26/66174768_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3504","publish_date":"2018-06-07T18:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3494,"title":"カーテンのように揺れる。藤の花を描いたイラスト特集","pure_title":"藤の花を描いたイラスト特集","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2016/12/17/16/11/27/60413187_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3494","publish_date":"2018-06-07T17:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3536,"title":"コミュ障女子が一歩ずつ進める恋愛模様。『孤独女子と強面男子』#このpixivマンガがスゴイ","pure_title":"コミュ障女子が一歩ずつ進める恋愛模様。『孤独女子と強面男子』#このpixivマンガがスゴイ","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2017/04/08/14/22/50/62311055_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3536","publish_date":"2018-06-06T18:00:00+09:00","category":"spotlight","subcategory_label":"マンガ"},{"id":3518,"title":"あなたの視線を釘付けに♡赤ドレスを描いたイラスト特集","pure_title":"赤ドレスを描いたイラスト特集","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2016/07/04/00/08/22/57729447_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3518","publish_date":"2018-06-06T17:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3462,"title":"これは「ラクガキ」レベルじゃないっ！「落描き（書き）」のタグが付いたイラスト特集","pure_title":"「落描き（書き）」のタグが付いたイラスト特集","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2018/03/10/07/19/53/67658795_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3462","publish_date":"2018-06-05T18:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3469,"title":"あふれる感情を旋律にのせて。ピアノを描いたイラスト特集","pure_title":"ピアノを描いたイラスト特集","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2018/01/15/20/54/24/66816299_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3469","publish_date":"2018-06-05T17:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3545,"title":"女装コスプレが趣味の兄に、フランス人の弟ができた！【pixivコミック月例賞】5月投稿分結果発表！","pure_title":"女装コスプレが趣味の兄に、フランス人の弟ができた！【pixivコミック月例賞】5月投稿分結果発表！","thumbnail":"https://i.pximg.net/imgaz/upload/20180604/474419807.jpg","article_url":"https://www.pixivision.net/ja/a/3545","publish_date":"2018-06-04T19:00:00+09:00","category":"inspiration","subcategory_label":"おすすめ"},{"id":3439,"title":"日めくりカレンダーのような日々。草壁さんが描く季節感豊かな日常風景","pure_title":"草壁さんが描く季節感豊かな日常風景","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2015/04/27/07/53/50/50052113_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3439","publish_date":"2018-06-04T18:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3468,"title":"日常もエレガントに♡女優帽を描いたイラスト特集","pure_title":"女優帽を描いたイラスト特集","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2018/03/04/00/34/31/67560672_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3468","publish_date":"2018-06-04T17:00:00+09:00","category":"spotlight","subcategory_label":"イラスト"},{"id":3533,"title":"惚れた相手のドロドロの血を大改善!?『吸血鬼と不健康ＯＬの話』#このpixivマンガがスゴイ","pure_title":"惚れた相手のドロドロの血を大改善!?『吸血鬼と不健康ＯＬの話』#このpixivマンガがスゴイ","thumbnail":"https://i.pximg.net/c/540x540_70/img-master/img/2018/04/10/12/08/30/68165805_p0_master1200.jpg","article_url":"https://www.pixivision.net/ja/a/3533","publish_date":"2018-06-03T18:00:00+09:00","category":"spotlight","subcategory_label":"マンガ"}]
 * next_url : https://app-api.pixiv.net/v1/spotlight/articles?filter=for_ios&category=all&offset=10
 */
@Serializable
data class SpotlightResponse(
    override val next_url: String?,
    val spotlight_articles: MutableList<SpotlightArticlesBean>
) : INext<SpotlightArticlesBean> {
    override fun data() = spotlight_articles
}

/**
 * id : 3504
 * title : 君の癒しになりたくて♡膝枕を描いたイラスト特集
 * pure_title : 膝枕を描いたイラスト特集
 * thumbnail : https://i.pximg.net/c/540x540_70/img-master/img/2017/12/05/22/13/26/66174768_p0_master1200.jpg
 * article_url : https://www.pixivision.net/ja/a/3504
 * publish_date : 2018-06-07T18:00:00+09:00
 * category : spotlight
 * subcategory_label : イラスト
 */
@Serializable
data class SpotlightArticlesBean(
    val id: Int = 0,
    val title: String?,
    val pure_title: String?,
    val thumbnail: String?,
    val article_url: String?,
    val publish_date: String?,
    val category: String?,
    val subcategory_label: String?
)

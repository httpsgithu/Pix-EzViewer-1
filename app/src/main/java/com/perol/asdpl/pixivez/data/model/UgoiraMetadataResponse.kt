/*
 * MIT License
 *
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
 * ugoira_metadata : {"zip_urls":{"medium":"https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira600x600.zip"},"frames":[{"file":"000000.jpg","delay":50},{"file":"000001.jpg","delay":50},{"file":"000002.jpg","delay":50},{"file":"000003.jpg","delay":50},{"file":"000004.jpg","delay":50},{"file":"000005.jpg","delay":50},{"file":"000006.jpg","delay":50},{"file":"000007.jpg","delay":50},{"file":"000008.jpg","delay":50},{"file":"000009.jpg","delay":50},{"file":"000010.jpg","delay":50},{"file":"000011.jpg","delay":50},{"file":"000012.jpg","delay":50},{"file":"000013.jpg","delay":50},{"file":"000014.jpg","delay":50},{"file":"000015.jpg","delay":50},{"file":"000016.jpg","delay":50},{"file":"000017.jpg","delay":50},{"file":"000018.jpg","delay":50},{"file":"000019.jpg","delay":50},{"file":"000020.jpg","delay":50},{"file":"000021.jpg","delay":50},{"file":"000022.jpg","delay":50},{"file":"000023.jpg","delay":50},{"file":"000024.jpg","delay":50},{"file":"000025.jpg","delay":50},{"file":"000026.jpg","delay":50},{"file":"000027.jpg","delay":50},{"file":"000028.jpg","delay":50},{"file":"000029.jpg","delay":50},{"file":"000030.jpg","delay":50},{"file":"000031.jpg","delay":50},{"file":"000032.jpg","delay":50},{"file":"000033.jpg","delay":50},{"file":"000034.jpg","delay":50},{"file":"000035.jpg","delay":50},{"file":"000036.jpg","delay":50},{"file":"000037.jpg","delay":50},{"file":"000038.jpg","delay":50},{"file":"000039.jpg","delay":50},{"file":"000040.jpg","delay":50},{"file":"000041.jpg","delay":50},{"file":"000042.jpg","delay":50},{"file":"000043.jpg","delay":50},{"file":"000044.jpg","delay":50},{"file":"000045.jpg","delay":50}]}
 */
@Serializable
class UgoiraMetadataResponse(val ugoira_metadata: UgoiraMetadataBean)

/**
 * zip_urls : {"medium":"https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira600x600.zip"}
 * frames : [{"file":"000000.jpg","delay":50},{"file":"000001.jpg","delay":50},{"file":"000002.jpg","delay":50},{"file":"000003.jpg","delay":50},{"file":"000004.jpg","delay":50},{"file":"000005.jpg","delay":50},{"file":"000006.jpg","delay":50},{"file":"000007.jpg","delay":50},{"file":"000008.jpg","delay":50},{"file":"000009.jpg","delay":50},{"file":"000010.jpg","delay":50},{"file":"000011.jpg","delay":50},{"file":"000012.jpg","delay":50},{"file":"000013.jpg","delay":50},{"file":"000014.jpg","delay":50},{"file":"000015.jpg","delay":50},{"file":"000016.jpg","delay":50},{"file":"000017.jpg","delay":50},{"file":"000018.jpg","delay":50},{"file":"000019.jpg","delay":50},{"file":"000020.jpg","delay":50},{"file":"000021.jpg","delay":50},{"file":"000022.jpg","delay":50},{"file":"000023.jpg","delay":50},{"file":"000024.jpg","delay":50},{"file":"000025.jpg","delay":50},{"file":"000026.jpg","delay":50},{"file":"000027.jpg","delay":50},{"file":"000028.jpg","delay":50},{"file":"000029.jpg","delay":50},{"file":"000030.jpg","delay":50},{"file":"000031.jpg","delay":50},{"file":"000032.jpg","delay":50},{"file":"000033.jpg","delay":50},{"file":"000034.jpg","delay":50},{"file":"000035.jpg","delay":50},{"file":"000036.jpg","delay":50},{"file":"000037.jpg","delay":50},{"file":"000038.jpg","delay":50},{"file":"000039.jpg","delay":50},{"file":"000040.jpg","delay":50},{"file":"000041.jpg","delay":50},{"file":"000042.jpg","delay":50},{"file":"000043.jpg","delay":50},{"file":"000044.jpg","delay":50},{"file":"000045.jpg","delay":50}]
 */
@Serializable
class UgoiraMetadataBean(
    val zip_urls: ZipUrlsBean,
    val frames: List<FramesBean>
)

/**
 * max : https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira1920x1080.zip
 * medium : https://i.pximg.net/img-zip-ugoira/img/2014/11/04/02/25/15/46907945_ugoira600x600.zip
 */
@Serializable
class ZipUrlsBean(val medium: String)

/**
 * file : 000000.jpg
 * delay : 50
 */
@Serializable
class FramesBean(
    val file: String,
    val delay: Int = 0
)

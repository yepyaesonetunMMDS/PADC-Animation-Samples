package com.prime.ypst.padc_animation_samples.data.vos

import java.io.Serializable

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-11.
 */

//class AttractionVO {
//    @SerializedName("title")
//    val title: String? = null
//
//    @SerializedName("desc")
//    val desc: String? = null
//
//    @SerializedName("images")
//    val images: Array<String>? = null
//}

data class AttractionVO(var title: String, var desc: String, var imageUrl: String) : Serializable
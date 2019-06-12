package com.prime.ypst.padc_animation_samples.utils

import android.content.Context
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-12.
 */
@GlideModule
class PADCAnimationSampleGlideApp: AppGlideModule() {
    override fun applyOptions(context: Context, builder: GlideBuilder) {
        super.applyOptions(context, builder)
    }
}
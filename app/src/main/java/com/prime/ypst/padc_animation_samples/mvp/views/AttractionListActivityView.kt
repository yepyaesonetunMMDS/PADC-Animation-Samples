package com.prime.ypst.padc_animation_samples.mvp.views

import android.widget.ImageView
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-12.
 */
interface AttractionListActivityView : BaseView {
    fun navigateToAttractionDetails(data: AttractionVO, imageView: ImageView)
}
package com.prime.ypst.padc_animation_samples.delegates

import android.widget.ImageView
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-12.
 */
interface AttractionItemDelegate {
    fun onTapAttractionCard(data: AttractionVO, imageView: ImageView)
}
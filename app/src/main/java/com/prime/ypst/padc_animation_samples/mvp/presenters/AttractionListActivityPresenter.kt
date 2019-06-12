package com.prime.ypst.padc_animation_samples.mvp.presenters

import android.widget.ImageView
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO
import com.prime.ypst.padc_animation_samples.delegates.AttractionItemDelegate
import com.prime.ypst.padc_animation_samples.mvp.views.AttractionListActivityView

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-12.
 */

class AttractionListActivityPresenter : BasePresenter<AttractionListActivityView>(), AttractionItemDelegate {
    override fun onTapAttractionCard(data: AttractionVO, imageView: ImageView) {
        mView.navigateToAttractionDetails(data = data, imageView = imageView)
    }
}
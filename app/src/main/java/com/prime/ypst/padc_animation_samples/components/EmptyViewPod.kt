package com.prime.ypst.padc_animation_samples.components

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_pod_empty.view.*

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-11.
 */
class EmptyViewPod(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    RelativeLayout(context, attrs, defStyleAttr) {

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setEmptyLabel(emptyLabel: String) {
        lbl_empty.text = emptyLabel
    }

    fun setEmptyLabel(emptyLabel: String, textColor: Int) {
        lbl_empty.text = emptyLabel
        lbl_empty.setTextColor(textColor)
    }

    fun setEmptyImage(resourceId: Int) {
        iv_empty.setImageResource(resourceId)
    }

}
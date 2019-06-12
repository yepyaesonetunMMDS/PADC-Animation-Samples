package com.prime.ypst.padc_animation_samples.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.prime.ypst.padc_animation_samples.R
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO
import com.prime.ypst.padc_animation_samples.delegates.AttractionItemDelegate
import com.prime.ypst.padc_animation_samples.viewholders.AttractionItemViewHolder
import com.prime.ypst.padc_animation_samples.viewholders.BaseViewHolder

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-11.
 */

class AttractionsRVAdapter(private val delegate: AttractionItemDelegate) :
    BaseRecyclerAdapter<AttractionItemViewHolder, AttractionVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): BaseViewHolder<AttractionVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_attraction, parent, false)
        return AttractionItemViewHolder(view, delegate)
    }

}
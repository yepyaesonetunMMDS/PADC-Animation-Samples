package com.prime.ypst.padc_animation_samples.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO
import com.prime.ypst.padc_animation_samples.delegates.AttractionItemDelegate
import kotlinx.android.synthetic.main.view_item_attraction.view.*

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-11.
 */

class AttractionItemViewHolder(itemView: View, private val delegate: AttractionItemDelegate) :
    BaseViewHolder<AttractionVO>(itemView) {
    override fun onClick(v: View?) {}

    override fun setData(data: AttractionVO) {

        Glide.with(itemView.context)
            .load(data.imageUrl)
            .into(itemView.ivAttraction)
        itemView.tvAttractionDesc.text = data.desc
        itemView.tvAttractionTitle.text = data.title


        itemView.setOnClickListener { delegate.onTapAttractionCard(data = data, imageView = itemView.ivAttraction) }
    }
}
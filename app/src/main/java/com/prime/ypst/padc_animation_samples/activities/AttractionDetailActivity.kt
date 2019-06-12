package com.prime.ypst.padc_animation_samples.activities

import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.prime.ypst.padc_animation_samples.R
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO
import kotlinx.android.synthetic.main.activity_attraction_detail.*

class AttractionDetailActivity : AppCompatActivity() {

    companion object {
        const val IE_DATA = "IE_DATA"
        fun getIntent(context: Context, data: AttractionVO): Intent {
            val intent = Intent(context, AttractionDetailActivity::class.java)
            intent.putExtra(IE_DATA, data)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attraction_detail)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ivAttraction.setTransitionName(getString(R.string.detail_transition_name))
        }

        val data = intent.getSerializableExtra(IE_DATA) as? AttractionVO
        tvAttractionDesc.text = data!!.desc
        collapsing_toolbar_layout.title = data!!.title
        Glide.with(this)
            .load(data.imageUrl)
            .into(ivAttraction)
    }
}

package com.prime.ypst.padc_animation_samples.mvp.presenters

import android.arch.lifecycle.ViewModel
import com.prime.ypst.padc_animation_samples.mvp.views.BaseView

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-11.
 */
abstract class BasePresenter <T: BaseView>: ViewModel() {

    protected lateinit var mView: T

    fun initPresenter(view: T) {
        this.mView = view
    }

}
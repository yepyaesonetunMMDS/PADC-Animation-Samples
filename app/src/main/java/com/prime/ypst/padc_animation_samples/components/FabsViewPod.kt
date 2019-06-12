package com.prime.ypst.padc_animation_samples.components

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AccelerateInterpolator
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.view_pod_fabs.view.*

/**
 * Created by Ye Pyae Sone Tun
 * on 2019-06-11.
 */
class FabsViewPod(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    FrameLayout(context, attrs, defStyleAttr) {

    private val controller: FabsController? = null

    private var isOpen = false

    private fun openAnim() {
        val objAnimRotation = ObjectAnimator.ofFloat(fab_plus, "rotation", 540f, 0f)
        objAnimRotation.duration = 600
        objAnimRotation.interpolator = AccelerateInterpolator()
        objAnimRotation.start()

        val objAnimCallFW = ObjectAnimator.ofFloat(fab_sms, "y", fab_sms.y, fab_sms.y - 310f)
        objAnimCallFW.duration = 500
        objAnimCallFW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimCallBW = ObjectAnimator.ofFloat(fab_sms, "y", fab_sms.y - 310, fab_sms.y - 280f)
        objAnimCallBW.duration = 100
        objAnimCallBW.interpolator = AccelerateDecelerateInterpolator()

        val asCall = AnimatorSet()
        asCall.play(objAnimCallBW).after(objAnimCallFW)
        asCall.start()

        val objAnimFacebookFW = ObjectAnimator.ofFloat(fab_viber, "x", fab_viber.x, fab_viber.x - 310f)
        objAnimFacebookFW.duration = 500
        objAnimFacebookFW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimFacebookBW = ObjectAnimator.ofFloat(fab_viber, "x", fab_viber.x - 310, fab_viber.x - 280f)
        objAnimFacebookBW.duration = 100
        objAnimFacebookBW.interpolator = AccelerateDecelerateInterpolator()

        val asFacebook = AnimatorSet()
        asFacebook.play(objAnimFacebookBW).after(objAnimFacebookFW)
        asFacebook.start()

        val objAnimMapXFW =
            ObjectAnimator.ofFloat(fab_fb_messenger, "x", fab_fb_messenger.x, fab_fb_messenger.x - 180f)
        objAnimMapXFW.duration = 500
        objAnimMapXFW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimMapYFW =
            ObjectAnimator.ofFloat(fab_fb_messenger, "y", fab_fb_messenger.y, fab_fb_messenger.y - 180f)
        objAnimMapYFW.duration = 500
        objAnimMapYFW.interpolator = AccelerateDecelerateInterpolator()

        val asMapFW = AnimatorSet()
        asMapFW.play(objAnimMapYFW).with(objAnimMapXFW)
        asMapFW.start()

        val objAnimMapXBW =
            ObjectAnimator.ofFloat(
                fab_fb_messenger,
                "x",
                fab_fb_messenger.x - 180f,
                fab_fb_messenger.x - 160f
            )
        objAnimMapXBW.duration = 100
        objAnimMapXBW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimMapYBW =
            ObjectAnimator.ofFloat(
                fab_fb_messenger,
                "y",
                fab_fb_messenger.y - 180f,
                fab_fb_messenger.y - 160f
            )
        objAnimMapYBW.duration = 100
        objAnimMapYBW.interpolator = AccelerateDecelerateInterpolator()

        val asMapBW = AnimatorSet()
        asMapBW.play(objAnimMapYBW).with(objAnimMapXBW)
        asMapBW.startDelay = 500
        asMapBW.start()
    }

    private fun closeAnim() {
        val objAnimRotation = ObjectAnimator.ofFloat(fab_plus, "rotation", 0f, 540f)
        objAnimRotation.duration = 600
        objAnimRotation.interpolator = AccelerateInterpolator()
        objAnimRotation.start()

        val objAnimCallFW = ObjectAnimator.ofFloat(fab_sms, "y", fab_sms.y, fab_sms.y - 30f)
        objAnimCallFW.duration = 100
        objAnimCallFW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimCallBW = ObjectAnimator.ofFloat(fab_sms, "y", fab_sms.y - 30, fab_sms.y + 280f)
        objAnimCallBW.duration = 500
        objAnimCallBW.interpolator = AccelerateDecelerateInterpolator()

        val asCall = AnimatorSet()
        asCall.play(objAnimCallBW).after(objAnimCallFW)
        asCall.start()

        val objAnimFacebookFW = ObjectAnimator.ofFloat(fab_viber, "x", fab_viber.x, fab_viber.x - 30f)
        objAnimFacebookFW.duration = 100
        objAnimFacebookFW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimFacebookBW = ObjectAnimator.ofFloat(fab_viber, "x", fab_viber.x - 30, fab_viber.x + 280f)
        objAnimFacebookBW.duration = 500
        objAnimFacebookBW.interpolator = AccelerateDecelerateInterpolator()

        val asFacebook = AnimatorSet()
        asFacebook.play(objAnimFacebookBW).after(objAnimFacebookFW)
        asFacebook.start()

        val objAnimMapXFW =
            ObjectAnimator.ofFloat(fab_fb_messenger, "x", fab_fb_messenger.x, fab_fb_messenger.x - 20)
        objAnimMapXFW.duration = 100
        objAnimMapXFW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimMapYFW =
            ObjectAnimator.ofFloat(fab_fb_messenger, "y", fab_fb_messenger.y, fab_fb_messenger.y - 20)
        objAnimMapYFW.duration = 100
        objAnimMapYFW.interpolator = AccelerateDecelerateInterpolator()

        val asMapFW = AnimatorSet()
        asMapFW.play(objAnimMapYFW).with(objAnimMapXFW)
        asMapFW.start()

        val objAnimMapXBW =
            ObjectAnimator.ofFloat(fab_fb_messenger, "x", fab_fb_messenger.x - 20f, fab_fb_messenger.x + 160f)
        objAnimMapXBW.duration = 500
        objAnimMapXBW.interpolator = AccelerateDecelerateInterpolator()

        val objAnimMapYBW =
            ObjectAnimator.ofFloat(fab_fb_messenger, "y", fab_fb_messenger.y - 20f, fab_fb_messenger.y + 160f)
        objAnimMapYBW.duration = 500
        objAnimMapYBW.interpolator = AccelerateDecelerateInterpolator()

        val asMapBW = AnimatorSet()
        asMapBW.play(objAnimMapYBW).with(objAnimMapXBW)
        asMapBW.startDelay = 100
        asMapBW.start()
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        fab_plus.setOnClickListener {
            if (!isOpen) {
                openAnim()
                isOpen = true
            } else {
                closeAnim()
                isOpen = false
            }
        }


        fab_sms.setOnClickListener {
            controller?.onTapSms()
        }

        fab_fb_messenger.setOnClickListener {
            controller?.onTapFbMessenger()
        }

        fab_viber.setOnClickListener {
            controller?.onTapViber()
        }
    }

    interface FabsController {
        fun onTapSms()

        fun onTapFbMessenger()

        fun onTapViber()
    }

}
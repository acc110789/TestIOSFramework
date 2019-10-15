package me.test

import kn.foundation.bd.IMRIndicatorView
import kn.foundation.bd.IMRIndicatorViewStyleImageShort
import kn.foundation.bd.ImageAssets

actual object RocketToastUtil {
    actual fun showToastWithSuccessIcon(message: String) {
        IMRIndicatorView.showWithIndicatorStyle(
            IMRIndicatorViewStyleImageShort,
            message,
            ImageAssets.imr_podBundleImageWithImageName("iconToastOk24C9"),
            true,
            null
        )
    }
}
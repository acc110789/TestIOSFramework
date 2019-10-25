package me.test

import kn.foundation.ios.applog.BoltsFrameworkVersionString


actual object RocketToastUtil {
    actual fun showToastWithSuccessIcon(message: String) {
        val myStr = BoltsFrameworkVersionString
        println("myStr: $myStr")
    }
}
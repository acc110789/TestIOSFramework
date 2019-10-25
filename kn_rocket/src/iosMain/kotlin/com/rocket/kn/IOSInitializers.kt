package com.rocket.kn

import me.test.RocketToastUtil

/**
 * 当作是IOS KN的一个入口点把
 * */
object IOSInitializers {

    fun init() {
    }

    fun getHelloWorld(): String {
        RocketToastUtil.showToastWithSuccessIcon("aaaa")

        val time = 0L
//        val request = CreatePeppaCalRequest.Builder().client_id("111").build()
//        val peppaId = request.knClientId
//        println("peppaId: $peppaId")

        if(time % 2 == 0L) {
            return "hello, world 1"
        } else {
            return "hello, world 2"
        }
    }
}
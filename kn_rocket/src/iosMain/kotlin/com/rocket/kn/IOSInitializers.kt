package com.rocket.kn

/**
 * 当作是IOS KN的一个入口点把
 * */
object IOSInitializers {

    fun init() {
    }

    fun getHelloWorld(): String {
//        val time: Long = KNSystemClock.currentTimeMillis()
        val time: Long = 10L
        if(time % 2 == 0L) {
            return "hello, world 1"
        } else {
            return "hello, world 2"
        }
    }
}
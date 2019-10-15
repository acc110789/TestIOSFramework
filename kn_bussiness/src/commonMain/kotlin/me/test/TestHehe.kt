package me.test

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class TestHehe {

    @ExperimentalTime
    fun getTime(): Long {
        measureTime {

        }
        return 0
    }
}
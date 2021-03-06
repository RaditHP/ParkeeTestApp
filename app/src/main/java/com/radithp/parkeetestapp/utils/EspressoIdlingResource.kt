package com.radithp.jetpacksubmission3.utils

import androidx.test.espresso.idling.CountingIdlingResource

/**
Created by radit
 */
object EspressoIdlingResource {
    private const val RESOURCE = "GLOBAL"
    val idlingResource = CountingIdlingResource(RESOURCE)

    fun increment() {
        idlingResource.increment()
    }

    fun decrement() {
        idlingResource.decrement()
    }
}
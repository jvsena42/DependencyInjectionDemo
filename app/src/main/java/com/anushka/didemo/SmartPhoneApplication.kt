package com.anushka.didemo

import android.app.Application

class SmartPhoneApplication : Application(){

    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        super.onCreate()
    }

//    private fun initDagger():SmartPhoneComponent
}
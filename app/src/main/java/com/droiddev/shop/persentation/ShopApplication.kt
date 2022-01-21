package com.droiddev.shop.persentation

import android.app.Application
import com.droiddev.shop.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}
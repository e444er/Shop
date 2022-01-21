package com.droiddev.shop.di

import android.app.Application
import com.droiddev.shop.persentation.MainActivity
import com.droiddev.shop.persentation.ShowItemActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: ShowItemActivity)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}
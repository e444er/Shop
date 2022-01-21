package com.droiddev.shop.di

import com.droiddev.shop.data.ShopListRepositoryImpl
import com.droiddev.shop.domain.ShopListRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindShopListRepository(impl: ShopListRepositoryImpl) : ShopListRepository
}
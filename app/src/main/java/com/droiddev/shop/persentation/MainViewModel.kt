package com.droiddev.shop.persentation

import androidx.lifecycle.ViewModel
import com.droiddev.shop.data.ShopListRepositoryImpl
import com.droiddev.shop.domain.DeleteShopItemUseCase
import com.droiddev.shop.domain.EditShopItemUseCase
import com.droiddev.shop.domain.GetShopListUseCase
import com.droiddev.shop.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopList(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}


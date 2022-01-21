package com.droiddev.shop.persentation

import androidx.lifecycle.ViewModel
import com.droiddev.shop.data.ShopListRepositoryImpl
import com.droiddev.shop.domain.DeleteShopItemUseCase
import com.droiddev.shop.domain.EditShopItemUseCase
import com.droiddev.shop.domain.GetShopListUseCase
import com.droiddev.shop.domain.ShopItem
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getShopListUseCase: GetShopListUseCase,
    private val deleteShopItemUseCase: DeleteShopItemUseCase,
    private val editShopItemUseCase: EditShopItemUseCase
) : ViewModel() {

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopList(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}


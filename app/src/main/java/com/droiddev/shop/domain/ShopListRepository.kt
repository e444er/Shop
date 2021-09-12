package com.droiddev.shop.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem:ShopItem)

    fun getShopItem(shopItemId: Int) : ShopItem

    fun getShopList(): List<ShopItem>

    fun editShopItem(shopItem: ShopItem)
}
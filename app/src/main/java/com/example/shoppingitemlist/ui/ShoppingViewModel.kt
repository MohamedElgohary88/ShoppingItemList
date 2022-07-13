package com.example.shoppingitemlist.ui

import com.example.shoppingitemlist.model.ShoppingItem
import com.example.shoppingitemlist.repository.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class ShoppingViewModel(private var repository: ShoppingRepository){

    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch{
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()

}
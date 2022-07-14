package com.example.shoppingitemlist.db

import android.arch.persistence.room.*
import androidx.lifecycle.LiveData
import com.example.shoppingitemlist.model.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems():LiveData<List<ShoppingItem>>
}
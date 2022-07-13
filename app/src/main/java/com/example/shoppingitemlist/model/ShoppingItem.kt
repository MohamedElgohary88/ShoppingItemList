package com.example.shoppingitemlist.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @ColumnInfo(name = "item_name")
    var name :String,
    @ColumnInfo(name = "item_amount")
    var amount:Int
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
}

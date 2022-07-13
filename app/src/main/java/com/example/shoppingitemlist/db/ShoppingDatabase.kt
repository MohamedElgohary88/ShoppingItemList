package com.example.shoppingitemlist.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.example.shoppingitemlist.model.ShoppingItem

@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingDatabase :RoomDatabase() {


}
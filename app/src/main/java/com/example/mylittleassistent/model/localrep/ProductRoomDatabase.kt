package com.example.mylittleassistent.model.localrep

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ProductLocalStorage::class), version = 1, exportSchema = false)
abstract class ProductRoomDatabase: RoomDatabase() {

    abstract  fun productDao(): IProductLocalDao

    companion object {
        @Volatile
        private var INSTANCE: ProductRoomDatabase? = null

        fun getDatabase(context: Context): ProductRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ProductRoomDatabase::class.java,
                    "product_table"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
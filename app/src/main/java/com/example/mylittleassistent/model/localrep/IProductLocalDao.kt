package com.example.mylittleassistent.model.localrep

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
//Переделать! Это просто пример, мне нужно другое поведение.
@Dao
interface IProductLocalDao {
    @Query("SELECT * from product_table ORDER BY product ASC")
    fun getAlphabetizedProducts(): LiveData<List<ProductLocalStorage>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(products: ProductLocalStorage)

    @Query("DELETE FROM product_table")
    suspend fun deleteALL()
}
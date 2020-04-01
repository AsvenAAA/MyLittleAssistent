package com.example.mylittleassistent.presenter

import androidx.lifecycle.LiveData
import com.example.mylittleassistent.model.localrep.IProductLocalDao
import com.example.mylittleassistent.model.localrep.ProductLocalStorage
import com.example.mylittleassistent.viewmodel.IView
import org.json.JSONObject

class PresenterRepository(private val productDao: IProductLocalDao) : IPresenter,
    IView {

    val allProducts: LiveData<List<ProductLocalStorage>> = productDao.getAlphabetizedProducts()

    suspend fun insert(product: ProductLocalStorage) {
        productDao.insert(product)
    }





    override fun checkProductData(product: String): Boolean {
        TODO("Проверяю продукт в базе")
    }

    override fun getProductData(product: String, weight: String): JSONObject {
        TODO("Not yet implemented")
    }

    //Добавляет данные в базу(белки, жиры, углеводы, ккаллории)
    fun addProductData(check: Boolean){
        if(check){

        }
    }
}
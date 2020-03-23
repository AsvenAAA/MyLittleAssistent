package com.example.mylittleassistent.presenter

import android.widget.TextView
import com.example.mylittleassistent.IView
import org.json.JSONObject

class PresenterCore : IPresenter, IView {

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
package com.example.mylittleassistent.viewmodel

import android.widget.TextView
import org.json.JSONObject

interface IView {

    //Активирует SetFoodChemicalCompositionActivity для добавления нового продукта в локальную базу

    //Проверяет наличие продукта в базе
    fun checkProductData(product: String): Boolean
    //Отдает параметры продукта в формате JSON
    fun getProductData(product: String, weight: String): JSONObject
}
package com.example.mylittleassistent.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.mylittleassistent.model.localrep.ProductLocalStorage
import com.example.mylittleassistent.model.localrep.ProductRoomDatabase
import com.example.mylittleassistent.presenter.PresenterRepository
import kotlinx.coroutines.launch

class ProductViewModel(application: Application) : AndroidViewModel(application){
    private val repository: PresenterRepository
    val allProducts: LiveData<List<ProductLocalStorage>>

    init {
        val productDao = ProductRoomDatabase.getDatabase(application).productDao()
        repository = PresenterRepository(productDao)
        allProducts = repository.allProducts
    }

    fun insert(product: ProductLocalStorage) = viewModelScope.launch {
        repository.insert(product)
    }
}
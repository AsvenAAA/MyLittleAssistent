package com.example.mylittleassistent.viewmodel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mylittleassistent.R
import com.example.mylittleassistent.model.localrep.ProductLocalStorage

class ProductListAdapter internal constructor(
    context: Context
): RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var products = emptyList<ProductLocalStorage>() // Cached copy of words

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productItemView: TextView = itemView.findViewById(R.id.mainText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val current = products[position]
        holder.productItemView.text = current.product
    }

    internal fun setProducts(products: List<ProductLocalStorage>) {
        this.products = products
        notifyDataSetChanged()
    }

    override fun getItemCount() = products.size
}
package com.example.mylittleassistent.viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mylittleassistent.R
import com.example.mylittleassistent.presenter.PresenterRepository
import org.json.JSONObject

class MainActivity : AppCompatActivity()/*,
    IView*/ {
   /* val foodCentralUrl: String
        get() = "https://api.nal.usda.gov/fdc/v1/search?api_key=kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD&generalSearchInput=Milk"
    private val downloader: Downloader = Downloader()*/
/*   private val presenterComponent: IView
    init {
       presenterComponent = PresenterRepository()
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = ProductListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    
/*    fun calculate(view: View){
        val productData: JSONObject
        val product: TextView = findViewById<EditText>(R.id.setFoodName)
        val weight: TextView = findViewById<EditText>(R.id.setWeight)
        val productAsStr: String = product.text.toString()
        val weightAsStr: String = weight.text.toString()
        if(!checkProductData(productAsStr)){
            val intent = Intent(this, SetFoodChemicalCompositionActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, productAsStr)
            }
            startActivity(intent)
        }
        productData = getProductData(productAsStr, weightAsStr)

    }


    override fun checkProductData(product: String): Boolean {
        return presenterComponent.checkProductData(product)
    }

    override fun getProductData(product: String, weight: String): JSONObject {
        return presenterComponent.getProductData(product, weight)
    }

    fun requesting(view: View){
        TODO()
    }*/

/*    fun requesting(view: View){
        val product: TextView = findViewById<EditText>(R.id.testTextView)
        product.text = downloader.getParameters(this)
        val requestQueue = Volley.newRequestQueue(this)
        try {
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET, foodCentralUrl, null, Response.Listener { response ->
                    val food: JSONArray = response.getJSONArray("foods")
                    for(count in 0 until food.length()){
                            product.text = food.getJSONObject(count).optString("ingredients")
                    }
                },
                Response.ErrorListener { product.text = "That didn't work!(" })
            requestQueue.add(jsonObjectRequest)
        }
        catch (exception: Exception){
            product.text = "Alarm!!!Fatal error: ${exception.message}\n exception.stackTrace"
        }
    }*/
}

package com.example.mylittleassistent

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mylittleassistent.core.Downloader
import com.google.gson.Gson
import com.google.gson.JsonArray
import org.json.JSONArray


//Key in FoodData Central: kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD
class MainActivity : AppCompatActivity() {
    val foodCentralUrl: String
        get() = "https://api.nal.usda.gov/fdc/v1/search?api_key=kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD&generalSearchInput=Cheddar%20Cheese"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun calculateCalories(view: View){
        var product: TextView = findViewById<EditText>(R.id.setFoodName)
        var weight: TextView = findViewById<EditText>(R.id.setWeight)
    }
/*    fun calculateCalories(){
        var product: TextView = findViewById<EditText>(R.id.testTextView)
    }*/
    
    fun requesting(view: View){
       // val context: Context = this
        var product: TextView = findViewById<EditText>(R.id.testTextView)
        //val getAnswer: Downloader = Downloader()
       // product.text = getAnswer.downloadData(this)
/*        val requestQueue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET, foodCentralUrl, Response.Listener<String> { response ->
            product.text = "${response}"
        },
            Response.ErrorListener { product.text = "That didn't work!(" })
        requestQueue.add(stringRequest)*/
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
    }
}

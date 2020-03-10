package com.example.mylittleassistent

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mylittleassistent.core.Downloader


//Key in FoodData Central: kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD
class MainActivity : AppCompatActivity() {
    val foodCentralUrl: String
        get() = "https://developer.nrel.gov/api/alt-fuel-stations/v1/nearest.json?api_key=kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD&location=Denver+CO"
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
        val context: Context = this
        var product: TextView = findViewById<EditText>(R.id.testTextView)
        val download: Downloader = Downloader()
        product.text = download.downloadData(context)
/*        val requestQueue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET, foodCentralUrl, Response.Listener<String> { response ->
            product.text = "Response: ${response.substring(0, 100)}"
        },
            Response.ErrorListener { product.text = "That didn't work!(" })
        requestQueue.add(stringRequest)*/
    }
}

package com.example.mylittleassistent.core
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Downloader(): IHttpCore {
    override val token: String
        get() = super.token
    override val foodCentralUrl: String
        get() = super.foodCentralUrl;
    val mainActivity = com.example.mylittleassistent.MainActivity()

    fun downloadData(context: Context): String {
        var test: String
        val requestQueue = Volley.newRequestQueue(context)
        val stringRequest = StringRequest(Request.Method.GET, foodCentralUrl, Response.Listener<String> { response ->
            test =  "Response: ${response.substring(0, 100)}"
        },
        Response.ErrorListener { test = "That didn't work!(" })
        return requestQueue.add(stringRequest).toString()
    }
}
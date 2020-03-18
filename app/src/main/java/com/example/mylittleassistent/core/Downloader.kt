package com.example.mylittleassistent.core
import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.coroutines.GlobalScope
import org.json.JSONArray


class Downloader(): IHttpCore {
    override val token: String
        get() = super.token
    override val foodCentralUrl: String
        get() = super.foodCentralUrl;
    private var downloaderRequest: String = ""

    private fun downloadData(context: Context) {
        val requestQueue = Volley.newRequestQueue(context)
        try {
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET, foodCentralUrl, null, Response.Listener { response ->
                    val food: JSONArray = response.getJSONArray("foods")
                    for(count in 0 until food.length()){
                        downloaderRequest = food.getJSONObject(count).optString("ingredients")
                    }
                },
                Response.ErrorListener { downloaderRequest = "That didn't work!(" })
            requestQueue.add(jsonObjectRequest)
        }
        catch (exception: Exception){
            downloaderRequest = "Alarm!!!Fatal error: ${exception.message}\n exception.stackTrace"
        }
    }

    fun getParameters(context: Context): String {
        //awaitdownloadData(context)
        return downloaderRequest
    }
}
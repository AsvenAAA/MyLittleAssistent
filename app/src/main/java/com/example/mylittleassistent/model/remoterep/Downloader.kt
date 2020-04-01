package com.example.mylittleassistent.model.remoterep
import com.example.mylittleassistent.presenter.IDataChange


class Downloader(): IHttpCore, IDataChange{
    override val token: String
        get() = super.token
    override val foodCentralUrl: String
        get() = super.foodCentralUrl;
    private var data: String = ""
        get() = field
        set(value) {
            field = value
            changeData()
        }
// Нужна отправить сообщение об изменении данных и потом их изменить
    override fun changeData(): String {
        return data
    }

/*    private fun downloadData(context: Context) {
        val requestQueue = Volley.newRequestQueue(context)
        try {
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET, foodCentralUrl, null, Response.Listener { response ->
//                    val food: JSONArray = response.getJSONArray("foodSearchCriteria")
//                    for(count in 0 until food.length()){
//                        downloaderRequest = food.getJSONObject(count).optString("ingredients")
//                    }
                    val food: JSONObject = response.getJSONObject("foodSearchCriteria")
                    data = food.optString("generalSearchInput")
                },
                Response.ErrorListener {  data = "That didn't work!(" })
            requestQueue.add(jsonObjectRequest)
        }
        catch (exception: Exception){
            data = "Alarm!!!Fatal error: ${exception.message}\n exception.stackTrace"
        }
    }

    fun getParameters(context: Context): String {
        val response: Deferred<Unit> = GlobalScope.async {
            downloadData(context)
        }
        GlobalScope.launch { response.await() }
        return data
    }*/
}
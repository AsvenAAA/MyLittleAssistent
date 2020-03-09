package com.example.mylittleassistent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
//Key in FoodData Central: kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun calculateCalories(view: View){
        var product: TextView = findViewById<EditText>(R.id.setFoodName)
        var weight: TextView = findViewById<EditText>(R.id.setWeight)

    }
}

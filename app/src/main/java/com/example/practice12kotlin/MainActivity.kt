package com.example.practice12kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = findViewById<EditText>(R.id.editTextText)
        val b = findViewById<EditText>(R.id.editTextText2)
        val text1 = findViewById<TextView>(R.id.textView1)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val a = a.text.toString().toDoubleOrNull()
            val b = b.text.toString().toDoubleOrNull()
            if (a != null && b != null){
                val hypotenuse = sqrt(a * a + b * b)
                val perimeter = a + b + hypotenuse
                val area = (a * b) / 2
                text1.text=""
                text1.text = """
                    Гипотенуза = $hypotenuse
                    Периметр = $perimeter
                    Площадь = $area
                """.trimIndent()
            }
        }
    }



}

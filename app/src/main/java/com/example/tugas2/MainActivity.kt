package com.example.tugas2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumber = findViewById<EditText>(R.id.inputNumber)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            val numberText = inputNumber.text.toString().trim()
            if (numberText.isNotEmpty()) {
                val number = numberText.toInt()
                val squared = number * number
                textViewResult.text = "Hasil: $squared"
                textViewResult.visibility = View.VISIBLE
            } else {
                textViewResult.text = "Masukkan angka terlebih dahulu"
                textViewResult.visibility = View.VISIBLE
            }
        }
    }
}

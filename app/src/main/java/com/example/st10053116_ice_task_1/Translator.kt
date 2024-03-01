package com.example.st10053116_ice_task_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Translator : AppCompatActivity() {
    private lateinit var englishButton: Button
    private lateinit var spanishButton: Button
    private lateinit var frenchButton: Button
    private lateinit var italianButton: Button
    private lateinit var russianButton: Button
    private lateinit var txtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translator)
        englishButton = findViewById(R.id.englishBtn)
        spanishButton = findViewById(R.id.spanishBtn)
        frenchButton = findViewById(R.id.frenchBtn)
        italianButton = findViewById(R.id.italianBtn)
        russianButton = findViewById(R.id.russianBtn)

        val eng: String = getString(R.string.English)
        val span: String = getString(R.string.Spanish)
        val fren: String = getString(R.string.French)
        val ital: String = getString(R.string.Italian)
        val russ: String = getString(R.string.Russian)

        englishButton.setOnClickListener{txtView.setText(eng)}
        spanishButton.setOnClickListener{txtView.setText(span)}
        frenchButton.setOnClickListener{txtView.setText(fren)}
        italianButton.setOnClickListener{txtView.setText(ital)}
        russianButton.setOnClickListener{txtView.setText(russ)}
    }
}
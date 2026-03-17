package com.example.inputandoutput

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val clickmebutton = findViewById<Button>(R.id.clickmebutton)
        val welcomeText= findViewById<TextView>(R.id.hellotext)
        val nametxtfield = findViewById<TextView>(R.id.nametext)
        val portugueseSwitch = findViewById<Switch>(R.id.Portuguese)


// add code to the button that happens when it is clicked

        clickmebutton?.setOnClickListener {
            var greeting: String
            Toast. makeText(this@MainActivity,
                "Button clicked", Toast.LENGTH_LONG).show()
            if (portugueseSwitch.isChecked) {
                greeting = "Olá,${nametxtfield.text}!"
            } else {
               if (nametxtfield.text.toString()=="Kelsia"){
                greeting = "Heyy,${nametxtfield.text}!"
            } else {
                greeting = "Hello,${nametxtfield.text}!"
               }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
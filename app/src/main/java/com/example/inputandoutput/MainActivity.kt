package com.example.inputandoutput

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    enum class Languages {
        PORTUGUESE,
        FRENCH,
        SPANISH,
        DUTCH,
        MANDARIM,
        POLISH,
        RUSSIAN,
        ARABIC

    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val clickmebutton = findViewById<Button>(R.id.clickmebutton)
        val welcomeText= findViewById<TextView>(R.id.hellotext)
        val nametxtfield = findViewById<TextView>(R.id.nametext)
        val portugueseSwitch = findViewById<Switch>(R.id.Portuguese)
        val languageSpinner = findViewById<Spinner>(R.id.languageSpinner)
         

// add code to the button that happens when it is clicked

        clickmebutton?.setOnClickListener {
            var greeting: String= ""
            var portuguese: Boolean = portugueseSwitch.isChecked
            var age : Int = 19

//
//            Toast. makeText(this@MainActivity,
//                "Button clicked", Toast.LENGTH_LONG).show()
//
//            if (portugueseSwitch.isChecked) {
//                greeting = "Olá,${nametxtfield.text}!"
//            } else {
 //             if ((nametxtfield.text.toString()=="Kelsia"  ||
//                    nametxtfield.text.toString()=="Giovetty")
//                   && age>18){
//                greeting = "Heyy,${nametxtfield.text}!"
//            } else {
//                greeting = "Hello,${nametxtfield.text}!"
//               }
//        }
//            welcomeText.text= greeting
}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
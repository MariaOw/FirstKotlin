package com.example.firstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var textName:TextView
    lateinit var buttonName:Button
    lateinit var buttonAdd:Button
    lateinit var txtField:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textName = findViewById(R.id.txtShowName)
        buttonName = findViewById(R.id.btnShowName)
        buttonAdd = findViewById(R.id.btnAdd)
        txtField = findViewById(R.id.txtbxAdd)



        val arrNames = arrayListOf<String>("Koko", "Tala", "Athena")



        textName.isVisible = false
//        buttonName.isActivated = false


        buttonAdd.setOnClickListener {
            val txtAddedName = txtField.text

            if (txtAddedName.toString().isBlank()) {
                Toast.makeText(this, "Bawal", Toast.LENGTH_SHORT).show()
            } else if (arrNames.contains(txtAddedName.toString())){
                Toast.makeText(this, "Bawal. Meron na", Toast.LENGTH_SHORT).show()
            } else {
                arrNames.add(txtAddedName.toString())
                Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show()
            }
        }

        buttonName.setOnClickListener {
            val rndomName = arrNames.random()
            textName.isVisible = true
            textName.text = rndomName
        }

    }

}


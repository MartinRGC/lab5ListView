package com.example.lab5listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var arrSO = arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.lsvSO) as ListView

        val adaptor: Any? =
            ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)
        lsvSistemasOperativos.adapter = adaptor as ListAdapter?

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            println("Aqui s emuestra msg al user")
            Toast.makeText(
                applicationContext,
                "Posición: $position",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
package com.example.tp04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewFruits)

        val fruits = listOf(
            Fruit("Banane", 89, R.drawable.banana),
            Fruit("Pomme", 52, R.drawable.apple),
            Fruit("Orange", 43, R.drawable.orange),
            Fruit("Kiwi", 41, R.drawable.kiwi),
            Fruit("Ananas", 50, R.drawable.pineapple)
        )

        val adapter = FruitAdapter(this, R.layout.fruit_item, fruits)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val fruit = fruits[position]
            Toast.makeText(this, "Vous avez choisi ${fruit.name}", Toast.LENGTH_SHORT).show()
        }
    }
}

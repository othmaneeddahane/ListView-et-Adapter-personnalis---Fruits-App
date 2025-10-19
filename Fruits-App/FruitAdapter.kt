package com.example.tp04

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.LayoutRes

class FruitAdapter(
    private val context: Context,
    @LayoutRes private val layoutRes: Int,
    private val fruits: List<Fruit>
) : ArrayAdapter<Fruit>(context, layoutRes, fruits) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(layoutRes, parent, false)

        val fruit = fruits[position]
        val img = view.findViewById<ImageView>(R.id.fruitImageView)
        val name = view.findViewById<TextView>(R.id.fruitNameTextView)
        val calories = view.findViewById<TextView>(R.id.txtCalories)

        img.setImageResource(fruit.imageResId)
        name.text = fruit.name
        calories.text = "${fruit.calories} calories"

        return view
    }
}

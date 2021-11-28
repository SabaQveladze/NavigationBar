package com.example.navigationbar.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.navigationbar.R

import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import kotlin.random.Random

class fragmentFour:Fragment(R.layout.fragment_four) {
    lateinit var colorButton: Button

    lateinit var constraintLayout: ConstraintLayout
    val colors = arrayOf(Color.BLACK, Color.BLUE,Color.CYAN,Color.DKGRAY,Color.GREEN,Color.MAGENTA,Color.YELLOW,Color.RED)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        colorButton=view.findViewById(R.id.colorButton)
        constraintLayout=view.findViewById(R.id.constraint)

        colorButton.setOnClickListener{
            val randomIndex = Random.nextInt(colors.size);
            constraintLayout.setBackgroundColor(colors[randomIndex])
        }
    }
}
package com.e.bartroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var bartImage: ImageView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bartImage = findViewById(R.id.bart_image)
        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollImage()
        }
    }

    private fun rollImage() {
        val randomInt = Random.nextInt(5)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.bart_dancing
            2 -> R.drawable.bart_slingshot
            3 -> R.drawable.bart_skateboard
            4 -> R.drawable.bart_falling
            else -> R.drawable.bart_smiling
        }

        // Accessibility image descriptions
        val imageDescription = when (randomInt) {
            1 -> "Bart Dancing"
            2 -> "Bart Slingshot"
            3 -> "Bart Skateboard"
            4 -> "Bart Falling"
            else -> "Bart Smiling"
        }
        bartImage.setImageResource(drawableResource)
        bartImage.contentDescription = imageDescription
    }
}

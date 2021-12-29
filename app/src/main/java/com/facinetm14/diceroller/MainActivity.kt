package com.facinetm14.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btn_roll)
        val imgDice : ImageView = findViewById(R.id.img_dice)
        val listOfImages = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
            )

        btnRoll.setOnClickListener {
            val dice = Dice(6)
            val numberRolled = dice.rollNumber()
            imgDice.setImageResource(listOfImages[numberRolled-1])

            // Showing the short message
            val myToast : Toast = Toast.makeText(this,"Dice rolled", Toast.LENGTH_SHORT)
            myToast.show()
        }

    }
}
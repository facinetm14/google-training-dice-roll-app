package com.facinetm14.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btn_roll);
        var imgDice : ImageView = findViewById(R.id.img_dice);

        btnRoll.setOnClickListener {
            val dice = Dice(6);
            dice.roll(imgDice);
            val myToast = Toast.makeText(this, "dice rolled", Toast.LENGTH_SHORT);
            myToast.show();
        }

    }
}

class Dice (private val sides : Int) {

    fun roll(imgDice: ImageView) {

        when((1..sides).random()) {
            1-> imgDice.setImageResource(R.drawable.dice_1);
            2-> imgDice.setImageResource(R.drawable.dice_1);
            3-> imgDice.setImageResource(R.drawable.dice_1);
            4-> imgDice.setImageResource(R.drawable.dice_1);
            5-> imgDice.setImageResource(R.drawable.dice_1);
            6-> imgDice.setImageResource(R.drawable.dice_1);

        }
    }


}
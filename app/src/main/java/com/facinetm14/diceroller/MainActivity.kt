package com.facinetm14.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btn_roll);
        var textRolled : TextView = findViewById(R.id.text_rolled);

        btnRoll.setOnClickListener {
            val dice = Dice(6);
            textRolled.text = "${dice.roll()}";
            val myToast = Toast.makeText(this, "dice rolled", Toast.LENGTH_SHORT);
            myToast.show();
        }

    }
}

class Dice (val sides : Int) {

    fun roll() : Int{
        return (1..sides).random();
    }

}
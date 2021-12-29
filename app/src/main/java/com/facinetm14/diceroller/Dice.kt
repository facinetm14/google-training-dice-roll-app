package com.facinetm14.diceroller

class Dice (private val sidesCount : Int) {

     fun rollNumber() : Int {
        return (1..sidesCount).random();
    }

}
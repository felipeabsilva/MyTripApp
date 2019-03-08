package com.felipesilva.mytrip

import android.widget.EditText

class MainModel() {
    fun isValid(editText: EditText) : Boolean {
        return editText.text.toString() != "" && editText.text.toString() != "0"
    }

    fun handleCalculate(distance: Float, price: Float, autonomy: Float): Float = (distance*price)/autonomy
}
package com.felipesilva.mytrip

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainPresenter(val mainView: MainActivity) {
    val mainModel = MainModel()

    fun handleCalculate() {
        if (mainModel.isValid(mainView.edtAutonomy) && mainModel.isValid(mainView.edtDistance) && mainModel.isValid(mainView.edtPrice)) {
            try {
                val distance = mainView.edtDistance.text.toString().toFloat()
                val price = mainView.edtPrice.text.toString().toFloat()
                val autonomy = mainView.edtAutonomy.text.toString().toFloat()

                val result = mainModel.handleCalculate(distance, price, autonomy)

                mainView.txtResult.setText("R$ $result")

            } catch (numberFormatException: NumberFormatException) {
                Toast.makeText(mainView.applicationContext, mainView.applicationContext.getString(R.string.erro_valores_validos), Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(mainView.applicationContext, mainView.applicationContext.getString(R.string.erro_valores_validos), Toast.LENGTH_LONG).show()
        }
    }
}
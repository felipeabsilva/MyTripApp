package com.felipesilva.mytrip

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val mainPresenter = MainPresenter(this)

    override fun onClick(view: View) {
        val id = view.id

        if (id === R.id.btnCalculate) {
            mainPresenter.handleCalculate()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculate.setOnClickListener(this)
    }
}

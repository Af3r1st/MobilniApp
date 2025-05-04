package com.levurda.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.levurda.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    var number : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        enableEdgeToEdge()
        setContentView(view)

        mainBinding.textViewResult.text ="0"


        mainBinding.btnZero.setOnClickListener{
            onNumberClicked("0")
        }
        mainBinding.btnOne.setOnClickListener{
            onNumberClicked("1")
        }
        mainBinding.btnTwo.setOnClickListener{
            onNumberClicked("2")
        }
        mainBinding.btnThree.setOnClickListener{
            onNumberClicked("3")
        }
        mainBinding.btnFour.setOnClickListener{
            onNumberClicked("4")
        }
        mainBinding.btnFive.setOnClickListener{
            onNumberClicked("5")
        }
        mainBinding.btnSix.setOnClickListener{
            onNumberClicked("6")
        }
        mainBinding.btnSeven.setOnClickListener{
            onNumberClicked("7")
        }
        mainBinding.btnEight.setOnClickListener{
            onNumberClicked("8")
        }
        mainBinding.btnNine.setOnClickListener{
            onNumberClicked("9")
        }


    }
    fun onNumberClicked(clickedNumber: String){
        if (number == null){
            number = clickedNumber
        }else{
            number += clickedNumber
        }
        mainBinding.textViewResult.text = number
    }
}
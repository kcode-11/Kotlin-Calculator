package com.komal.kotlincalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.komal.kotlincalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Made changes

        binding.buttonAC.setOnClickListener {
            binding.input.text=""
            binding.result.text=""
        }
        binding.button0.setOnClickListener {
            binding.input.append("0")
        }
        binding.button1.setOnClickListener {
            binding.input.append("1")
        }
        binding.button2.setOnClickListener {

            binding.input.append("2")
        }
        binding.button3.setOnClickListener {

            binding.input.append("3")
        }
        binding.button4.setOnClickListener {

            binding.input.append("4")
        }
        binding.button5.setOnClickListener {

            binding.input.append("5")
        }
        binding.button6.setOnClickListener {

            binding.input.append("6")
        }
        binding.button7.setOnClickListener {

            binding.input.append("7")
        }
        binding.button8.setOnClickListener {

            binding.input.append("8")
        }
        binding.button9.setOnClickListener {

            binding.input.append("9")
        }
        binding.buttonSum.setOnClickListener{
            binding.input.append("+")
        }
        binding.buttonDiff.setOnClickListener{
            binding.input.append("-")
        }
        binding.buttonPro.setOnClickListener{
            binding.input.append("*")
        }
        binding.buttonDiv.setOnClickListener{
            binding.input.append("/")
        }
        binding.buttonPoint.setOnClickListener{
            binding.input.append(".")
        }
        binding.buttonPer.setOnClickListener{
            binding.input.append("(")
        }
        binding.buttonPower.setOnClickListener{
            binding.input.append(")")
        }
        fun clearLastDigit() {
            val text = binding.input.text.toString()
            if (text.isNotEmpty()) {
                binding.input.text = text.dropLast(1) // Remove last character
            }
        }
        binding.buttonC.setOnClickListener {
            clearLastDigit()
        }

        binding.buttonEqual.setOnClickListener{
            val expression=ExpressionBuilder(binding.input.text.toString()).build() //EXPRESSION BUILDER LIBRARY EVaLUATE MATHEMATICAL EXPRESSION
            val result=expression.evaluate() //BUIlD CONVERT IN THE FORM THAT CAN BE EVALUATED
            val longresult=result.toLong() //CONVERTS 11.0->11
            if(result==longresult.toDouble()){  //CHECK IF WHOLE NUMBER //11.5==->11.0->11->11.0 //FALSE THEN ELSE PART
                binding.result.text=longresult.toString()   //11.0==->11->11.0 //true
            }else{
                binding.result.text=result.toString()
            }
        }
    }
}
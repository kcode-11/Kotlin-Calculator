package com.komal.kotlincalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.komal.kotlincalculator.databinding.ActivityMainBinding

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
            binding.input.text="0"
            binding.input.append("0")
        }
        binding.button1.setOnClickListener {
            binding.input.text="1"
            binding.input.append("1")
        }
        binding.button2.setOnClickListener {
            binding.input.text="2"
            binding.input.append("2")
        }
        binding.button3.setOnClickListener {
            binding.input.text="3"
            binding.input.append("3")
        }
        binding.button4.setOnClickListener {
            binding.input.text="4"
            binding.input.append("4")
        }
        binding.button5.setOnClickListener {
            binding.input.text="5"
            binding.input.append("5")
        }
        binding.button6.setOnClickListener {
            binding.input.text="6"
            binding.input.append("6")
        }
        binding.button7.setOnClickListener {
            binding.input.text="7"
            binding.input.append("7")
        }
        binding.button8.setOnClickListener {
            binding.input.text="8"
            binding.input.append("8")
        }
        binding.button9.setOnClickListener {
            binding.input.text="9"
            binding.input.append("9")
        }

    }
}
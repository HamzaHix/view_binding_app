package com.hixman.viewbindingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hixman.viewbindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var index = 0
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // here we define the instance of the binding class
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // use the instance of the binding class to reference any of the views
        binding.tvHi.text = "Hello World!"
        binding.btnSayHi.setOnClickListener {

            // this is just an action i want to add it here :)
            if (index == 0){
                binding.btnSayHi.text = "say hi"
                binding.tvHi.text = "Hi coders"
                binding.tvHi.setTextColor(R.color.red)
                index++
            }else if (index == 1){
                binding.tvHi.text = "i'm a cool coder and i'm the best love you :)"
                binding.btnSayHi.text = "say other thing"
                binding.tvHi.setTextColor(R.color.purple_700)
                index--
            }
        }

    }
}
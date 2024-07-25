package com.example.bai15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bai15.databinding.ActivityMainBinding
import com.example.bai15.databinding.ActivitySecondScreenBinding

private lateinit var binding: ActivitySecondScreenBinding
class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
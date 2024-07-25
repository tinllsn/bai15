package com.example.bai15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bai15.databinding.ActivitySecondScreenBinding
import com.example.bai15.databinding.ActivityThirdScreenBinding

private  lateinit var binding: ActivityThirdScreenBinding
class ThirdScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
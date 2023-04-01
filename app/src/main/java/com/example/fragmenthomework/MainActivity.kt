package com.example.fragmenthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.fragmenthomework.databinding.ActivityMainBinding
import javax.xml.datatype.Duration

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splashFragment = supportFragmentManager.beginTransaction()
        splashFragment.add(R.id.main, SplashFragment())
        splashFragment.commit()

        Handler(Looper.getMainLooper()).postDelayed({
            val pinCodeFragment = supportFragmentManager.beginTransaction()
            pinCodeFragment.replace(R.id.main, PinCodeFragment())
            pinCodeFragment.commit()
        }, 3000)

    }
}
package com.example.modulediscovery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mylibrary.Verify

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pair = Verify.isPurchased(this, "com.example.nova.prosalud")

        Toast.makeText(this, pair.second + pair.first.toString(), Toast.LENGTH_LONG).show()
    }
}
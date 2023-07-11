package com.leaphorizon.androidtoaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.leaphorizon.toaster.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvDisplayToast).setOnClickListener {
            Toaster.displayToast("This is a sample toast", this, Toast.LENGTH_SHORT)
        }

    }
}
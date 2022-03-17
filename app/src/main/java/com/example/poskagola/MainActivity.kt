package com.example.poskagola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = findViewById<RadioButton>(R.id.tak)
        val n = findViewById<RadioButton>(R.id.nie)
        val x = findViewById<RadioButton>(R.id.x)
        val y = findViewById<RadioButton>(R.id.y)
        val v = findViewById<RadioButton>(R.id.v)
        val z = findViewById<RadioButton>(R.id.z)
        val a = findViewById<RadioButton>(R.id.a)
        val b = findViewById<RadioButton>(R.id.b)
        val c = findViewById<RadioButton>(R.id.c)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (t.isChecked) {
                findViewById<TextView>(R.id.textView).text = "tak"
            }
            if (n.isChecked) {
                findViewById<TextView>(R.id.textView).text = "nie"
            }
            if (x.isChecked) {
                findViewById<TextView>(R.id.textView2).text = "x"
            }
            if (y.isChecked) {
                findViewById<TextView>(R.id.textView2).text = "y"
            }
            if (v.isChecked) {
                findViewById<TextView>(R.id.textView3).text = "v"
            }
            if (z.isChecked) {
                findViewById<TextView>(R.id.textView3).text = "z"
            }
            if (z.isChecked) {
                findViewById<TextView>(R.id.textView3).text = "a"
            }
            if (b.isChecked) {
                findViewById<TextView>(R.id.textView3).text = "b"
            }
            if (c.isChecked) {
                findViewById<TextView>(R.id.textView3).text = "c"
            }
        }



    }



    }

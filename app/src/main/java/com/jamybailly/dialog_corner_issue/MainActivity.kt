package com.jamybailly.dialog_corner_issue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_open_dialog.setOnClickListener {
            DialogSample().show(supportFragmentManager, "dialog_sample")
        }
    }
}
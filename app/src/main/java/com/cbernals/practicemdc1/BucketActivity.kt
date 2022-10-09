package com.cbernals.practicemdc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.cbernals.practicemdc1.utils.Helper

class BucketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bucket)

        val message = intent.getStringExtra(Helper.EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.tv_text).apply {
            text = message
        }
    }
}
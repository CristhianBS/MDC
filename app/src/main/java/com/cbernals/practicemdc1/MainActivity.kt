package com.cbernals.practicemdc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cbernals.practicemdc1.adapters.BucketAdapter
import com.cbernals.practicemdc1.utils.Bucket

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.rv_buckets)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerView.adapter = BucketAdapter(bucketsListMock)
    }
}

val bucketsListMock = listOf(
    Bucket(text = "Illustration", color = "BLACK"),
    Bucket(text = "Interface", color = "CYAN"),
    Bucket(text = "Web Designer", color = "GREEN"),
    Bucket(text = "Marry", color = "MAGENTA"),
    Bucket(text = "Iphone", color = "YELLOW"),
    Bucket(text = "Copy", color = "WHITE"),
    Bucket(text = "Dribble", color = "CYAN"),
    Bucket(text = "Design Apps", color = "GREEN"),
    Bucket(text = "Moviles", color = "MAGENTA"),
    Bucket(text = "Soccer", color = "BLACK"),
    Bucket(text = "Interface", color = "CYAN"),
    Bucket(text = "Marry", color = "WHITE"),
    Bucket(text = "Copy", color = "CYAN"),
    Bucket(text = "Iphone", color = "GREEN"),
)
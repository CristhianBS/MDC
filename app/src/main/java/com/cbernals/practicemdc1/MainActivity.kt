package com.cbernals.practicemdc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cbernals.practicemdc1.adapters.BucketAdapter
import com.cbernals.practicemdc1.adapters.ShotAdapter
import com.cbernals.practicemdc1.utils.Bucket
import com.cbernals.practicemdc1.utils.Shot

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBucketsRecyclerView()
        initShotsRecyclerView()
    }

    private fun initBucketsRecyclerView(){
        val bucketsRecyclerView = findViewById<RecyclerView>(R.id.rv_buckets)
        bucketsRecyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        bucketsRecyclerView.adapter = BucketAdapter(bucketsListMock)
    }

    private fun initShotsRecyclerView(){
        val shotsRecyclerView = findViewById<RecyclerView>(R.id.rv_shots)
        shotsRecyclerView.layoutManager = GridLayoutManager(this, 2)
        shotsRecyclerView.adapter = ShotAdapter(shotsListMock)
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

val shotsListMock = listOf(
    Shot(image = R.drawable.ic_airplanemode, color = "BLACK"),
    Shot(image = R.drawable.ic_bug, color = "CYAN"),
    Shot(image = R.drawable.ic_alarm, color = "GREEN"),
    Shot(image = R.drawable.ic_person, color = "MAGENTA"),
    Shot(image = R.drawable.ic_person, color = "YELLOW"),
    Shot(image = R.drawable.ic_airplanemode, color = "WHITE"),
    Shot(image = R.drawable.ic_alarm, color = "CYAN"),
    Shot(image = R.drawable.ic_airplanemode, color = "GREEN"),
    Shot(image = R.drawable.ic_alarm, color = "MAGENTA"),
    Shot(image = R.drawable.ic_bug, color = "BLACK"),
    Shot(image = R.drawable.ic_person, color = "CYAN"),
    Shot(image = R.drawable.ic_airplanemode, color = "WHITE"),
    Shot(image = R.drawable.ic_bug, color = "CYAN"),
    Shot(image = R.drawable.ic_alarm, color = "GREEN"),
)
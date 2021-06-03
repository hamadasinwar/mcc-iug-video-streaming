package com.hamada.sinwar.mcc.iug.videoStreaming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, VideoPlayerActivity::class.java)

        video1.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
            startActivity(intent)
        }

        video2.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
            startActivity(intent)
        }

        video3.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"
            startActivity(intent)
        }

        video4.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"
            startActivity(intent)
        }
    }

}


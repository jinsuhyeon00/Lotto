package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        Toast.makeText(this,"Result Activity", Toast.LENGTH_LONG).show()


        val result = intent.getIntegerArrayListExtra("result")

        val result_sorted = result?.sorted()

        val lottoBallImageStartId = R.drawable.ball_01
/*        val lottoBallImageId2 = R.drawable.ball_02 // 150
        val lottoBallImageId3 = R.drawable.ball_03 // 148*/
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoBallImageStartId + result_sorted!![0] - 1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)

    }
    private fun updateLottoBallImages(result_sorted : List<Int>) {
        val lottoImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoImageStartId + result_sorted?.get(0)!! - 1)
        imageView2.setImageResource(lottoImageStartId + result_sorted?.get(1) - 1)
        imageView3.setImageResource(lottoImageStartId + result_sorted?.get(2) - 1)
        imageView4.setImageResource(lottoImageStartId + result_sorted?.get(3) - 1)
        imageView5.setImageResource(lottoImageStartId + result_sorted?.get(4) - 1)
        imageView6.setImageResource(lottoImageStartId + result_sorted?.get(5) - 1)
    }
}
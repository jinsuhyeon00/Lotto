package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber () : Int{
    return Random().nextInt(45)+1
}


fun getRandomLottoNumbers(): MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()
/*
for (i in 1..6) {
    var number = 0
    do {
        number = getRandomLottoNumber()
    } while (lottoNumbers.contains(number))
    lottoNumbers.add(number)
}
return lottoNumbers
}
*/

while(true){
    val number = getRandomLottoNumber()
    var flag_exist = 0

    if(lottoNumbers.size < 1){
        lottoNumbers.add(number)
        continue
    }
    else {
        for (j in 0 until lottoNumbers.size) {
            if (number == lottoNumbers[j]) {
                flag_exist = 1
                break
            }
        }
        if (flag_exist == 0)
            lottoNumbers.add(number)
        if (lottoNumbers.size >= 6)
            break
    }
}
return lottoNumbers
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Main Activity", Toast.LENGTH_LONG).show()

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        cardRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(Intent(this, ResultActivity::class.java))

        }
        findViewById<View>(R.id.cardConstell).setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        findViewById<View>(R.id.cardName).setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }

    }
}
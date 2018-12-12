package com.example.mzaimilzam.cekpertama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    /* inisiasi String diceImage -> ImageView */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.but_roll)
        rollbutton.setOnClickListener {
            rolldice()

            /* membuat fungsi baru untuk merandom dice bi private fun di bawah */
        }

        diceImage = findViewById(R.id.dice_image)
        /* membuat diceImage memanngil id: dice_image xml */
        /* inisiasinya ada di atas */
        /* agar mengurangin pemanggilan ID yang menguras resource HP */
    }

    private fun rolldice() {
        val resulttext: TextView = findViewById(R.id.result)

        val randomdice = Random().nextInt(6) + 1
        val drawableRes = when (randomdice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
        /* percabangan untuk dice agar sesuai dengan gambar dice yang muncul */

        diceImage.setImageResource(drawableRes)
        /* result berbentuk gambar */
        /* connect gambar dengan urutan dice dari when-else */

        resulttext.text = randomdice.toString()
        /* result berbentuk text  */
    }
}

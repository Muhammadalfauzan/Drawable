package com.fauzan.drawable

import  android.content.Intent
/*import android.media.Image*/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var sb : SeekBar? = null
    var iv : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv = findViewById<View>(R.id.image) as ImageView
        sb = findViewById<View>(R.id.seekbar2) as SeekBar

        val pindah = findViewById<Button>(R.id.btn_vector)

        sb!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val scale =  progress / 10.0f +1
                iv!!.scaleX = scale
                iv!!.scaleY = scale

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}

        })
        pindah.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_vector -> {
                val pindahVector = Intent(this@MainActivity, HalamanVector::class.java)
                startActivity(pindahVector)
            }

        }
    }
}
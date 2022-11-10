package com.fauzan.drawable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar

class HalamanVector : AppCompatActivity() {
    var sb: SeekBar? = null
    var iv: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halamanvector)
        iv = findViewById<View>(R.id.image3) as ImageView
        sb = findViewById<View>(R.id.seekBar) as SeekBar
        sb!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, b: Boolean) {
                val scale = progress / 10.0f + 1
                iv!!.scaleX = scale
                iv!!.scaleY = scale
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }
}
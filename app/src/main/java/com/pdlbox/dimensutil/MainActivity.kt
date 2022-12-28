package com.pdlbox.dimensutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //代码中设置尺寸
        R.dimen.dp_50
        R.dimen.sp_10

    }
}
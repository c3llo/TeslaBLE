package com.c3llo.teslarelayble

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.c3llo.teslarelayble.Common.Constant

class ShortCutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        
        when (intent.action) {
            Constant.ACTION_BLE_ON -> {
                Toast.makeText(this, "BLE ON", Toast.LENGTH_SHORT).show()
            }

            Constant.ACTION_BLE_OFF -> {
                Toast.makeText(this, "BLE OFF", Toast.LENGTH_SHORT).show()
            }
        }
        finish()
    }
}
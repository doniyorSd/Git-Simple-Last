package com.example.gitsimplelast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.git_simple_last.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        ToastMessage.toastMessage(this,"hello")
    }
}
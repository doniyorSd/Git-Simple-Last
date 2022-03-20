package com.example.git_simple_last

import android.content.Context
import android.widget.Toast

object ToastMessage {
    fun toastMessage(context: Context,message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
package com.leaphorizon.toaster

import android.content.Context
import android.widget.Toast

object Toaster {

    fun displayToast(message: String, context: Context, duration: Int) {
        Toast.makeText(context, message, duration).show()
    }

}
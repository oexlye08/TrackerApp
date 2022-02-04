package id.my.okisulton.trackerapp.misc

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 *Created by osalimi on 25-01-2022.
 **/
class MasterFunction {
    fun showLog(TAG: String, message: String) {
        Log.d(TAG, "showLog: $message")
    }

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
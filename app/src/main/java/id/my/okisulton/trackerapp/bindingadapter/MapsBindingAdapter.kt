package id.my.okisulton.trackerapp.bindingadapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.BindingAdapter

/**
 *Created by osalimi on 02-02-2022.
 **/
class MapsBindingAdapter {
    companion object {
        @BindingAdapter("observeTracking")
        @JvmStatic
        fun observeTracking(view: View, started: Boolean) {
            if (started && view is Button) {
                view.visibility = View.VISIBLE
            } else if (started && view is TextView) {
                view.visibility = View.INVISIBLE
            }
        }
    }
}
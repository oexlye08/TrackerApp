package id.my.okisulton.trackerapp.util

import android.view.View
import android.widget.Button

/**
 *Created by osalimi on 25-01-2022.
 **/
object ExtensionFunctions {
    fun View.show() {
        this.visibility = View.VISIBLE
    }

    fun View.hide() {
        this.visibility = View.INVISIBLE
    }

    fun Button.enable() {
        this.isEnabled = true
    }

    fun Button.disable() {
        this.isEnabled = false
    }
}
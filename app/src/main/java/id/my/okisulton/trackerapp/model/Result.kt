package id.my.okisulton.trackerapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 *Created by osalimi on 03-02-2022.
 **/
@Parcelize
data class Result(
    var distance: String,
    var time: String
): Parcelable

package com.dicoding.project.Activities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class TransportItem(
    val name: String,
    val description: String,
    val photo: Int,
    val detail: String
): Parcelable

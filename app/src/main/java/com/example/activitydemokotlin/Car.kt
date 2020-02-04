package com.example.activitydemokotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Car(var make: String,
               var model: String,
               var year: String,
               var color: String) :
    Parcelable

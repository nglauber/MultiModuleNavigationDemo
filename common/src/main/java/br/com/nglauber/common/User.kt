package br.com.nglauber.common

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val id: Long, val name: String) : Parcelable
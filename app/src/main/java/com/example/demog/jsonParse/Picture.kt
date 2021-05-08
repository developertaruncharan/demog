package com.example.demog.jsonParse


import com.google.gson.annotations.SerializedName

data class Picture(
    val large: String,
    val medium: String,
    val thumbnail: String
)
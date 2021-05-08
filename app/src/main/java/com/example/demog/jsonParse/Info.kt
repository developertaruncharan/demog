package com.example.demog.jsonParse


import com.google.gson.annotations.SerializedName

data class Info(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)
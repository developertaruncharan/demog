package com.example.demog.jsonParse


import com.google.gson.annotations.SerializedName

data class JsonParsedData(
    val info: Info,
    val results: List<Result>
)
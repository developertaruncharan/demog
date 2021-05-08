package com.example.demog.jsonParse


import com.google.gson.annotations.SerializedName

data class Timezone(
    val description: String,
    val offset: String
)
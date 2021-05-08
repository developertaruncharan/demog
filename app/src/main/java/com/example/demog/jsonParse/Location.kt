package com.example.demog.jsonParse


import com.google.gson.annotations.SerializedName

data class Location(
    val city: String,
    val coordinates: Coordinates,
    val country: String,
    val postcode: Any,
    val state: String,
    val street: Street,
    val timezone: Timezone
)
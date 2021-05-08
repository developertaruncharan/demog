package com.example.demog

import com.example.demog.jsonParse.JsonParsedData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL="https://randomuser.me/api/"

interface fetchingData {
    @GET("?results=100")
    fun getData():Call<JsonParsedData>

    companion object{
        operator fun invoke():fetchingData{
            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
                .create(fetchingData::class.java)
        }
    }
}
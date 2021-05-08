package com.example.demog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demog.jsonParse.JsonParsedData
import com.example.demog.jsonParse.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: JsonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fetchingData().getData().enqueue(object:Callback<JsonParsedData>{
            override fun onResponse(call: Call<JsonParsedData>, response: Response<JsonParsedData>) {
                val data= response.body()?.results
                if (data != null) {
                    show(data)
                }
                }
            override fun onFailure(call: Call<JsonParsedData>, t: Throwable) {
                Toast.makeText(applicationContext,t.message,Toast.LENGTH_LONG).show()
            }
        })
    }
    private fun show(data:List<Result>){
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        adapter = JsonAdapter(data)
        recyclerView.adapter = adapter
    }
}
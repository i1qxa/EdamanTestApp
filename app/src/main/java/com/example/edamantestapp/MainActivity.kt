package com.example.edamantestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.edamantestapp.data.remoteData.RetrofitService
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofit = RetrofitService.getInstance()
        GlobalScope.launch(Dispatchers.IO) {
            val response = retrofit.getRecipeResponse(
                "public",
                "pig",
                RetrofitService.appId,
                RetrofitService.appKey)
            if (response.isSuccessful){
                var a = response
            }
            else{
                var b = response.errorBody()
            }
        }
    }
}
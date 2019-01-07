package com.example.joe.cvappchallenge.remote

import com.example.joe.cvappchallenge.models.ApiRespone
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RemoteService {
@GET("fd07c48767775a1f6e83a461d93b8ddb/raw/e1116fe11da989021b2595b1f1b02159ad00095b/CV-JoeYada")
fun getCV(@Query("name") name:String):Single<ApiRespone>
}
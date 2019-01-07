package com.example.joe.cvappchallenge.models

import com.google.gson.annotations.SerializedName

data class CareerSummary(@SerializedName("from") val from:String,
                         @SerializedName("to") val to:String,
                         @SerializedName("outline") val outline:String,
                         @SerializedName("key_responsibilities") val keyResponsibilites: List<String>)
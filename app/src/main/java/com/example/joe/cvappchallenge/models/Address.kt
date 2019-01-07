package com.example.joe.cvappchallenge.models

import com.google.gson.annotations.SerializedName

data class Address(@SerializedName("street") val street:String,
                   @SerializedName("town") val town:String,
                   @SerializedName("post_code") val postCode:String)
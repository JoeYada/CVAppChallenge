package com.example.joe.cvappchallenge.models

import com.google.gson.annotations.SerializedName

data class ApiRespone(@SerializedName("sampleCvs") val sampleCvs: List<SampleCv>)
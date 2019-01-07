package com.example.joe.cvappchallenge.models

import com.google.gson.annotations.SerializedName

data class SampleCv(@SerializedName("name") val name:String,
                    @SerializedName("email") val email:String,
                    @SerializedName("phone_number") val phoneNumber:String,
                    @SerializedName("address") val address: Address,
                    @SerializedName("profile") val profile:String,
                    @SerializedName("core_skills") val coreSkills:List<String>,
                    @SerializedName("career_summary") val careerSummary: List<CareerSummary>,
                    @SerializedName("education_qualifications") val educationQualifications:List<String>,
                    @SerializedName("references") val references:List<String>)
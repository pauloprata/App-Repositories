package com.example.apprepositories.data.model

import com.example.apprepositories.data.model.Owner
import com.google.gson.annotations.SerializedName

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language: String,
    @SerializedName("html_url")
    val htmlURL: String,
    val description: String
)
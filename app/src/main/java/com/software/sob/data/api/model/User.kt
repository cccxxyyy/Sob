package com.software.sob.data.api.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("phoneNum")
    val phoneNum: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("nickname")
    val nickname: String=""
)

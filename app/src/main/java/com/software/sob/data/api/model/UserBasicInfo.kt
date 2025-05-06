package com.software.sob.data.api.model

import com.google.gson.annotations.SerializedName
import com.software.sob.util.Constants.DEFAULT_AVATAR_URL


data class UserBasicInfo(
    @JvmField
    @SerializedName("avatar")
    val avatar: String = DEFAULT_AVATAR_URL,
    @JvmField
    @SerializedName("fansCount")
    val fansCount: Int = 0,
    @JvmField
    @SerializedName("followCount")
    val followCount: Int = 0,
    @JvmField
    @SerializedName("id")
    val id: String = "",
    @JvmField
    @SerializedName("isVip")
    val isVip: String = "0",
    @JvmField
    @SerializedName("lev")
    val lev: Int = 0,
    @JvmField
    @SerializedName("nickname")
    val nickname: String = "",
    @JvmField
    @SerializedName("roles")
    val roles: String = "",
    @JvmField
    @SerializedName("token")
    val token: String = ""
)
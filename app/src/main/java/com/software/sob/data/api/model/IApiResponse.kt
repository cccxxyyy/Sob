package com.software.sob.data.api.model

interface IApiResponse<T> {

    fun getCode(): Int

    fun isSuccess(): Boolean

    fun getMessage(): String

    fun getData(): T
}
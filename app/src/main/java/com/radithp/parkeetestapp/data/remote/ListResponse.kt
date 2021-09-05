package com.radithp.parkeetestapp.data.remote

import com.google.gson.annotations.SerializedName

class ListResponse<T> (
    @SerializedName("status_message")
    val statusMessage: String? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null,
    @SerializedName("results")
    val result: List<T>? = null
)


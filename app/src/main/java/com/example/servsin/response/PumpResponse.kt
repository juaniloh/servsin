package com.example.servsin.response

import com.example.servsin.data.PumpSettings

sealed class PumpResponse() {
    data class Success(val pumps: List<PumpSettings>): PumpResponse()
    data class Failure(val error:Throwable): PumpResponse()
    object Loading: PumpResponse()
}
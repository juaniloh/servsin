package com.example.servsin.repository

import com.example.servsin.response.PumpResponse

interface PumpRepository {
    suspend fun fetchPumpBySite(): PumpResponse
}
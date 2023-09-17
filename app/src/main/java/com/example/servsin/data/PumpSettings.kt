package com.example.servsin.data

data class PumpSettings(
    val site: Site,
    val pumpId: Int,
    val brand: String,
    val model: String,
    val calibrationEndDate: String,
    val uncertainty: Float,
    val sides: String
)

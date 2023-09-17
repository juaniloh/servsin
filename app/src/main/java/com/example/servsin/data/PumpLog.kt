package com.example.servsin.data

data class PumpLog(
    val site: Site,
    val pumpSettings: PumpSettings,
    val isNew: Boolean,
    val startDate: String,
    val startTime: String,
    val endDate: String,
    val endTime: String,
    val pumpActivity: PumpActivity,
    val comments: String,
    val creationDate: String,
    val lastUpdate: String,
    val lastPrintDate: String
)

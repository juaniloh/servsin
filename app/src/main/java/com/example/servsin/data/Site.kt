package com.example.servsin.data

data class Site(
    val siteId: Int,
    val siteCode: String,
    val siteName: String,
    val sitePassword: String,
    val isSiteEnabled: Boolean,
    val siteAddress: String,
    val sitePhone: String,
    val siteMail: String,
    val cre: String,
    val pumpAmount: Int
)

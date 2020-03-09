package com.example.mylittleassistent.core

interface IHttpCore {
    val tokin: String
        get() = "kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD"
    val foodCentralAddress: String
        get() = "https://developer.nrel.gov/api/alt-fuel-stations/v1/nearest.json?"
}
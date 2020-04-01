package com.example.mylittleassistent.model.remoterep

interface IHttpCore {
    val token: String
        get() = "kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD"
    val foodCentralUrl: String
        get() = "https://api.nal.usda.gov/fdc/v1/search?api_key=kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD&generalSearchInput=Cheddar%20Cheese"
    //https://api.nal.usda.gov/fdc/v1/search?api_key=kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD\&generalSearchInput=Cheddar%20Cheese
    //https://developer.nrel.gov/api/alt-fuel-stations/v1/nearest.json?api_key=kgCwC3OrXu1tAZALJCfbXcFfHgayfLQMMoCH80lD&location=Denver+CO
}
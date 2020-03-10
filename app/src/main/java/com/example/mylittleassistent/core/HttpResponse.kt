package com.example.mylittleassistent.core

class HttpResponse(): IHttpCore {
    override val token: String
        get() = super.token
    override val foodCentralUrl: String
        get() = super.foodCentralUrl
}
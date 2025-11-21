package com.choihaaz.printer_api.capability

interface BatteryProvider {
    suspend fun getBatteryLevel(): Int
    suspend fun isCharging(): Boolean
}
package com.choihaaz.printer_api.capability

import kotlinx.coroutines.flow.Flow

interface NfcScanner {
    val scannedTagFlow: Flow<String>
}
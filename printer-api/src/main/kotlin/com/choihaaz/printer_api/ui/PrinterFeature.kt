package com.choihaaz.printer_api.ui

sealed class PrinterFeature {
    data object LabelEditor : PrinterFeature()

    data class PhotoStudio(
        val supportedModes: List<PhotoMode>
    ) : PrinterFeature()

    data object NameSticker : PrinterFeature()

    data object EventSticker : PrinterFeature()

    data object QuickPrint : PrinterFeature()

    data object PdfPrint : PrinterFeature()

    data class WebContent(
        val title: String,
        val url: String
    ) : PrinterFeature()
}

sealed class PhotoMode {
    data object Standard : PhotoMode()
    data object Mosaic : PhotoMode()
    data object Slice : PhotoMode()
}
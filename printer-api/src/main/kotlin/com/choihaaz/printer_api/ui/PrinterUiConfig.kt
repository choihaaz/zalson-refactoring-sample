package com.choihaaz.printer_api.ui

data class PrinterUiConfig(
    val theme: PrinterTheme,
    val supportedFeatures: List<PrinterFeature>,
    val supportedEditorTools: List<EditorTool>
)
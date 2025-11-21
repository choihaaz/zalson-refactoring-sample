package com.choihaaz.printer_api.ui

sealed interface EditorTool {
    data object Text : EditorTool
    data object Image : EditorTool
    data object Icon : EditorTool
    data object Draw : EditorTool
    data object Date : EditorTool
    data object Table : EditorTool
    data object Barcode : EditorTool
}
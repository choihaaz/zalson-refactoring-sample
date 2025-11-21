package com.choihaaz.printer_api.model

import com.choihaaz.printer_api.ui.LabelEditorLayoutType

data class CartridgeSpec(

    val code: String,
    val displayName: String,
    val serialNumber: String,

    /**
     * Physical dimensions in millimeters.
     * Note: Set to 0f if the dimension is infinite (e.g., continuous tape).
     */
    val widthMm: Float,
    val heightMm: Float,

    val layoutType: LabelEditorLayoutType,
) {
    /**
     * Calculated aspect ratio (Width / Height).
     * Returns null for continuous paper (where width or height is 0).
     */
    val aspectRatio: Float?
        get() {
            if (widthMm <= 0f || heightMm <= 0f) return null
            return widthMm / heightMm
        }
}
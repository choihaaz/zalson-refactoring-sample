package com.choihaaz.printer_api.ui

sealed interface LabelEditorLayoutType {
    data object VerticalFixed : LabelEditorLayoutType
    data object VerticalContinuous : LabelEditorLayoutType
    data object HorizontalFixed : LabelEditorLayoutType
    data object HorizontalContinuous : LabelEditorLayoutType
}
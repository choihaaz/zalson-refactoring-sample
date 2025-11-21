package com.choihaaz.printer_api.capability

import java.io.File

interface PdfPrintable {
    suspend fun printPdf(pdfFile: File)
}
package com.choihaaz.printer_api

import PrinterController

/**
 * Factory for creating a [PrinterController] based on a printer model name.
 *
 * @param modelName Identifier of the printer model (e.g. "printer_a", "printer_b").
 * @return A concrete [PrinterController] for the given model.
 * @throws IllegalArgumentException If the model name is not supported.
 */
interface PrinterFactory {
    fun getPrinter(modelName: String): PrinterController
}

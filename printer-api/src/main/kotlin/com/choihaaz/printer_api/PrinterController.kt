import android.graphics.Bitmap
import com.choihaaz.printer_api.model.CartridgeSpec
import com.choihaaz.printer_api.ui.PrinterUiConfig
import kotlinx.coroutines.flow.StateFlow

/**
 * Main contract for interacting with a printer device.
 * Hides underlying SDK-specific implementations.
 */
interface PrinterController {

    /** Static UI configuration for theme, features, and editor tools. */
    val uiConfig: PrinterUiConfig

    /** Observable connection state of the printer (Disconnected, Connecting, Connected, Error). */
    val connectionState: StateFlow<ConnectionState>

    /**
     * Current cartridge information.
     * Null if no cartridge is detected or the printer is disconnected.
     */
    val currentCartridge: StateFlow<CartridgeSpec?>

    suspend fun connect()
    suspend fun disconnect()
    suspend fun printBitmap(bitmap: Bitmap)
}

sealed interface ConnectionState {
    data object Disconnected : ConnectionState
    data object Connecting : ConnectionState
    data object Connected : ConnectionState

    data class Error(val message: String, val cause: Throwable? = null) : ConnectionState
}

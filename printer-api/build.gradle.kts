plugins {
    alias(libs.plugins.choihaaz.android.library)
}

android {
    namespace = "com.choihaaz.printer.api"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}
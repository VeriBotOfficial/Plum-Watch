plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
    id("dev.shayxo.liquidglass")
}

android {
    namespace = "me.doruk.plumwatch"
    compileSdk = 37

    defaultConfig {
        applicationId = "me.doruk.plumwatch"
        minSdk = 26
        targetSdk = 37
        versionCode = System.getenv("PLUM_VERSION_CODE")?.toIntOrNull() ?: 1
        versionName = System.getenv("PLUM_VERSION_NAME") ?: "0.1.0"
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2026.06.01"))
    implementation("dev.shayxo.liquidglass:liquidglass:1.0.0")
    implementation("dev.shayxo.liquidglass:liquidglass-material3:1.0.0")
    implementation("androidx.activity:activity-compose:1.13.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.10.0")
    implementation("androidx.core:core-ktx:1.18.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2")

    debugImplementation("androidx.compose.ui:ui-tooling")
}

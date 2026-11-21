import java.time.Year

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}

val signingKeystorePath = System.getenv("PLUM_SIGNING_KEYSTORE_PATH")
val signingStorePassword = System.getenv("PLUM_SIGNING_STORE_PASSWORD")
val signingKeyAlias = System.getenv("PLUM_SIGNING_KEY_ALIAS")
val signingKeyPassword = System.getenv("PLUM_SIGNING_KEY_PASSWORD")
val hasStableSigning = !signingKeystorePath.isNullOrBlank() &&
    !signingStorePassword.isNullOrBlank() &&
    !signingKeyAlias.isNullOrBlank() &&
    !signingKeyPassword.isNullOrBlank() &&
    file(signingKeystorePath).isFile

android {
    namespace = "me.doruk.plumwatch"
    compileSdk = 37

    defaultConfig {
        applicationId = "me.doruk.plumwatch"
        minSdk = 26
        targetSdk = 37
        versionCode = System.getenv("PLUM_VERSION_CODE")?.toIntOrNull() ?: 1
        // The workflow computes this from the latest published manifest before each build.
        versionName = System.getenv("PLUM_VERSION_NAME") ?: "${Year.now().value % 100}.0.1"
    }

    signingConfigs {
        if (hasStableSigning) {
            create("stableCi") {
                storeFile = file(signingKeystorePath!!)
                storePassword = signingStorePassword
                keyAlias = signingKeyAlias
                keyPassword = signingKeyPassword
            }
        }
    }

    buildTypes {
        getByName("debug") {
            if (hasStableSigning) {
                signingConfig = signingConfigs.getByName("stableCi")
            }
        }
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
    implementation(platform("androidx.compose:compose-bom:2024.10.00"))
    implementation("androidx.compose.animation:animation")
    implementation("io.github.kyant0:backdrop:2.0.1")
    implementation("io.github.kyant0:shapes:1.2.1")
    implementation("androidx.activity:activity-compose:1.13.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.10.0")
    implementation("androidx.core:core-ktx:1.18.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2")

    testImplementation("junit:junit:4.13.2")
    debugImplementation("androidx.compose.ui:ui-tooling")
}

import org.gradle.authentication.http.BasicAuthentication

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.jetbrains.kotlin.plugin.compose") {
                useModule("org.jetbrains.kotlin:compose-compiler-gradle-plugin:${requested.version}")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven {
            url = uri("https://packages.aliyun.com/maven/repository/2457536-release-P0YgD8/")
            credentials {
                username = System.getenv("SIFLI_MAVEN_USERNAME")?.takeIf { it.isNotBlank() } ?: "65a890ad4f41789f56425965"
                password = System.getenv("SIFLI_MAVEN_PASSWORD")?.takeIf { it.isNotBlank() } ?: "Y-kxYEyTl5)['"
            }
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
}

rootProject.name = "Plum Watch"
include(":app")

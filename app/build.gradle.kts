plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.sonarqube")
}

android {
    namespace = "com.oviva.sonarmulticommenttest"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.oviva.sonarmulticommenttest"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

sonar {
    properties {
        property("sonar.projectKey", "mohammed-uzair_sonar_multi_comment_test_flavour_1")
        property("sonar.organization", "mohammed-uzair")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")

    testImplementation("junit:junit:4.13.2")
    testImplementation("app.cash.turbine:turbine:1.0.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")

    // There is an issue while compiling the project, the fix was found here -> https://gist.github.com/danielcshn/7aa57155d766d46c043fde015f054d40
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
}
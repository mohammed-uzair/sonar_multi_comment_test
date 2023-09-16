// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.sonarqube") version "4.3.1.3277"
}

sonar {
    properties {
        property("sonar.projectKey", "mohammed-uzair_sonar_multi_comment_test_flavour_1")
        property("sonar.organization", "mohammed-uzair")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

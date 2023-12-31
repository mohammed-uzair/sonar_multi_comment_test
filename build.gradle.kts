// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.2" apply false
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

//subprojects {
//    version = "1.0"
//    sonarqube {
//        properties {
//            property("sonar.sources", "src/main")
//            property("sonar.tests", "src/testDemo")
//        }
//    }
}

plugins {
    kotlin("multiplatform") version "1.5.10"
}

group = "com.dpanger"
version = "0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting
    }
}

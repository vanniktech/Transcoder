plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.vanniktech.maven.publish") version "0.24.0"
}

android {
    setCompileSdkVersion(property("compileSdkVersion") as Int)
    defaultConfig {
        minSdk = property("minSdkVersion") as Int
        targetSdk = property("targetSdkVersion") as Int
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes["release"].isMinifyEnabled = false
}


dependencies {
    api("com.otaliastudios.opengl:egloo:0.6.1")
    api("androidx.annotation:annotation:1.2.0")

    androidTestImplementation("androidx.test:runner:1.4.0")
    androidTestImplementation("androidx.test:rules:1.4.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("org.mockito:mockito-android:2.28.2")
}

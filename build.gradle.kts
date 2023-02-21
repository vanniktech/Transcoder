buildscript {

    extra["minSdkVersion"] = 18
    extra["compileSdkVersion"] = 33
    extra["targetSdkVersion"] = 33
    
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
        classpath("com.android.tools.build:gradle:7.4.1")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}

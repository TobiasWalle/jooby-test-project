import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    dependencies {
        classpath("org.jooby:jooby-gradle-plugin:1.6.0")
    }
}

plugins {
    kotlin("jvm") version "1.3.21"
    application
}

apply(plugin = "jooby")

group = "com.tobiaswalle"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "com.tobiaswalle.joobytestproject.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    compile("org.jooby:jooby-apitool:1.6.0")
    compile("org.jooby:jooby-lang-kotlin:1.6.0")
    compile("org.jooby:jooby-undertow:1.6.0")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

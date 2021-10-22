/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("christmas.lights.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("christmas.lights.app.AppKt")
}

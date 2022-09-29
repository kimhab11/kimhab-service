plugins {
    id("java")
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
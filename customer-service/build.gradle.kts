plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

repositories {
    mavenCentral()
}

dependencies {

//    implementation("org.springframework.boot:spring-boot-starter-actuator:2.7.3")
//    implementation("org.springframework.cloud:spring-cloud-starter-config:3.1.1")

    implementation("org.springframework.boot:spring-boot-starter-web:2.7.3")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

// jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
// swagger
    implementation("org.springdoc:springdoc-openapi-ui:1.6.11")

// devtool
    developmentOnly("org.springframework.boot:spring-boot-devtools")

// postgresql
    runtimeOnly("org.postgresql:postgresql")

// lombok
    annotationProcessor("org.projectlombok:lombok")
    compileOnly("org.projectlombok:lombok")
// eureka-client
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:3.1.4")
// zipkin
    implementation("org.springframework.cloud:spring-cloud-starter-sleuth:3.1.4")
    implementation("org.springframework.cloud:spring-cloud-sleuth-zipkin:3.1.4")




}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
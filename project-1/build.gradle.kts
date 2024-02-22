plugins {
    java

    id("org.springframework.boot") version "3.2.2"
    id("plugin-1")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.2")
}

plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("plugin-2") {
            id = "plugin-2"
            implementationClass = "Plugin2"
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.springframework.boot:spring-boot-gradle-plugin:3.2.2")
}

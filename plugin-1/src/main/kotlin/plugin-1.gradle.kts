import org.springframework.boot.gradle.tasks.run.BootRun

tasks.withType<BootRun>().configureEach {
    jvmArguments.add("-broken")
}

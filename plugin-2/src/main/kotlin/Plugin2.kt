import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.springframework.boot.gradle.tasks.run.BootRun

open class Plugin2 : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.withType<BootRun>().configureEach {
            jvmArgs("-broken")
        }
    }

}

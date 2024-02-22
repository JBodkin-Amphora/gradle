# Bug Reproducer

## Task 1

Run

```shell
gradlew :project-1:bootRun
```

### Expected

```
FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':project-1:bootRun'.
> Process 'command 'C:\Program Files\Eclipse Adoptium\jdk-21.0.0.35-hotspot\bin\java.exe'' finished with non-zero exit value 1
```

### Actual

```
FAILURE: Build failed with an exception.

* What went wrong:
org/springframework/boot/gradle/tasks/run/BootRun
> org.springframework.boot.gradle.tasks.run.BootRun
```

## Task 2

Run

```shell
gradlew :project-2:bootRun
```

### Expected

```
FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':project-1:bootRun'.
> Process 'command 'C:\Program Files\Eclipse Adoptium\jdk-21.0.0.35-hotspot\bin\java.exe'' finished with non-zero exit value 1
```

### Actual

```
FAILURE: Build failed with an exception.

* What went wrong:
org/springframework/boot/gradle/tasks/run/BootRun
> org.springframework.boot.gradle.tasks.run.BootRun
```

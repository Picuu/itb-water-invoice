<p align="center">
    <img src="https://thumbs.dreamstime.com/b/monopolio-juegos-dados-y-s%C3%ADmbolo-o-logotipo-de-la-compa%C3%B1%C3%ADa-agua-cierre-macro-los-monopoly-empresa-172109713.jpg" alt="Banner" />
</p>

<p align="center">
  <img src="https://img.shields.io/github/languages/code-size/Picuu/itb-water-invoice?&style=for-the-badge" alt="GitHub code size in bytes" />
  <img src="https://img.shields.io/github/last-commit/Picuu/itb-water-invoice?&style=for-the-badge" alt="GitHub last commit" />
  <img src="https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin logo" />
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA logo" />
</p>

## 📌 Overview

Modular Kotlin project that emulates calculating a water bill invoice.

## 🔍 Table of Contents

* [📁 Project Structure](#-project-structure)
* [📝 Project Summary](#-project-summary)
* [🚀 Execution](#-execution)

## 📁 Project Structure

```bash
├── .gitignore
├── .idea
│   ├── .gitignore
│   ├── gradle.xml
│   ├── kotlinc.xml
│   ├── misc.xml
│   └── vcs.xml
├── build.gradle
├── gradle.properties
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   └── kotlin
    │       ├── Functions.kt
    │       ├── Main.kt
    │       ├── consoleColors.kt
    │       └── utilities.kt
    └── test
        └── kotlin
            └── FunctionsKtTest.kt
```

## 📝 Project Summary

- [src/main/kotlin/Main.kt](src/main/kotlin/Main.kt): Main application code.
- [src/main/kotlin/Functions.kt](src/main/kotlin/Functions.kt): Modular file with functions and logic to execute the aplication.
- [src/main/kotlin/utilities.kt](src/main/kotlin/Utilities.kt): Modular file with reusable methods.
- [src/main/kotlin/consoleColors.kt](src/main/kotlin/ConsoleColors.kt): File with constants for terminal colors.
- [src/test/kotlin/FunctionsKtTest.kt](src/test/kotlin/FunctionsKtTest.kt): Tests for all functions in [Functions.kt](src/main/kotlin/Functions.kt).

## 🚀 Execution

> [!CAUTION]
> To execute the application you may have the **Amazon Corretto 17 SDK**.

This is an example of the code execution:
![Code Execution](https://github.com/Picuu/itb-water-invoice/assets/93738423/1c45fdb5-6114-425b-85c3-77e77d0badf2)

> [!IMPORTANT]
> All functions have data type error and range error control.
> The program is safe to use without any problems.

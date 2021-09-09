
# Rhyme Challenge Template

<hr>

## Requirements

- Java
    - Verify with: `java -version`
- Gradle
    - Verify with: `gradle -version`
    - If not, you can install it the following ways:
        - If you use Mac and have Homebrew installed: `brew install gradle`
        - If you use Windows and have Chocolatey installed: `choco install gradle`
        - If you want to install gradle manually you may follow this installation guide: https://gradle.org/install/

## Setup
Open the project and run the following commands in the project root directory:
`gradle dependencies` and `gradle run --args "TODO_ADD_INPUT_DATA_HERE"`

## Input Data

Words to replace are marked with `_`. The first word for the rhyme has to be detected.
Multiple rhymes are separated with two line breaks.

The non completed rhymes will be passed as a run argument. The following example can be used for testing:
```
"Als ich aufsah\nwar niemand mehr _\n\nEs war, als hätt' der Himmel\ndie Erde still geküsst,\nDass sie im _\nVon Ihm nun träumen _\n\nDie Luft ging durch die Felder,\nDie Ähren wogten sacht,\nEs rauschten leis' die _\nSo sternklar war die _"
```

## Where to start

No resource files needs to be changed. Only the Main class needs to be modified and if necessary
additional classes can be created.

## Test run issues (IntelliJ)

If you encounter errors running the test with `gradle test` inside your Jetbrains IDE, set the **Build and Run using:** and **Run tests using:** setting to `IntelliJ IDEA` in **File / Settings / Build, Execution, Deployment / Gradle**.
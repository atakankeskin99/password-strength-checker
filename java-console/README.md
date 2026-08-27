# Java Console Implementation

The original console-based implementation of the **Password Strength Checker** project.

This version focuses on the core password evaluation logic using Java and provides a simple command-line interface for interacting with the application.

> This implementation is part of the main [Password Strength Checker](../README.md) repository.

## Features

* Password strength evaluation
* Five-point scoring system
* Uppercase character detection
* Lowercase character detection
* Number detection
* Special character detection
* Minimum length validation
* Missing-criteria feedback
* Strong password suggestions
* Secure random password generation
* JUnit tests

## Password Strength Criteria

A password can receive one point for each of the following:

* Minimum length of 9 characters
* At least one uppercase letter
* At least one lowercase letter
* At least one number
* At least one special character

The final score is classified as:

| Score | Result |
| ----: | ------ |
|   0–2 | WEAK   |
|   3–4 | MEDIUM |
|     5 | STRONG |

## Project Structure

```text
java-console/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── test/
│   │           └── Main.java
│   │
│   └── test/
│       └── java/
│           └── test/
│               └── MainTest.java
│
├── screenshots/
└── README.md
```

## Running

From the root of the main repository:

```bash
javac -d java-console/out java-console/src/main/java/test/Main.java
java -cp java-console/out test.Main
```

The application will prompt you to enter a password and then display its calculated strength.

## Testing

JUnit tests are included for:

* Password strength calculation
* Strength classification
* Password generation
* Missing-criteria feedback
* Suggestion behavior

## Screenshot

See the [`screenshots`](screenshots/) directory for an example of the console application.

## Related Implementations

The same project is also available in two other implementations:

* [JavaFX GUI](../javafx-gui/)
* [Node.js CLI](../nodejs-cli/)

## Main Repository

Return to the [Password Strength Checker](../README.md) overview.

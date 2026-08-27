# Password Strength Checker

![Java](https://img.shields.io/badge/Java-Console-orange)
![JavaFX](https://img.shields.io/badge/JavaFX-GUI-blue)
![Node.js](https://img.shields.io/badge/Node.js-CLI-green)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

A multi-implementation password strength checker built to explore how the same core logic can be adapted across different languages, interfaces, and application environments.

The project started as a **Java console application**, was later extended into a **JavaFX desktop GUI**, and was also implemented as a **Node.js command-line application**.

## Implementations

| Version      | Technology           | Interface   | Main Focus                          |
| ------------ | -------------------- | ----------- | ----------------------------------- |
| Java Console | Java                 | CLI         | Core logic, validation and testing  |
| JavaFX GUI   | Java / JavaFX        | Desktop GUI | Event-driven UI development         |
| Node.js CLI  | JavaScript / Node.js | CLI         | Translating the logic to JavaScript |

## Project Structure

```text
password-strength-checker/
├── java-console/
│   ├── src/
│   └── screenshots/
│
├── javafx-gui/
│   ├── src/
│   ├── screenshots/
│   └── pom.xml
│
├── nodejs-cli/
│   ├── src/
│   └── README.md
│
├── README.md
├── LICENSE
└── .gitignore
```

## Evolution

```text
Java Console
     ↓
JavaFX GUI
     ↓
Node.js CLI
```

Each implementation evaluates password strength using similar criteria while exploring a different development environment.

The implementations originally existed as separate repositories and were later consolidated into this repository while preserving their Git history.

## Password Evaluation

Passwords are evaluated using criteria such as:

* Minimum password length
* Uppercase letters
* Lowercase letters
* Numbers
* Special characters

The applications classify passwords based on how many of these requirements are satisfied.

## Java Console

Location:

```text
java-console/
```

The original implementation of the project.

It provides a command-line interface for entering a password and evaluating its strength.

The Java version also includes:

* Missing-criteria feedback
* Strong password suggestions
* Secure random password generation
* JUnit tests

## JavaFX GUI

Location:

```text
javafx-gui/
```

The desktop implementation built with JavaFX.

It adapts the password-strength logic to an event-driven graphical interface and provides visual feedback while the user interacts with the application.

Features include:

* Password input field
* Show/hide password option
* Strength progress bar
* Strength verdict
* Automatic password suggestions
* Live evaluation while typing
* Clear/reset functionality

The project uses Maven for dependency and build management.

## Node.js CLI

Location:

```text
nodejs-cli/
```

A JavaScript implementation designed to run from the command line with Node.js.

This version demonstrates how the same password-strength concept can be translated from Java into JavaScript while keeping the application lightweight.

## What This Project Demonstrates

The main purpose of this repository is to explore the evolution of the same application idea across different environments.

Through the three implementations, the project demonstrates:

* Translating application logic between Java and JavaScript
* Console-based application development
* Desktop GUI development with JavaFX
* Event-driven programming
* Input validation
* Password-strength evaluation
* Secure random password generation
* Automated testing
* Maven-based Java project management
* Incremental project evolution

## Running the Implementations

### Java Console

From the repository root:

```bash
javac -d java-console/out java-console/src/main/java/test/Main.java
java -cp java-console/out test.Main
```

### JavaFX GUI

From the `javafx-gui` directory:

```bash
mvn javafx:run
```

The project can also be opened and run through an IDE with Maven support.

### Node.js CLI

From the repository root:

```bash
node nodejs-cli/src/app.js
```

## Possible Improvements

Future improvements could include:

* Shared and more consistent scoring rules between implementations
* Configurable password requirements
* Additional automated tests
* Dictionary-based common-password detection
* Entropy estimation
* Improved JavaFX UI styling
* A browser-based implementation
* Separation of scoring rules into reusable components

## Repository History

The Java console, JavaFX, and Node.js implementations originally existed as separate repositories.

They were later consolidated into this repository while preserving their individual Git histories. This makes it possible to follow the development of the project from its original console implementation to alternative interfaces and runtimes.

## License

This project is licensed under the MIT License.

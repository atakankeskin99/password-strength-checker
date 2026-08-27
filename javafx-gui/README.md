# JavaFX GUI Implementation

The desktop GUI implementation of the **Password Strength Checker** project, built with Java and JavaFX.

This version adapts the password-strength evaluation logic from the console application to an event-driven graphical interface.

> This implementation is part of the main [Password Strength Checker](../README.md) repository.

## Features

* Password strength evaluation
* Five-point scoring system
* Live evaluation while typing
* Password show/hide option
* Strength progress bar
* Strength verdict
* Strong password suggestions
* Clear/reset button
* Graphical user interface built with JavaFX

## Password Strength Criteria

The application evaluates passwords using criteria such as:

* Minimum password length
* Uppercase letters
* Lowercase letters
* Numbers
* Special characters

The main application uses the shared five-point evaluation logic provided by `PasswordStrengthCore`.

## Project Structure

```text
javafx-gui/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── atakan/
│                   ├── PasswordCheckerApp.java
│                   ├── PasswordStrengthCore.java
│                   └── PasswordGenerator.java
│
├── screenshots/
├── pom.xml
└── README.md
```

## Tech Stack

* Java
* JavaFX
* Maven

## Running

From inside the `javafx-gui` directory:

```bash
mvn javafx:run
```

The project can also be opened in an IDE with Maven and JavaFX support.

## Interface

The application provides:

* A password input field
* Optional password visibility
* A visual strength indicator
* A textual strength verdict
* Password suggestions when the entered password is not considered strong

The strength result updates automatically while typing and can also be triggered using the **Check** button.

## Screenshot

See the [`screenshots`](screenshots/) directory for an example of the JavaFX application.

## What I Practiced

This implementation provided practice with:

* JavaFX application structure
* Event-driven programming
* UI controls and layouts
* Property listeners
* Progress bars
* Separating password evaluation logic from the interface
* Maven dependency and build management
* Translating a console application into a desktop GUI

## Related Implementations

The same project is also available in two other implementations:

* [Java Console](../java-console/)
* [Node.js CLI](../nodejs-cli/)

## Main Repository

Return to the [Password Strength Checker](../README.md) overview.

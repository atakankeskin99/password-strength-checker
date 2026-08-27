# Node.js CLI Implementation

The command-line JavaScript implementation of the **Password Strength Checker** project, built with Node.js.

This version translates the password-strength evaluation logic into JavaScript while keeping the application lightweight and dependency-free.

> This implementation is part of the main [Password Strength Checker](../README.md) repository.

## Features

* Command-line password input
* Password strength evaluation
* Five-point scoring system
* Uppercase character detection
* Lowercase character detection
* Number detection
* Special character detection
* Minimum length validation
* Lightweight Node.js implementation
* No external dependencies

## Password Strength Criteria

A password can receive one point for each of the following:

* Minimum password length
* At least one uppercase letter
* At least one lowercase letter
* At least one number
* At least one special character

The final score is converted into a strength verdict.

## Project Structure

```text
nodejs-cli/
├── src/
│   ├── app.js
│   └── strength.js
│
└── README.md
```

## Requirements

* Node.js

## Running

From the root of the main repository:

```bash
node nodejs-cli/src/app.js
```

The application will prompt you to enter a password and then display its calculated strength.

## Design

The implementation is split into two small modules:

* `app.js` handles command-line input and output
* `strength.js` contains the password scoring and evaluation logic

This keeps the application flow separate from the core calculation logic.

## What I Practiced

This implementation provided practice with:

* Node.js fundamentals
* CommonJS modules
* Command-line input with `readline`
* JavaScript functions
* Input processing
* Translating existing Java logic into JavaScript
* Keeping business logic separate from CLI interaction

## Related Implementations

The same project is also available in two other implementations:

* [Java Console](../java-console/)
* [JavaFX GUI](../javafx-gui/)

## Main Repository

Return to the [Password Strength Checker](../README.md) overview.

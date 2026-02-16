# 🔐 Password Strength Checker (BITANEM Edition)
![Java](https://img.shields.io/badge/Java-JDK%2017-orange)
![Type](https://img.shields.io/badge/type-Console-lightgrey)
![Testing](https://img.shields.io/badge/tested_with-JUnit%205-blue)
![Status](https://img.shields.io/badge/status-learning%20project-lightgrey)


> ✅ Also available in Node.js (learning-focused CLI version):  
> https://github.com/atakankeskin99/password-strength-checker-js

This project is my **first and symbolic software project**.  
A small step for humanity, but a big step for Atakan. 🚀😄

It is a simple Java console application that evaluates  
**how strong a given password is**.  
And of course, it includes special “secret mode” responses for the  
legendary passwords *"begubebek"* and *"begucuk"*. 💚

## 💡 Features
- Checks password length  
- Detects uppercase / lowercase / digits / special characters  
- Special hidden responses:
  - `begubebek` → **BITANEM** 💚  
  - `begucuk` → **BITANEM** 💛  
- Basic Java practice  
- Lightweight and console-based

 ## 🧪 Tests

This project includes **JUnit 5** tests written as part of my learning process to better understand
how automated testing works in Java and how it improves code reliability.

### Purpose of the tests
The tests were added to:
- Learn the fundamentals of unit testing with **JUnit 5**
- Understand how to verify business logic programmatically
- Practice writing tests before and after modifying existing code
- Gain hands-on experience with test-driven thinking

### Covered scenarios
- Special predefined passwords (`begubebek`, `begucuk`)
- Weak passwords (short length, low complexity)
- Medium-strength passwords
- Strong passwords based on length and character variety

### Running the tests
To run the tests in **IntelliJ IDEA**:

1. Open the project
2. Right-click on the `src/test` directory
3. Select **Run 'Tests in test'**

All tests are expected to pass and help ensure that future changes do not break
the existing password strength evaluation logic.

## Implementations

This project was built as a learning exercise to practice basic password
strength evaluation in a Java console application.

To reinforce the same concepts and compare approaches, the logic was later
reimplemented in another language:

- **Node.js (CLI version)**  
  https://github.com/atakankeskin99/password-strength-checker-js


---

## 🛠 Technologies Used
- **Java 17**
- **IntelliJ IDEA Community Edition**
- Regex and conditional logic

 ## 🧠 Mini Case Study — Password Strength Checker

### 📌 Problem
Many users are unsure whether their passwords are actually strong or not.
This project aims to provide a **quick and clear evaluation** of a password’s strength using basic, easy-to-understand rules.

---

### 🎯 Project Goals
- Practice **core Java fundamentals** with a real-world inspired example  
- Use simple, deterministic rules to evaluate password strength  
- Keep the code **readable and beginner-friendly**  
- Provide immediate feedback and suggestions to the user

---

### 🛠️ Approach & Design Decisions
- The project is built as a **pure Java console application** with no external dependencies.
- Password strength is determined using:
  - Minimum length
  - Uppercase letters
  - Lowercase letters
  - Digits
  - Special characters
- Instead of a numeric score, passwords are classified as:
  - `WEAK`
  - `MEDIUM`
  - `STRONG`
- When a password is not strong, the program generates a **secure random password suggestion** using `SecureRandom`.
- Small “easter eggs” were added to make the interaction more engaging.

---

### 📚 What I Learned
- Working with **regular expressions** to detect character groups
- Basic **input validation** in console applications
- Separating logic (password checking vs password generation)
- Writing a clear and structured **README** for a GitHub project
- As part of this project, I also added basic JUnit tests to better understand
how automated testing helps protect core logic during refactoring.


---

### ⚠️ Limitations
This project uses simplified rules for educational purposes.
Real-world password checkers may also include:
- Entropy-based calculations
- Dictionary or breached-password checks
- Context-aware security rules

---

### 🚀 Possible Improvements
- Add entropy-based strength scoring
- Create a GUI or web version (HTML / JavaScript)
- Make rules configurable
- Add more edge case unit tests


---

### ✅ Why This Project Matters
Although simple, this project demonstrates:
- Problem-solving approach
- Clean and understandable code structure
- Awareness of real-world limitations
- A focus on learning and improvement

It represents an early but meaningful step in my software development journey.


---

## 🚀 How to Run
```bash
javac Main.java
java test.Main   # if Main.java is in package 'test'


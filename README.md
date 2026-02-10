# 🔐 Password Strength Checker (BITANEM Edition)

This project is my **first and symbolic software project**.  
A small step for humanity, but a big step for Atakan. 🚀😄

It is a simple Java console application that evaluates  
**how strong a given password is**.  
And of course, it includes special “secret mode” responses for the  
legendary passwords *"begubebek"* and *"begucuk"*. 💚

---

## 💡 Features
- Checks password length  
- Detects uppercase / lowercase / digits / special characters  
- Special hidden responses:
  - `begubebek` → **BITANEM** 💚  
  - `begucuk` → **POFUDUK** 💛  
- Basic Java practice  
- Lightweight and console-based

---

## 🛠 Technologies Used
- **Java 17**
- **IntelliJ IDEA Community Edition**
- Regex and conditional logic

- ## 🧠 Mini Case Study — Password Strength Checker

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
- Add unit tests

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
1. Clone the repository:
   ```bash
   git clone https://github.com/atakankeskin99/password-strength-checker.git

# Password Strength Checker (Node.js CLI)

![JavaScript](https://img.shields.io/badge/JavaScript-Node.js-yellow)
![CLI](https://img.shields.io/badge/type-CLI-lightgrey)
![Status](https://img.shields.io/badge/status-learning%20project-lightgrey)
![License: MIT](https://img.shields.io/badge/License-MIT-green)

A learning-focused Node.js CLI project to practice input handling, modular design, and basic password strength evaluation.

> ✅ Java version (original console app):  
> https://github.com/atakankeskin99/password-strength-checker

---

## 🚀 Features

- Evaluates password strength using simple rules:
  - Minimum length
  - Uppercase letters
  - Lowercase letters
  - Digits
  - Special characters
- Returns a clear label (e.g., `WEAK`, `MEDIUM`, `STRONG`)
- Provides immediate feedback for invalid/weak passwords
- Beginner-friendly structure and readable code
- Simple rule-based evaluation (no entropy calculation)

## 🥚 Easter Eggs

The CLI includes a couple of hidden keyword triggers:

- `begubebek` → outputs: **BITANEM 💚**
- `begucuk` → outputs: **BITANEM 💛**

These are intentionally isolated from the core evaluation logic and exist purely as a lightweight interaction detail.

---

## 🧰 Tech Stack

- JavaScript (Node.js)
- CLI input/output

---

---

## 🧠 Mini Case Study — Password Strength Checker (Node.js)

### 📌 Problem

Users often overestimate the strength of their passwords.  
A quick and deterministic way to evaluate password quality can help demonstrate how basic security rules work in practice.

This project focuses on implementing a simple rule-based password strength evaluation using a CLI interface.

---

### 🎯 Project Goals

- Re-implement an existing Java console project in JavaScript (Node.js)
- Practice CLI input handling and modular structure
- Keep logic simple and deterministic
- Improve project documentation and structure
- Reinforce learning through cross-language adaptation

This project is intentionally **learning-focused**, not a production-grade security tool.

---

### 🛠️ Approach & Design Decisions

- Built as a Node.js CLI application
- Strength is evaluated using rule-based checks:
  - Length
  - Uppercase letters
  - Lowercase letters
  - Digits
  - Special characters
- No entropy-based scoring (kept intentionally simple)
- Clear separation between:
  - Input handling
  - Evaluation logic
  - Output formatting

Easter eggs were intentionally isolated from the core logic to keep the evaluation process clean.

---

### 📚 What I Learned

- Handling user input in Node.js CLI applications
- Structuring small projects with modular logic
- Translating application logic between programming languages (Java → JavaScript)
- Writing clearer, more structured GitHub documentation
- Thinking about edge cases and user interaction design

---

### ⚠️ Limitations

This project uses simplified rules for educational purposes.

It does not include:

- Entropy-based strength calculations
- Dictionary attack detection
- Breached password database checks
- Real-world security standards

---

### 🚀 Possible Improvements

- Add entropy-based strength scoring
- Allow configurable strength rules
- Add automated tests
- Build a web-based GUI version
- Integrate with a simple database for history tracking

---

### ✅ Why This Project Matters

Although simple, this project demonstrates:

- Cross-language logic adaptation
- Structured problem-solving
- CLI application development
- Clear documentation practices
- An iterative learning mindset

It represents a deliberate step in strengthening foundational development skills.


## ▶️ Run

```bash
npm install
npm start


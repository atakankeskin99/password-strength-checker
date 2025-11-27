# Password Strength Checker

A simple Java console application that evaluates the strength of a password based on its length and character composition — with a little lovely twist.

## Features

- Checks password strength using:
  - Minimum length (9+ characters)
  - Uppercase letters (`A–Z`)
  - Lowercase letters (`a–z`)
  - Digits (`0–9`)
  - Special characters (`!@#$%^&*().,?`)
- Returns a strength label:
  - `WEAK`
  - `MEDIUM`
  - `STRONG`
- Suggests a strong random password (default length: 12) if the entered password is not strong
- Uses `SecureRandom` for password generation

## Password Suggestion

When the evaluated password is **not** `STRONG`, the program:

1. Prints the calculated strength
2. Generates a new random password using all character sets (upper, lower, digits, special)
3. Displays it as a **suggested strong password**

This makes it easier for the user to immediately switch to a more secure password.

## Special Cases (Easter Eggs)

For fun, the application contains a few hard-coded “precious” passwords that bypass the normal scoring logic and return personalized messages.

- `begubebek` → custom message
- `begucuk` → custom message
- `elmasekeri` → custom message

These are purely for demonstration and testing purposes and should not be used as real passwords.


## How to Run

1. Compile the project:

## Case Study: Learning Java Through a Password Strength Checker

### 1. Background & Motivation
This project was one of my early steps in learning Java.  
It is not a production-level security tool — the main purpose was to build something functional while practicing the basics of the language.

I chose a password strength checker because it’s simple, practical, and involves essential concepts such as:

- User input
- String processing
- Conditional logic
- Basic method structure

This made it a beginner-friendly real-world problem to practice with.

---

### 2. Learning Goals
My main goals for this project were:

- Becoming familiar with Java syntax
- Structuring a small console application
- Practicing input validation
- Learning how to separate logic into different methods
- Applying simple rules to evaluate password strength

The idea was straightforward:  
"Receive a password from the user, analyze it using basic rules, and provide a simple strength result."

---

### 3. Implementation Overview
To keep the project clear and readable, I followed a simple structure:

- The user inputs a password through the console.
- The program checks several conditions:
  - Minimum length
  - Contains digits
  - Contains uppercase and lowercase letters
  - (Optional) Contains special characters

Based on these checks, the password is categorized as weak, fair, or strong.

To practice clean code principles, I divided the logic into smaller methods:

- A method for reading input
- A method for validating each rule
- A method for calculating the final strength

This helped me avoid putting all the logic inside the `main()` method.

---

### 4. Challenges & What I Learned
Some challenges I encountered:

- Writing too much logic in a single block made the code harder to understand  
  → Separating functionality into methods improved readability.

- Working with string and character methods like `charAt`, `length`, and `matches` required practice  
  → I improved my understanding of how Java handles text input.

Through this project, I learned:

- How to write clean, modular code  
- How to think in terms of small, reusable functions  
- How a simple console program flows from input → processing → output  
- How to handle basic user input errors  

---

### 5. Future Possibilities
I am not specifically planning to expand this project,  
but it could be extended in the future if needed. Possible additions include:

- More advanced password rules
- A more detailed scoring system
- A small GUI or web interface
- Unit tests for additional practice
- Rewriting the tool in another programming language

Even without these additions, this project successfully helped me practice and understand essential Java fundamentals.

   

   ```bash
   javac Main.java

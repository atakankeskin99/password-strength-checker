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

   ```bash
   javac Main.java

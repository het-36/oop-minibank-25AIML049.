# MiniBank — Practical 1

## Overview

MiniBank is a console-based banking application developed as part of the Object Oriented Programming practical.

This practical implements the basic menu shell of the banking application using Java.

## Features

* Displays bank information using a Java `record`
* Uses an `enum` for fixed menu options
* Uses `Scanner` to read user input
* Uses a switch expression to map menu numbers to menu options
* Provides options for:

  * Open Account
  * Deposit
  * Withdraw
  * Transfer
  * Exit
* Handles invalid menu choices
* Continuously displays the menu until the user selects Exit

## How to Compile

Open the terminal in the project directory and run:

```bash
javac MiniBank.java
```

## How to Run

After successful compilation, run:

```bash
java MiniBank
```

## Example

```text
=================================
          MiniBank
          CHARUSAT Branch
=================================

----- MiniBank Menu -----
1. Open Account
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 2

Deposit — to be implemented in a later lab.
```

## Project Structure

```text
oop-minibank-<rollno>/
│
├── MiniBank.java
└── README.md
```

## Practical 1 Learning Outcomes

This practical demonstrates:

1. Basic Java program structure
2. Compilation and execution using `javac` and `java`
3. Use of records
4. Use of enums
5. Switch expressions
6. Reading input using `Scanner`
7. Loop-based menu-driven programming
8. Basic Git and GitHub version control

# Calculator Project

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup and Execution](#setup-and-execution)
  - [Step 1: Download the Code](#step-1-download-the-code)
  - [Step 2: Compile the Code](#step-2-compile-the-code)
  - [Step 3: Run the Program](#step-3-run-the-program)
  - [Step 4: Follow the Prompts](#step-4-follow-the-prompts)
- [Example Execution](#example-execution)
- [Code Breakdown](#code-breakdown)
  - [Main Components](#main-components)
  - [Key Considerations](#key-considerations)
- [Enhancements](#enhancements)
- [Contributing](#contributing)
- [License](#license)

## Overview
The Calculator project is a simple console-based application written in Java. It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The user provides two numbers and selects the desired operation, and the program outputs the result.

## Features
- Perform the following operations:
  1. Addition
  2. Subtraction
  3. Multiplication
  4. Division
- User-friendly input prompts.
- Error-free division by checking user input for zero is encouraged.

## Prerequisites
To run this program, you need:
- A working Java Development Kit (JDK) installed (version 8 or later).
- An Integrated Development Environment (IDE) or a text editor that supports Java.
- Basic knowledge of running Java programs via terminal or an IDE.

## Setup and Execution
### Step 1: Download the Code
Save the code in a file named `Calculator.java`.

### Step 2: Compile the Code
Open your terminal or command prompt and navigate to the directory where the file is saved. Compile the code using the following command:
```bash
javac Calculator.java
```

### Step 3: Run the Program
Run the compiled program with the command:
```bash
java Calculator
```

### Step 4: Follow the Prompts
The program will guide you through the following steps:
1. Choose an operation by entering the corresponding number (1-4).
2. Input the first number.
3. Input the second number.
4. View the result of the operation.

## Example Execution
**Input:**
```
What operation do you want to perform? 
1. Addition
2. Subtraction
3. Multiplication
4. Division
> 1

What is the first number? 
> 5

What is the second number? 
> 3
```

**Output:**
```
Your answer is 8.0
```

## Code Breakdown
### Main Components
- **Scanner for Input:**
  Used to read user input from the console.

- **Switch Case:**
  Determines which operation to perform based on user input.

- **Arithmetic Operations:**
  Basic operations like addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`) are implemented.

### Key Considerations
- The program does not currently handle division by zero. Adding input validation for this scenario is recommended.
- Proper input validation for non-numeric inputs is not implemented but can be added for robustness.

## Enhancements
Potential enhancements for the program include:
1. **Input Validation:**
   - Handle invalid inputs (e.g., non-numeric characters).
   - Prevent division by zero.
2. **Error Messages:**
   - Display user-friendly messages for invalid choices.
3. **Modular Design:**
   - Refactor operations into separate methods for better readability and maintainability.
4. **Additional Features:**
   - Add support for more operations (e.g., modulus, power).
   - Provide the ability to perform multiple calculations in a single session.

## Contributing
Contributions are welcome! Feel free to fork the repository, make changes, and submit a pull request.

## License
This project is open-source and available under the MIT License.

---

Enjoy using the Calculator project!


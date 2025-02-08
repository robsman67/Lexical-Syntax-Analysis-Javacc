# Lexical Analysis and Syntax Analysis

## 📚 Project Overview
This project is part of the **DA53: Compilers and Language Theory. The goal of the project is to implement a small interpreter for the **Tiny Basic** language using **Java** and **JavaCC**.

The code structure was provided as a skeleton, which we enhanced to include a lexical analyzer, a parser, and an interpreter to execute Tiny Basic programs.

The subject is in the *DA53_LW2_LW3.pdf* file

## 🚀 Features
- **Lexical Analysis (Lexer):** Tokenizes Tiny Basic code into meaningful units.
- **Syntax Analysis (Parser):** Builds a parse tree based on Tiny Basic grammar rules.
- **Symbol Table:** Manages variable names and scopes.
- **Interpreter:** Executes the parsed Tiny Basic code.
- **Error Handling:** Basic error detection for invalid syntax.
- **Language Extensions:** Support for arrays, loops, and additional statements.


## ⚙️ Installation
1. **Clone the Repository:**
   ```bash
    git@github.com:robsman67/Lexical-Syntax-Analysis-Javacc.git
    cd Lexical-Analysis-and-Syntax-Analysis
   ```

2. **Set Up JavaCC:**
   - Download [JavaCC](https://javacc.github.io/javacc/).
   - Navigate to the parser directory:
     ```bash
     cd src/fr/utbm/gi/lo46/tp2/parser
     javacc tinybasic.jj
     ```

3. **Compile the Project:**
   ```bash
   javac -d bin src/**/*.java
   ```

4. **Run the Interpreter:**
   ```bash
   java -cp bin fr.utbm.gi.lo46.tp2.TinyBasicInterpreter
   ```

## 📜 Tiny Basic Language Syntax
- **Statements:** `PRINT`, `INPUT`, `LET`, `IF-THEN`, `GOTO`, `GOSUB`, `RETURN`, `END`, `REM`
- **Expressions:** Arithmetic operations `+`, `-`, `*`, `/`
- **Variables:** Dynamic typing (numeric or string)
- **Control Structures:**
  ```basic
  FOR I = 1 TO 10 STEP 1
    PRINT I
  NEXT I

  WHILE (X < 10) DO
    LET X = X + 1
  WEND
  ```

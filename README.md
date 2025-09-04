
# Pattern Drawer 🟩🟦

## Overview

This Java program creates a **custom ASCII pattern** on a 2D grid using **hashtags (`#`)** and **dots (`.`)**.

* Hashtags (`#`) represent walls or boundaries.
* Dots (`.`) represent empty spaces.
* The pattern is drawn on a **16x15 board**.

---

## How It Works

1. The program defines a **board size** (`row = 16`, `col = 15`).
2. A 2D array `bound` stores the pattern.
3. ASCII values:

   * `#` → Wall
   * `.` → Empty space
4. The `board()` method fills the array according to custom rules.
5. The `draw()` method prints the pattern on the console.

---

## Example Output

```
# # # # # # # # # # # # # # #
# . . . # . . . # . . . . . #
# . . . # # # # # # # . . . #
# . . # . . . . . . # . . . #
# . # . . . . . . . . . . . #
# . # # # . . # # # . . # . #
# . # . . . . . . . . . # . #
# . # . . . . . . . . . # . #
# . # . . . . . . . . . # . #
# . # . . . # # . . . . # . #
# . # . . . . # . . . . # . #
# . # . # . # # . . . . # . #
# . . . # . . # # # . . . . #
# . . . # # # . . . . . . . #
# . . . . . . . . . . . . . #
# # # # # # # # # # # # # # #
```

---

## Key Concepts Covered ✅

* 2D arrays
* Nested loops (`for`)
* ASCII characters
* Conditional statements (`if-else`)
* Pattern drawing in console

---

## Notes

* The program can be extended for **interactive movement** or **Pac-Man style games** using the commented sections in your code.
* `#` can represent walls and `.` empty spaces for movement logic.

---

## Author ✍️

* Hasan Zarook, 

Do you want me to do that?

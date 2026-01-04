# Sequential_Calculator
This project is a **sequential calculator** developed in Java, featuring a graphical user interface and a clean separation between presentation and logic. It is designed as an educational tool to demonstrate linear calculation workflows rather than complex expression evaluation.

---

## 🏗️ Project Architecture

The application is structured into two main files to ensure a modular design:

* **`ventana.java`**: Handles the graphical interface. Built using **Eclipse WindowBuilder**, it manages the layout of Swing components (buttons, text fields, and panels).
* **`proyecto1.java`**: Contains the entry point (`main` method) and the functional logic, processing the inputs provided by the user.

---

## ⚙️ How it Works

Unlike standard calculators that evaluate full mathematical expressions, this application follows a **Strictly Sequential Model**. Operations are executed one at a time, and results are reused as the starting point for the next calculation.

### Execution Workflow
1. Enter the **first number**.
2. Select a **mathematical operator** (`+`, `-`, `x`, `/`).
3. Enter the **second number**.
4. Display the **result**.
5. *Optional:* Use the result as the new "First Number" for the next step.

**Example of Valid Usage:**
> `3 + 2 = 5`  
> `5 x 4 = 20`  
> `20 - 6 = 14`

---

## 🛠 Features

* **GUI-Driven:** User-friendly interface built with professional visual tools.
* **Modular Logic:** Clear separation between UI code and calculation backend.
* **Step-by-Step Processing:** Simplifies the understanding of data flow in Java.
* **Basic Error Handling:** Implements initial validation for input structures.

---

## ❌ Known Issues and Limitations

Due to its educational nature and simplified parsing logic, the project has the following constraints:

### 1. Negative Numbers
Negative values are only supported as the **first operand**.
* **Valid:** `-3 x 2`
* **Invalid:** `3 x -2` (This will trigger a parsing error).

### 2. Operator Precedence
The calculator does **not** support PEMDAS/BODMAS rules. It processes input in a simple `number → operator → number` structure.
* **Unsupported:** `3 + 4 x 2` (The calculator cannot parse multiple operators in a single string).

---

## 📂 Project Structure

```text
Sequential_Calculator/
│
├── ventana.java      # Graphical interface code
├── proyecto1.java    # Logic and main execution
└── README.md         # Project documentation

```

---

## 🎯 Educational Goals

The primary purpose of this project is to practice:

* Developing **GUIs** in Java using Swing.
* Managing **event listeners** for button interactions.
* Understanding the **sequential processing** of data.
* Implementing **logic-presentation separation** (Model-View basics).

---

## 🚀 Future Improvements

* Implement full support for negative numbers in all positions.
* Add support for multiple operators and mathematical precedence.
* Introduce decimal point calculations.
* Enhance user feedback through better error dialogs.


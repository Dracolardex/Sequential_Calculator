# Sequential_Calculator
This project is a sequential calculator developed in Java, featuring a graphical user interface and a clear separation between presentation and logic. The application is intended as an educational project to demonstrate how a calculator based on simple, linear operations works, without evaluating complex mathematical expressions.

The graphical interface was created using WindowBuilder, the official visual GUI designer provided by Eclipse, which allows building and organizing Swing components in a structured and visual way.

General description

The calculator operates under a strictly sequential model, meaning that operations are executed one at a time, reusing the previous result as the starting point for the next calculation.

The project is divided into two main files:

ventana.java
Contains all interface-related code (window, buttons, text fields, etc.), designed with Eclipse WindowBuilder.

proyecto1.java
Contains the main method and all functional logic of the calculator.

What is a sequential calculator?

Unlike a standard calculator, this application does not evaluate full mathematical expressions and does not apply operator precedence.

Each operation must always follow this format:

operand1 operator operand2


Once the result is obtained, it can be reused as the new operand1 to continue calculating sequentially.

This behavior is the reason why the project is called a Sequential Calculator.

How it works

The user enters a first number.

A mathematical operator is selected (+, -, x, /).

A second number is entered.

The calculator displays the result.

The result can be reused for the next operation.

Example of valid usage:

3 + 2 = 5
5 x 4 = 20
20 - 6 = 14


Each operation is processed independently and in order.

Features

Graphical user interface built with Eclipse WindowBuilder.

Clear separation between UI and application logic.

Sequential, step-by-step calculations.

Limited support for negative numbers.

Simple and educational project focused on learning Java.

Known issues and limitations

This calculator has several important limitations that must be taken into account:

Negative numbers

Negative values are allowed only as the first operand.

Valid example:

-3 x 2


Invalid example (always causes an error):

3 x -2


This limitation is due to how input parsing is implemented.

Multiple operators in one operation

The calculator only supports one operator per calculation.

Example that causes an error:

3 + 4 x 2

More than two operands in a single expression

Chained expressions are not supported within a single input.

Invalid example:

3 + 7 x 3 - 1


Each operation must be performed separately, following the sequential workflow.

Reason for these limitations

The application does not parse or evaluate full mathematical expressions.
Input is always processed as a simple structure:

number → operator → number


There is no operator precedence or expression evaluation, which is consistent with the sequential design of the calculator.

Project structure
Sequential_Calculator/
│
├── ventana.java      // Graphical interface (WindowBuilder)
├── proyecto1.java   // Logic and main method
└── README.md        // Documentation

Project goal

The main goal of this project is educational, focusing on:

Practicing GUI development in Java using Eclipse.

Understanding how a sequential calculator works.

Separating interface and business logic.

Implementing basic validation and error handling.

It is not intended to replace a scientific calculator or to solve complex expressions.

Possible future improvements

Allow negative numbers in both operands.

Support multiple operators in a single expression.

Implement operator precedence.

Improve error handling and user feedback.

License

This project is released for educational purposes.

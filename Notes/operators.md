# 🔰 Java Operators – Categories
    Java has several types of operators, grouped by functionality
---
## 1. 🔢 Arithmetic Operators
   Used to perform basic math operations.

| Operator | Description           | Example (a = 10, b = 3) |
|----------|-----------------------|-------------------------|
| +        | Addition              | a + b = 13              |
| -        | Subtraction           | a - b = 7               |
| * | Multiplication        | a * b = 30              |
| /        | Division              | a / b = 3 (integer division) |
| %        | Modulus (remainder)   | a % b = 1               |

## 2. 🧮 Assignment Operators
   Used to assign values to variables.

| Operator | Description           | Example                |
|----------|-----------------------|------------------------|
| =        | Assign                | a = 5                  |
| +=       | Add and assign        | a += 3 → a = a + 3     |
| -=       | Subtract and assign   | a -= 3 → a = a - 3     |
| *=       | Multiply and assign   | a *= 2 → a = a * 2     |
| /=       | Divide and assign     | a /= 2 → a = a / 2     |
| %=       | Modulus and assign    | a %= 2 → a = a % 2     |

## 3. ⚖️ Relational (Comparison) Operators
   Used to compare two values.

| Operator | Description             | Example (a = 10, b = 20) |
|----------|-------------------------|--------------------------|
| ==       | Equal to                | a == b → false           |
| !=       | Not equal to            | a != b → true            |
| >        | Greater than            | a > b → false            |
| <        | Less than               | a < b → true             |
| >=       | Greater than or equal to | a >= b → false           |
| <=       | Less than or equal to    | a <= b → true            |


## 4. 🔁 Logical Operators
   Used to combine multiple conditions.

| Operator | Description   | Example                |
|----------|---------------|------------------------|
| &&       | Logical AND   | (a > 5 && b < 30)       |
| ``!``    | Logical NOT   | !(a < b) → false       |   


## 5. 🧠 Unary Operators
   Operate on a single operand.

| Operator | Description        | Example             |
|----------|--------------------|---------------------|
| +        | Unary plus         | +a                  |
| -        | Unary minus (negate) | -a                  |
| ++       | Increment          | a++ or ++a          |
| --       | Decrement          | a-- or --a          |
| !        | Logical NOT        | !true → false       |

## 6. 🧪 Bitwise Operators
   Used for binary-level operations.

| Operator | Description        | Example (a = 5, b = 3) |
|----------|--------------------|------------------------|
| &        | Bitwise AND          | a & b → 1              |
| ``|``      | Bitwise OR           |                        |
| ^        | Bitwise XOR          | a ^ b → 6              |
| ~        | Bitwise NOT          | ~a → -6               |
| <<       | Left shift           | a << 1 → 10            |
| >>       | Right shift          | a >> 1 → 2             |


## 7. 📦 Ternary Operator
   Shorthand for if-else.
   
```java 
int result = (a > b) ? a : b;  // returns the greater of a or b

```

## 8. 🧬 Instanceof Operator
   Checks if an object is an instance of a specific class or subclass.
   
```java 
String s = "Hello";
System.out.println(s instanceof String);  // true

```
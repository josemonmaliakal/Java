# ✏️ Java Input Collection Using `Scanner`

This guide will help you understand how to collect user input in Java using the `Scanner` class.

---

## 🔍 What is `Scanner`?

`Scanner` is a built-in class in Java (from `java.util` package) that helps you get input from the user via the console.

---

## 🏢 Import Scanner

Before using Scanner, you need to import it:

```java
import java.util.Scanner;
```

---

## 👥 How to Use Scanner

### 🔢 Example: Get a String and an Integer

```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close();
    }
}
```

### ✅ Common Input Methods

| Method           | Description                     |
|------------------|---------------------------------|
| `nextLine()`     | Reads a whole line (String)     |
| `next()`         | Reads a single word             |
| `nextInt()`      | Reads an integer                |
| `nextDouble()`   | Reads a double (decimal)        |
| `nextBoolean()`  | Reads a boolean (true/false)    |

---

## ⚠️ Gotchas

- Always close the `Scanner` using `scanner.close()`.
- If you mix `nextLine()` with other input types, you might need to consume leftover newline characters using an extra `nextLine()`.

---

## 🔄 Try It Yourself

- Prompt the user for multiple values
- Use conditions and loops based on input
- Handle incorrect inputs using `try-catch`

---

## ☑️ Next

- [Back to Index](./index.md)

Happy inputting! 🚀


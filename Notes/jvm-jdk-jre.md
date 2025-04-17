[🔙 Back to Index](./index.md)

# ☕ JVM, JDK, and JRE Explained

Understanding these three components is essential for working with Java effectively.

---

## 🧠 What is JVM?

**JVM (Java Virtual Machine)** is an abstract machine that enables your computer to run a Java program. It converts bytecode (compiled Java code) into machine code.

- Platform dependent
- Provides portability and security
- Performs automatic memory management (Garbage Collection)

---

## 🔧 What is JDK?

**JDK (Java Development Kit)** is a software development kit used to develop Java applications. It includes:

- JRE (Java Runtime Environment)
- Compiler (`javac`)
- Debugger
- JavaDoc
- Development tools

🧱 It's the full kit for Java developers.

---

## 📦 What is JRE?

**JRE (Java Runtime Environment)** is the package of tools required to run Java programs.

- Contains the JVM
- Includes core libraries and other files needed by the JVM at runtime
- Does **not** include development tools like compiler or debugger

📌 Use JRE if you want to **run** Java applications, and JDK if you want to **write and run** them.

---

## 🔄 Summary Table

| Component | Contains | Purpose |
|----------|----------|---------|
| JVM      | Bytecode Interpreter | Runs Java Bytecode |
| JRE      | JVM + Libraries      | Runs Java Applications |
| JDK      | JRE + Dev Tools      | Develops and Runs Java |

---

> You write code with the JDK, run it with the JRE, and the JVM makes it all work on your machine.

[🔙 Back to Index](./index.md)
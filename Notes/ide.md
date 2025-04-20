# 💻 Java IDEs: IntelliJ IDEA / Eclipse / VS Code

This guide walks you through setting up popular Java IDEs so you can choose the one that best fits your workflow.

---

## ✨ Recommended IDEs for Java

- **IntelliJ IDEA** – Feature-rich, excellent for Java development
- **Eclipse** – Popular open-source IDE with plugin ecosystem
- **Visual Studio Code** – Lightweight and extensible, great for learners

---

## 🔧 IntelliJ IDEA Setup

1. Download from: [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)
    - Choose **Community Edition** (free) or **Ultimate** (paid)
2. Install and run the IDE
3. Create a new Java project:
    - File > New > Project > Java
    - Set the SDK (select or add a Java JDK)
4. Create a class with `main()` and run it using the green "Run" arrow

### ✅ Pros
- Smart code completion
- Powerful debugger
- Seamless Gradle/Maven integration

---

## ⚖️ Eclipse Setup

1. Download from: [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)
2. Choose **Eclipse IDE for Java Developers**
3. Extract and launch the IDE
4. Create a new project:
    - File > New > Java Project
    - Right-click `src` > New > Class > Check `public static void main`
5. Click Run to execute

### ✅ Pros
- Strong plugin ecosystem
- Built-in tools for testing and refactoring
- Enterprise-friendly

---

## 🚀 VS Code Setup

1. Download: [https://code.visualstudio.com/](https://code.visualstudio.com/)
2. Install extensions:
    - Java Extension Pack
    - Language Support for Java™ by Red Hat
3. Create a Java file `HelloWorld.java`
4. Use right-click > **Run Java**, or set up launch configuration

### ✅ Pros
- Lightweight and fast
- Works with multiple languages
- Great for beginners

---

## 🔄 Switching Between IDEs
- All use `.java` files, so code is portable
- Each has its own project configuration, so don't commit `.idea/`, `.vscode/`, or `.project` folders to Git

Add to `.gitignore`:
```gitignore
# IntelliJ
.idea/
*.iml

# Eclipse
.project
.classpath
.settings/

# VS Code
.vscode/
```

---

## ☑️ Next

Once your IDE is ready, you can:
- Write and run Java code
- Debug and test your code
- Build Java applications with Maven or Gradle

✅ [Back to Index](./index.md)


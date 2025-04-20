# ☕ Java Installation & Hello World

Welcome to your first step in the Java journey! This guide helps you:

- ✅ Install Java (JDK)
- ✅ Set up VS Code
- ✅ Write and run your first **Hello World** program

---

## 🛠️ Step 1: Install Java JDK

### ✅ Recommended: Java 21 (LTS)

1. Go to the [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) or [Adoptium (OpenJDK)](https://adoptium.net/).
2. Download and install the appropriate version for your OS.
3. Verify installation:

```bash
java -version
javac -version
```

If both show versions, you're good to go! 🎉

---

## 👥 Step 2: Set Up VS Code for Java

1. Install [Visual Studio Code](https://code.visualstudio.com/)
2. Open VS Code and install these extensions:
    - **Java Extension Pack** (by Microsoft)
    - **Debugger for Java**
    - **Language Support for Java™ by Red Hat**

3. Create a folder for your Java project and open it in VS Code.

---

## 👋 Step 3: Hello World Program

1. Create a file called `HelloWorld.java`

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

2. Compile and run using VS Code:
    - **Option 1**: Right-click → "Run Java"
    - **Option 2**: Use terminal:

```bash
javac HelloWorld.java
java HelloWorld
```

You should see:

```
Hello, World!
```

---

## 🤭 VS Code Launch Configuration (Optional)

If you want to run with a launch button, create a `.vscode/launch.json` like this:

```json
{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "java",
      "name": "Launch HelloWorld",
      "request": "launch",
      "mainClass": "HelloWorld"
    }
  ]
}
```

Make sure the file is saved in the same directory as `HelloWorld.java`.

---

## 🧱 Next Step

✅ [Move to Java Basics →](./index.md)

---

Happy coding! 💻✨


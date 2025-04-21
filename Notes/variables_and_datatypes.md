# 📑 Java Variables & Data Types


This guide will introduce you to variables and data types in Java, which are fundamental concepts for storing and manipulating data in your program.

---
## 🧑‍💻 What are Variables?

A variable in Java is a container that holds data that can be changed during the execution of the program. Every variable has a type, which determines what kind of data it can store.

## ⚙️ Declaring a Variable
To declare a variable in Java, you specify its type and name.

```java
int age;
String name;
double salary;

```
You can also initialize a variable during declaration:

```java 
int age = 25;
String name = "John";
double salary = 50000.0;
```

## 💰 Data Types in Java
Java has two types of data types:

* **Primitive** data types: Built-in types that hold simple values.

* **Reference** data types: Hold references to objects.

## 🧰 Primitive Data Types

| Data Type | Size    | Default Value | Description                  |
| --------- | ------- | ------------- | ---------------------------- |
| byte      | 1 byte  | 0             | 8-bit integer                |
| short     | 2 bytes | 0             | 16-bit integer               |
| int       | 4 bytes | 0             | 32-bit integer               |
| long      | 8 bytes | 0L            | 64-bit integer               |
| float     | 4 bytes | 0.0f          | Single-precision floating point |
| double    | 8 bytes | 0.0d          | Double-precision floating point |
| char      | 2 bytes | '\u0000'      | 16-bit Unicode character     |
| boolean   | 1 bit   | false         | true or false value          |


## 🧑‍💻 Example of Variables and Data Types

```java 

public class VariableExample {
    public static void main(String[] args) {
        int age = 30;
        double salary = 65000.50;
        String name = "Alice";
        char grade = 'A';
        boolean isEmployed = true;

        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + " earns $" + salary + " per year.");
        System.out.println(name + " has a grade: " + grade);
        System.out.println(name + " employment status: " + isEmployed);
    }
}

```

## 🛠️ Type Casting

You may need to cast one data type to another. There are two types of casting:

* Implicit casting: Java automatically converts smaller data types to larger data types.
* Explicit casting: You explicitly convert a larger data type to a smaller one.


## ☑️ Next

- [Back to Index](./index.md)


# 📘 What are Reference Data Types?
In Java, Reference Data Types refer to objects and arrays. Unlike primitive types (like int, double, char, etc.), reference types store the memory address (or reference) of the actual object, not the object itself.

🔍
## 🧩 Common Reference Types



| Type       | Description                             |
| ---------- | --------------------------------------- |
| String     | Represents sequences of characters        |
| Arrays     | Containers for multiple values of same type |
| Classes    | Blueprint to create user-defined objects |
| Interfaces | Contract for what a class can do         |
| Enums      | A fixed set of constants                 |

## 🔁 Reference vs Primitive

| Feature           | Primitive Data Types | Reference Data Types |
|-------------------|----------------------|----------------------|
| Stores            | Actual value         | Address (reference)    |
| Memory Location   | Stack                | Heap                 |
| Example           | `int x = 10;`         | `String s = "Hi";`   |
| Can be null?      | ❌ No                 | ✅ Yes                |
| Default value     | `0`, `false`, etc.   | `null`               |


## ❗Important Notes
* == vs .equals():

* == checks if two references point to the same object.

* .equals() checks if the contents are equal (overridden in many classes like String).

* Be cautious with null. Trying to access methods on a null reference causes a NullPointerException.

```java
String a = new String("test");
String b = new String("test");

System.out.println(a == b);        // false (different references)
System.out.println(a.equals(b));   // true  (same content)


```

## 🧠 Summary
* Reference types are used to work with complex data like objects and arrays.
* They store references to memory locations where actual data is held.
* Strings, arrays, custom classes, and interfaces are all reference types.
* Understanding how memory works with references helps avoid bugs and write efficient Java code.


# 🧩 Java Interfaces
✅ What is an Interface?
An interface in Java is like a contract that a class agrees to follow. It contains method signatures but no implementation (until Java 8+, where default methods are allowed).

## 🧠 Why use Interfaces?

* Enables multiple inheritance of type
* Supports polymorphism
* Useful in abstraction and design

## 📘 Defining an Interface
```java
interface Animal {
    void makeSound();  // method without body
}
```
## 📌 Implementing an Interface
```java
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}





```

# 🧱 Java Enums
[✅] What is an Enum?
An enum (short for enumeration) is a special Java type used to define a collection of constants.

## 📘 Defining an Enum
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```
## 📌 Using Enums in a Program
```java
public class Main {
public static void main(String[] args) {
Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            default:
                System.out.println("Regular day.");
        }
    }
}
```
## ☑️ Next

- [Back to Index](./index.md)
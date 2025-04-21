# 🔄 What is Type Casting ?

    Type Casting is converting one data type into another. Java has two types of type casting:
---
1. Primitive Type Casting
   * Widening Casting (Implicit): Small → Large 
   * Narrowing Casting (Explicit): Large → Small
2. Reference Type Casting
   * Casting between classes in an inheritance hierarchy.


## 🎯 1. Primitive Type Casting
###  ✅ Widening (Automatic / Implicit)
No data loss. Safe.

```java
int a = 10;
double b = a;  // int to double
System.out.println(b);  // Output: 10.0

```
## ⚠️ Narrowing (Manual / Explicit)
 Possible data loss. Needs casting.

```java
double x = 9.87;
int y = (int) x;  // double to int
System.out.println(y);  // Output: 9

```

⚠️ You might lose precision or even the value if out of range.

## 🧠 2. Reference Type Casting
This applies when:

You have inheritance.

You cast parent ↔ child objects.

✅ Upcasting (Implicit)
Child → Parent (Safe)

```java

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();             // Output: Some sound
    }
}


```
⚠️ Downcasting (Explicit)
Parent → Child (Needs check)

```java
Animal a = new Dog();       // Upcast
Dog d = (Dog) a;            // Downcast
d.bark();                   // Output: Woof!

```
❗ Unsafe Downcasting without knowing the actual object type can cause ClassCastException.

```java
Animal a = new Animal();
Dog d = (Dog) a;  // Runtime error

```
🔍 instanceof Operator – Safety Check
```java
if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.bark();
}


```
## 🧠 Summary

| Casting Type         | Direction       | Safe?   | Example         |
|----------------------|-----------------|---------|-----------------|
| Widening Primitive   | small → big     | ✅ Yes   | `int → double`  |
| Narrowing Primitive  | big → small     | ⚠️ Risk | `double → int`  |
| Upcasting            | child → parent  | ✅ Yes   | `Dog → Animal`  |
| Downcasting          | parent → child  | ⚠️ Risk | `Animal → Dog`  |


## ☑️ Next

- [Back to Index](./index.md)
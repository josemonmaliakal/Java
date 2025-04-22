## 🧠 Basic Idea
If something is true, do this. Otherwise, do something else.

---
* 🔹 1. if Statement
```java
int number = 10;

if (number > 0) {
        System.out.println("Number is positive");
}
 
```
✅ Explanation: If number > 0 is true, it prints "Number is positive".


* 🔹 2. if-else Statement
```java 
int number = -5;

if (number > 0) {
        System.out.println("Positive");
} else {
        System.out.println("Not positive");
}
 
```
✅ Explanation: If condition is false, the code in the else block runs.
* 🔹 3. if-else if-else Ladder
```java 
int number = 0;

if (number > 0) {
        System.out.println("Positive");
} else if (number < 0) {
        System.out.println("Negative");
} else {
        System.out.println("Zero");
}
 
```
✅ Explanation: Checks multiple conditions in order. Runs the first one that's true.

* 🔹 4. switch Statement
  Use this when you have multiple fixed values to compare.
```java 
int day = 3;

switch (day) {
        case 1:
        System.out.println("Monday");
        break;
                case 2:
                System.out.println("Tuesday");
        break;
                case 3:
                System.out.println("Wednesday");
        break;
default:
        System.out.println("Other day");
}
 
```
✅ Explanation: Matches day with a case. If no match, runs default.


## 💡 Real-World Example
```java
int age = 20;

if (age >= 18) {
    System.out.println("You can vote.");
} else {
    System.out.println("You cannot vote yet.");
}

```


## ☑️ Next

- [Back to Index](./index.md)
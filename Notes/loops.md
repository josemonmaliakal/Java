# Loops 

    they help you repeat a block of code multiple times, which is super useful when you don’t want to write the same code again and again.
---

* ### 🔁 1. for loop
  
👉 Use it when you know how many times you want to loop.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Hello " + i);
}

```
✅ Explanation:

int i = 1 → start from 1

i <= 5 → loop runs while this is true

i++ → increase i by 1 each time

🟢 Output:

```cmd 
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
```
* ### 🔁 2. while loop
👉 Use it when you don’t know how many times, but want to keep looping while a condition is true.
```java
int i = 1;

while (i <= 3) {
    System.out.println("i is " + i);
    i++;
}

```
✅ Same logic as for, just more manual control.

* ### 🔁 3. do-while loop

👉 Like while, but runs at least once even if the condition is false.

```java 
int i = 5;

do {
    System.out.println("Running once even if false: " + i);
    i++;
} while (i < 5);
```
✅ Runs once before checking the condition.

* ### 🔁 4. Enhanced for loop (aka for-each loop)

👉 Used to loop through arrays or collections.

```java 
String[] fruits = {"Apple", "Banana", "Mango"};

for (String fruit : fruits) {
    System.out.println(fruit);
}

```

🟢 Output:

```java 
Apple
Banana
Mango
```


### 5. ⛔ Control Statements
    
* break → exit the loop early
* continue → skip the current iteration and move to the next one

```java 

for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // skips printing 3
    }
    if (i == 5) {
        break; // stops loop when i is 5
    }
    System.out.println(i);
}

```
🟢 Output:

```cmd 
1
2
4

```

## ☑️ Next

- [Back to Index](./index.md)
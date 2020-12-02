# Java Concepts : Part - 02

**Now, we know something about Java, it is not some mysterious thing anymore. So, it's necessary that we should start learning something new and very important to get familiar with Java programming.**
**In this article you will find some basic concepts of Java, which will surely increase your knowledge of the subject.**


1. In case your program has multiple classes in it, then the name of the file should be exactly same to the name of the class that has `main` method defined in it.\
Because if it does not happen than, the program will show an error. Java language has a rule that the name of the file that contains the Java program should be excatly same to the name of the class in it, because it was designed this way, and help us to compile and run the Java program.

2. When you are writing a Java program, keep in mind that in your program there should be only one class that have declared `main` method in it, otherwise the program will give an error.

    **Significance of `main` class :** 
    - Java program starts it's execution from a method belongs to a class only.
    - The `main()` method is the starting point of the execution of the main thread.
    - If there are multiple classes, then ambiguity is resloved by incorporating a `main()` method into one special class called main thread.
    - The name of the Java program should be named after the class that Java interpreter unanimously choose that class to start it's execution.

3. **Constructor :** It is a very important concept in Java programming language, and it is widely used because it provides some features and facilities to make our program more robust. Here are some important point related to constructors.
    - A constructor initializes an object immediately upon creration.
    - Constructor in Java is a method.
    - This method has the same name as the class in which it resides.
    - Once defined, the constructor is automatically called immediately after object is created.
    - Constructor is a method which has no return type.
    - In fact, the implicit returns of a class constructor id the class type itself.
    - Constructor initialize the internal state of an object.

4. **Multiple Constructor :** In layman language you can understand multiple constructor as a the advanced type of constructor, when there are some special requirements of the problem than the concept of multiple constructor is used. Some key points which will help you to understand the concept of multiple constructor are as follow.
    - Sometimes, it is necessary to initialize an object in a number of ways.
    - Java allows his using the concept of constructor overloading.
    - In other words, Java allows to declarer one or more constructor method with different list of parameters are different method definition.

5. **`this` keyword concept :** You can say that `this` keyword is a property, that is not only present in Java but also in many other programming languages like JavaScript. Some points that will help you to understand the concept behind `this` keyword is mentioned below.
    - `this` is used to reduce name-space collisions.
    - Sometimes a method will need to refer to the object that invoke it.
    - To allow this Java defines `this` keyword.
    - `this` can be used inside any method to refer to the current object.
    - That is, `this` is always a reference to the object on which the method is invoked.
    - There is a specialized use of this keyword that arises when a class has multiple constructors.
    - In that case, `this` can be used from one constructor to invoke one of the other constructor of the same class.

6. **Understanding basic Java syntax :**

```java
public static void main(String args[])
```
- **public :** This is _access modifier_, in Java there are three access modifiers (_public, private, protected_).
    - The main method should always be _public_ in order to make it accessible by everyone and to run the program.
- **static :** This is a keyword. If we want to access any method inside the function we need to create it's object, but main does not have any object therefore `static` is used to access the methods defined inside the main function.

- **void :** This is a _return type_. To return something we use return type but the main method does not have return anything and that's why `void` is used as it return nothing. Main method does not return anything because it does not called by anyone other than _Java run time environment._

- **main :** This is method name. This method is searched by _JVM_ as a starting point for an application with a particular signature only.

- **String args[] :** String implies to string class and args[] means array of starting objects.
    - This is an argument that's need to pass through main method, this indicates that a variable number of arguments you can pass that's why an array is there.\
    args does not have any fixed size, it's size is determined when you run the program.

7. **Output from Java program :**

```java
System.out.println("Hello World !!" + "Welcome to Programming Port")
```
- **System :** System is a final class from the `java.lang` package.
- **Out :** Out is class of type `PrintStream` declared in the `System` class.
- **println :** println is a method of the `PrintStream` class.
- **+ :** This is a concatenation operator, it is used to concatenate the string values.

8. **Print v/s println :**
    - **Println("....") :** This method prints the string "...." and move the cursor to a new line.
    - **print("....") :** This method instead prints just the string "....", but does not move the cursor to a new line. Hence, subsequent instructions will print on the same line.

9. **Input to Java program with _Scanner_ class :**
    - **Scanner :** Scanner is one of the predefined class which is used for reading the data dynamically, from the user keyboard. We can import it to our program by 
    ```java
    import java.util.Scanner;
    ```

10. **printf :** `printf` is used to print on the screen just like `println` and `print`, but it has different abelites.

```java
// This will print it upto 2 decimal places
System.out.printf("Printing simple integer : x = %d\n", x);
```
**Output :** 3.14

```java
// Automatically appends zero to the rightmost part of the decimal
Float n = 5.2f;
System.out.printf("Formatted to specific width : n = %4f\n", n);
```
**Output :** 5.2000

```java
// Here number is formatted from right margin and occupies a width of 20 characters
N = 2324435.3f;
System.out.printf("Formatted to right margin : n = %20.4f\n", n);
```
**Output :** 2324435.2500

11. **Input in Java :** We can take input in the Java program using C class known as `Scanner`

```java
// Creating an object of Scanner class
Scanner scnr = new Scanner(System.in);

System.out.println("Please enter two numbers");
Int a = scnr.nextInt();     // Here we are passing the value of "a" as an integer.
Int b = scnr.nextInt();     // Here we are passing the value of "b" as an integer.
```

_This is the second part of the Java Concepts series, if you want you can see the first article of this series you will find some useful tips in that, basically previous post was an basic introduction to Java._

Hope this article would be helpful in any way possible. If you have any doubt regarding anything related to this topic you can contact me.

### 📱 Contact Me

[Twitter](https://twitter.com/r_mishra10),
[LinkedIn](https://www.linkedin.com/in/rahul-mishra-66210b185),
[Telegram](https://t.me/rahul_mishra10),
[Instagram](https://www.instagram.com/rahul_mishra10/?hl=en),

### 📧 Write a mail
<rahulmishra102000@gmail.com>

#### 🚀 Other links

[GitHub](https://github.com/rahulMishra05),
[HackerRank](https://www.hackerrank.com/rahulmishra10201)
# Java Concepts : Part - 03

**So far w had covered the basic of Java programming, which will help you to understand some basic properties of Java and that how does Java language works. Now we will take a deeper dive in Java and will see some of the useful and important features of Java programming language.**

1. **Static scope rule :**
    - ***Instance variable :*** 
        - Instance variable are declared in a class, but outside a method, constructor or any look.
        - When space is allocated for an object in the heap, a slot for each instance variable is created.
        - The instance variable are visible for all method constructors, and block in the class.

    - ***Class variable :*** Class variable also known as static variable decaled with the static keyword in a class, but outside a method, constructor or a block. There would only be one copy of each class variable per class, regardless of how many objects are created from it.

_Example :_
```java
public class VariableExample{
    int myVariable;
    static int data = 30;

    // Main method
    public static void main(String args[]) {
        int a = 100;
        variableExample obj = new VariableExample();

        System.out.println("Value of instance variable myVariable: " + obj.myVariable);

        System.out.println("Value of static variable data: " + VariableExample.data);
    }
}
```
_Output :_
```shell
Value of instance variable myVariable: 0
value of static variable data: 30
```

2. **`static` :**
    - Java does not have global variable.
    - Every variable in Java be declared inside a class.
    - The keyword `static` is used to make a variable just like global variable.
    - A variable declared with `static` keyword is called _class variable._
    - It acts like a global variable, that there is only one copy of variable associated with the class. That is, one copy of the variable regardless of the number of instance of the class.

3. **Nested class :** Nested class means a class inside another class. We can define as many nested class as much we want. But we should try not to declare many nested class because it makes the code confusing and chances of getting error increase.

4. **Recursion in Java :** Recursion in Java is a process in which a method is calls itself continuously. A method in Java that calls itself is called recursive method.\
It makes the code compact but complex to understand.

_Example :_
```java
public class RecursionExample2{
    static int count = 0;
    static void p() {
        count ++;
        if(count <= 5) {
            System.out.println("Hello" + count);
            p();
        }
    }
    public static void main(String args[]) {
        p();
    }
}
```

5. **While loop v/s do-while loop :** While loop checks the condition first and if the condition is true than only it runs, while on the other hand do-while loop run for the first time and after that it checks the condition.

6. **Inheritance in Java :**
    - Inheritance is one of the cornerstones of object-oriented programming because it allows the creation of hierarchical classification.
    - Using inheritance, one can create a general class that includes some common set of items.
    - This class then can be used to create more specific classes which has all the items from the base class, in addition to some items of it's own.

7. **Terms used in Inheritance :**
    - ***superclass :*** A class that is inherited is called a _superclass._
    - ***subclass :*** 
        - The class that does inheriting is called a _subclass._
        - A subclass is a specialized version of a _superclass._
        - It inherits all of the instance variable and methods defined by the _superclass_ and add its own, unique elements (_i.e. variable and methods_)
    - **Reusability :** It is a mechanism which facilitates you to reuse the data and methods of the existing class when one create a new class.\
    One can use the same data and methods already defined in the previous class.

8. **Inheritance syntax :** The `extends` keyword is used to define a new class that derives from an existing class. The meaning of `extends` is to increase the functionality.
```java
class <Subclass-name> extends <Superclass-name> {
    // Data and methods in this sub-class
}
``` 
9. **Inheritance types :**
    - ***Single Inheritance :***
    When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.\
    _Example :_
    ```java 
    class Animal{
        void eat() {
            System.out.println("eating.");
        }
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("barking.");
        }
    }
    class TestInheritance{
        public static void main(String args[]){
            Dog d = new Dog();
            d.bark();
            d.eat();
        }
    }
    ```
    _Output :_
    ```shell
    barking.
    eating.
    ```

    - ***Multiple single inheritance :*** To reduce the complexity and simplify the language, multiple inheritance is not supported in Java.\
    Consider a scenario where A, B and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.\
    Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.\
    _Example :_
    ```java
    class A{
        void msg(){
            System.out.println("Hello");
        }
    }
    class B{
        void msg(){
            System.out.println("Welcome");
        }
    }
    class C extends A,B{
        // suppose if it were

        public static void main(String args[]){
            C obj = new C();
            obj.msg();  // Now which msg() method would be invoked ?
        }
    }
    ```
    _Output :_
    ```shell
    Compile Time error
    ```

    - ***Multilevel single inheritance :*** When there is a chain of inheritance, it is known as multilevel inheritance. As you see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.\
    _Example :_
    ```java
    class Animal{
        void eat(){
            System.out.println("eating.");
        }
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("barking.");
        }
    }
    class BabyDog extends Dog{
        void weep(){
            System.out.println("weeping.");
        }
    }
    class TestInheritance{
        public static void main(Strign args[]){
            BabyDog d = new BabyDog();d.weep();
            d.bark();
            d.eat();
        }
    }
    ```
    _Output :_
    ```shell
    weeping.
    barking.
    eating.
    ```
10. **Method Overriding concept :**
    - ***Usage of Java method overriding :*** Method overriding is used to provide the specific implementation of a method is already provided by it's superclass.\
    Method overriding is used for runtime polymorphism.
    - ***Rules of Java Overriding :*** The method must have the same name as in the parent class.
        - The method must have the same parameter as in the parent class.
        - There must be an IS-A relationship (inheritance).

    ***Note :*** _A sub class object can  reference a super class variable or method if it is not overridden._

    - A super class object cannot reference a variable or method which is explicit to the sub class object.

11. **`super` keyword concept in Java :**
    - The `super` keyword in Java is a reference variable which is used to refer immediate parent class members.
    - Whenever you create an instance of a sub class, an _instance of its parent class is created implicitly,_ which is referred by `super` keyword.\
    _Example-1 :_
    ```java
    class Animal{
        String color = "white";
    }
    class Dog extends Animal{
        String color = "black";
        void printColor(){
            System.out.println(color);
            System.out.println(super.color);
        }
    }
    class TestSuper{
        public static void main(String args[]){
            Dog d = new Dog();
            d.printColor();
        }
    }
    ```
    _Output :_
    ```shell
    black
    white
    ```
    _Animal and Dog classes have a common property color. **If you print color property, it will print the color of the current class by default.** To access the parent property, you should use `super` keyword._  

    _Example-2 :_
    ```java
    class Animal{
        Animal(){
            System.out.println("animal is created");
        }
    }
    class Dog extends Animal{
        Dog() {
            super();
            System.out.println("dog is created");
        }
    }
    class TestSuper{
        public static void main(String args[]){
            Dog d = new Dog();
        }
    }
    ```
    _Output :_
    ```shell
    animal is created
    dog is created
    ```
    _The `super` keyword can also be used to invoke the overloaded parent class constructor, if arguments are there, then they should be specified accordingly._

12. **Dynamic method dispatch concept :**
    - Dynamic method dispatch is a process in which a call to an overridden method _is resolved at runtime_ rather than compile-time. Also, it is created _Runtime polymorphism._
    - In this process, an overridden method is called through the reference variable of a super class. The determination of the method to be called is based on the object being referred to by the reference variable.

13. **Abstract concept :**
    - `Abstraction` is a process of hiding the implementation details and showing only functionality to the user.
    - Abstraction let's you focus on what the object does instead of how it does it.
    - A class which is declared with the `abstract` keyword as an _abstract class_ in Java. It can have abstract and non-abstract methods (_i.e. method with the body only without its definition_).
    - ***Points to remember :***
        - An _abstract class_ must be declared with an `abstract` keyword.
        - It can have abstract and non-abstract _methods._
        - It _cannot_ be instantiated.
        - It can have constructor and static methods also.
        - It can have `final method` which will force the sub class not to change the body of the method.\
        _Example :_
        ```java
        abstract class Bike{
            abstract void run();
        }
        class Honda extends Bike{
            void run(){
                System.out.println("Running safely");
            }

            public static void main(String args[]){
                Bike obj = new Honda();
                obj.run();
            }
        }
        ```
        _Output :_
        ```shell
        Running safely
        ```
        _Here, **Bike** is an **abstract class** that contains only one abstract method `run()`. Its implementation is provided by the **Honda** class._

    ***Note : An abstract method should be defined in its sub class.***

14. **`final` keyword concept :**
    - The `final` keyword in Java is used to restrict the access of an item from its super class to a sub class. The Java `final` keyword can be used in many contexts.
    - ***Variable :*** A variable cannot be accessed in sub class.
    - ***Method :*** A method cannot called from sub class object.
    - ***Class :*** A class cannot be sub classes.\
***Note : If you make any class as `final`, you cannot extend it.***

15. **Concept of access modifiers :** The access modifiers in Java specify accessibility (_scope_) of a data member, methods constructors or class.

_This is the third part of the article series for **Java Concepts**, if you find it helpful than make sure to read the next article also. It is highly recommended that if you want to refresh the basic make sure to read previous articles also._

If you have any doubt, question or query related this topic, than feel free to contact me.

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
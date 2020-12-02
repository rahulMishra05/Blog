# Java Concepts : Part - 04

**In the previous parts of this article series we had covered some basic topics related to Java programming, which will give you an idea about Java programming, the topic which we had covered earlier are overview of Java, Java programming elements and Input/output handling in Java.**

**In this part we will see some concepts related to encapsulation in Java programming. Encapsulation is a broad and very important concept of _object-oriented programming_ (OPPs), and that's why I will recommend you to learn and explore more about it.**

1. **Java's two most innovative features are :**
    - Packages
    - Interface
2. **What is package ?**
    - A package is a container for the classes that are used to keep the class name space compartmentalized.
    - _Example :_ You can contain all classes related to all sorting programs in your own package.
3. **Why packages ?**
    - It allows flexibility to give same but to many classes, that is to avoid name space collision.
    - The packages in Java provide mechanism for manageable chunks.
    - In fact, a package is both a naming and a visibility control mechanism.
    - It supports reusability and maintainability.
4. **Advantages of packages :**
    - Packages provide code reusability, because a package contains group of classes.
    - It helps in resolving naming collisions when multiple packages have classes with same name.
    - Package also provides the hiding of class facility. Thus, other program cannot use the classes from hidden packages.
    - Access limitation can be applied with the help of package.
    - Nesting of a package, that is one package can be defined in another package in a hierarchy fashion.
5. **Built-in packages in Java :**
    - Packages are nothing more than the way we organize files into different directories according to their functionality, usability as well as category they should belong to. A Java package is a Java programming language mechanism for organizing classes into name space.
    - In Java, already many predefined packages are available, those are to help programmers to develop their software in an easy way.
    - _Example :_ `java.swing` is a package in Java providing all the basic support in developing GUI programs.
6. **Package in Java :**
    - Code reusability is the main philosophy of _object-oriented programming._
    - To power this advantage, Java has a number of _package called API bundle with the JDK._
    - Packages are "collection of classes and interface" to facilitate a number of readymade solutions.
    - A great _knowledge of packages help as a Java developer_ to master in Java solutions.
    - In addition to the API, user maintains their own packages.
7. **Using API packages :**
    - A package is a collection of classes and each class is a collection of member and methods.
    - Any class as well as any member and method in a package are accessible from a Java program.
    - This can be achieved in Java by `import` statement.
    - There are two ways of using `import` statement.
        - ***With fully quantifies class name*** : When it is required to access a particular class.
             - _Example :_ `java.lang.String`
        - ***With default quantification :*** When it is required to access a number of classes.
            - _Example :_ `java.lang.*;`
    - However, instead of importing whole package or a class it is possible to refer a class in order to instance an object.
        - _Example :_ 
        ```java
        java.util.Date toDay = new java.util.Date();
        System.out.println(toDay);
        ```
    - The same thing but with import statement can be done as follows.
        - _Example :_
        ```java
        import java.util.Date;
        Date toDay = new Date();
        ```
8. **Package naming conventions :**
    - Packages are usually defined using a hierarchical naming patter, with levels in the hierarchy separated by periods(.).
    - Although package lower in the naming hierarchy are often referred to a _sub package_ of the corresponding packages higher in the hierarchy, there is no semantic relationship between packages.
9. **Organizational package naming conventions :**
    - Package names should be _all lowercase characters_ whenever possible.
    - Frequently, a package name begins with the top level domain name of the organization and then the organization's domain and then any sub-domains listed in the reverse order.
    - The organization can then choose a specific name for their package.
10. **user defined packages :** In addition to this, following steps must be taken into consideration.
    - Use package statement at the beginning of the package file.
    - Define the class that is to be put in the package and declare it as public.
    - Create a sub directory with the same name as the package name.
    - Store the file with same name as the classname.java in the subdirectory created.
    - Store the compiled version (i.e. class) file into the same sub-directory.
11. **Package design guidelines :**
    - Only closely related classes should belong to the same package.
    - Classes that change together should belong to the same package.
    - Classes that are not reused together should not belong to the same package.
12. **Package declaration is file bases :**
    - All classes in the same source file belong to the same package.
    - Each source file may contain an optional package declaration in the following form. `package <packageName>;`
    - Let us consider the source file `ElevatorFrame.java`\
    _Example :_
        ```java
        package elevator;
        public class ElevatorFrame{
            public double x;
        }
        ```
    - The package declaration at the top of the source file declares that the _ElevatorFram_ class belongs to the package named _elevator._
    - When the package declaration is absent from a file, all the classes contained in the file belong to unnamed package.
    - A class in a named package can be referred in two ways.
13. **More on user defined packages :**
    - Create a directory named P.
    - Store the class A in the file A.java in it.
    - Compile A.java and place it in directory P.
    - Store the class B in the field B.java in it.
    - Compile B.java and place it in the directory P.
    - `import P.*;`
        - Will import all classes in the packages
    - ***Note :*** **We cannot put two or more public classes together in a `.java` file, otherwise there will be an ambiguity in naming the `.java` file.**
14. **Finding packages and CLASSPATH :**
    - Consider the following package specification :
        - Package `MyPack`;
    - For a program to find `MyPack`, one of three things must be true.
        - The program can be executed from a directory immediately above `MyPack`.
        - The CLASSPATH must be set to include the path to `MyPack`.
        - The -classpath options must specify the path to `MyPack` when the program is run via Java.
15. **Importing a package :**
    - This is the general form of the import statement.
        - `import pkg1 [.pkg2].(<classname> | *);`
    - Here, pkg1 is the name of a top-level package. Pkg2 is the name of a sub-ordinary package inside the outer separated by a dot(.).
    - There is no practical limit on the depth of a package hierarchy, expect that imposed by the file system.\
    Finally, you specify either an explicit class or a star(*), which indicates that Java compiler import the entire package.\
    _Example :_ 
        ```java
        import java.util.Date;
        import java.io.*;
        ```
16. **Using package :**
    - Class in named package can be referred to in two different ways. Import a class or all the classes in the designed package using `import packageName.<className>;`\
    _Example :_ The _ElevatorPanel_ class in package elevator can simply be referred to as elevator when either of the following import classes occurs at the top of source file. `import elevator.*;`
17. **Access protection :**
    - Because of the interplay between classes and packages, Java addresses four categories of visibility for class members.
        - Sub classes in the same package. 
        - Non-sub classes in the same package.
        - Sub classes in different package.
        - Classes that are neither in the same package nor sub classes.
    - The three access modifiers, `public`, `private`, `protected`, provide a variety of ways to produce the many levels of access required by these categories.
    - ***Note :*** **Default is not used because it ahs scope only in the same program file/ package in which it is defined.**
18. **Few important facts about `Abstract` class :**
    - Any class with _an abstract method is automatically abstract_ itself, and must be declared such.
    - A class may be declared abstract _even if it has no abstract_ method. This prevents it from being instantiated.
    - A sub class of an abstract class is instantiated if it overridden each of the abstract method of its super class and provide an implementation (i.e. a method body of all of them).
    - If sub class of an abstract class _does not implement all the abstract_, it inherits that _sub class is itself abstract._
19. **Multiple inheritance in Java :**
    - However, this is not possible as Java does not support multiple inheritance.
    - Java's solution to this problem is called interface.
20. **Multiple inheritance and interface :**
    - Java does not support multiple inheritance.
    - Java supports an alternative approach to this OPP feature known as interface.
    - ***What is an interface ?***
        - An interface is basically _a kind of class._ Like classes, an interface contains _member_ and _methods_, unlike classes, in interface, _all members are final and all methods are abstract._
21. **Interface concepts :**
    - An interface defines a protocol of behavior that can be _implement by any class_ anywhere in the class hierarchy.
    - An interface _defines_ a set of methods but _does not implement_ them. A class that implements the interface agree to implement all the  methods defined in the interface, thereby agreeing to certain behavior.
    - An interface is a named collection of methods definitions _(without implementations)._ Interface reverse behavior for classes that implements them.
    - Method declared in an interface _are always public and abstract,_ Java compiler will not complain if you omit both keywords. _Static methods cannot be declared_ in the interface these methods are never abstract and do not express behaviors of objects.
22. **Basic concept of inheritance :**
    - Using the keyword interface, one can define an abstract class.
    - Interface are syntactically _similar to classes,_ but they lack _instance variables,_ and _their methods are defined without any body._\
    _Example :_
        ```java
        interface callMe{
            void callL(int p);
        }
        ``` 
23. **Properties of interface :**
    - Interface must be declared with the keyword _interface._
    - All interface methods are _implicitly public and abstract._ In other words, you do not need to actually type the public or abstract modifiers in the method declaration, but method is still always public and abstract.
    - All variables, defined in an interface is _public_, _static_ and _final_. In other words, interface can declare only constants, _no instance variable._
    - Interface methods must not be static.
    - Because interface methods are abstract, they cannot be marked final.
    - An interface can extends one or more other interfaces.
    - An interface cannot implements another interface or class.
    - Interface types can be used polymorphically.
24. **Extending interface :**
    - Interface can inherit other interface.
    - Interface can also multiply inherit.

_This was a detailed theoretical explanation of the OPPs concept **Encapsulation**, in which we had seen different sub topics which are equally important and have a great impact on Java programming. I recommend you that if you do not understand any part of this article then just go to Google or YouTube and search about it, make sure that at the end of the day you learn something._

If you have any doubt, questions or query related to the above articel or in general as well, then feel free to conatct me.

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
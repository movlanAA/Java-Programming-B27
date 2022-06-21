
# Java Cheat Sheet

---
### This document will highlight the main points of the topics we cover.
#### Last updated: 06/21/2022

---

## Introduction to Programming

* computers understand binary. A language of 0s and 1s

```
   Ex: 
        00000000 -> 0
        00000100 -> 4
        10000000 -> 128
        11111111 -> 255
```

* In order to represent all characters in a computer there needs to be some way to represent characters as binary. This is done by a system that correlates numbers to a character. The number for a character can be converted to binary for the computer to process it. 

* Unicode is global standard for these number/character correlations. There are different encoding formats that determine which character is related to which number. One common encoding used is UTF-8, which is equivalent to ASCII (American Standard Code for Information Interchange), 

```
    Ex:
      Character <-> Number
          A     <->   65
          Z     <->   90
          a     <->   97
          z     <->   122
          !     <->   33
          *     <->   42 
```

* Programmers use programming languages, so they don't need to write in binary. High level languages, like Java, help a programmer write human understandable code that can later be compiled to a lower level language for the computer to understand. 

* A java program is written in a .java file. That file is compiled into a bytecode file that has the .class extension. Bytecode files are run in the JVM. The JVM interprets the bytecode as it is run.
  * JVM: Java virtual machine that allows java programs to run

---

## IntelliJ

* IntelliJ is an IDE(Integrated Development Environment) that helps us write java code
  * We could write, compile and execute java files without an IDE, but it would be slightly more difficult. IDEs make it easier by offering many shortcuts, hints, and warnings. They also allow us to compile and execute programs with a click of a button.

* We use the ultimate version of IntelliJ which is a paid version of the tool. We give everyone a year licence to be able to use this version. The paid version has a couple extra features we will use later on
    * The community edition is the free version and is just as useful. It is only missing a couple extra features provided

### Workflow in IntelliJ
    - We work in a project
    - The project has a source/root folder called src
    - We created packages in the src. Packages are folders that will help organized java files
    - In the packages we create java classes, java files to write java code

---

## Java Basics

### Java classes: In a java file there is a class defined. The class has the same name as the java file. For now all we know is classes are where we write java code

  ``` java
  public class HelloWorld {
  
  }
  ```

### Main method: How we can run java code. We will understand all the parts later.
  ``` java
  public static void main(String [] args) {
  
  }
  ```

### Print statement: Used to print information to the console
  ```
    System.out.println();
  ```

#### First program to display `Hello World` to the console
  ```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
  ```
---

### Comments
#### Comments allow regular text to be written in a java file. Comments are helpful to explain how the code works for others and for your future self
```java
  
// single line comments can create a comment on one line using two forward slashes

/*
        multi line comments are declared with slightly different syntax and allow you to type comments on multiple lines
 */

/**
 *      The java doc comments help to create documentation from the java code written. 
 *      We will not need to use this comment, but we will see it used in official documentation and files
 */


```
### Escape Sequences  
#### This is a smaller topic and will not need to be used much, but they can provide some useful functions to characters within a String (double quotations)
#### When you want to add a character to a String that is also used in java syntax the backslash can be used to differentiate syntax between the character
```
Common uses:
  \n -> goes to next line
  \t -> adds a tab
  \\ -> adds a backslash character
  \" -> adds a double quotation character
```
___

## Variables
#### A variable is a way to define information into a reusable container. Variables in java are created by defining a data type and a name. After declaring a variable can be assigned a value and used as many times as needed

```
  Syntax:
      datatype variableName = value;
  Ex: 
      int num = 100;
```

#### It is possible to declare variables to get them ready to be used and then later assign them. It is also possible to declare and assign variables at the same time. Both are commonly used. It is also possible to declare/assign multiple variables that share the same datatype by using a comma to separate the variables
``` 
  declaring
    int a;
    
  assigning
    a = 1;
    
  declaring & assigning
    int b = 130;
    
  declaring multiple
    byte a1, a2, a3;
    
  declaring & assigning multiple
    short s1 = 5, s2 = 10, s3 = 15;
  
```

### Data types
#### Java has two kinds of datatypes: primitive datatype and non-primitive types(We will spend more time on these later)

```
Primitive datatypes:
    byte
    short
    int 
    long
    float
    double
    char
    boolean
```
#### `byte`, `short`, `int`, and `long` are used to hold whole numbers. They differ in the amount of memory they use, and as a result how big of a number can be held. `int` is the most commonly used type, and it is also the default for whole numbers for the compiler
#### `float` and `double` are used to hold floating numbers. `double` is the most commonly used type, and it is also the default for floating numbers for the compiler
#### `char` is used to hold a single character. The single quote ' ' is used to hold these characters
#### `boolean` can have a value of `true` or `false`

#### `String` is a non-primitive type. It is used to hold sequences of characters using double quotations " "
> We will fully understand what String is and how it works later

#### Concatenation (+) is used to combine two pieces of information together. At least one of the information being combined must be a String. The result of the concatenation is a String.
  ```
    Ex:
      String a = "hello"
      System.out.println(5 + a + 10); -> results in 5hello10
  ```

#### Primitive type casting: Converting from one primitive datatypes to another 

  > Order from the smallest type to the biggest type: byte -> short -> int -> long -> float -> double

  - Widening Convention is when you go from a smaller datatype to a bigger datatype. This direction is done automatically and does not require anything
    ```
    Ex:
      int i = 5;
      double d = i;
    ```
  - Narrowing Convention is when you go from a bigger datatype to a smaller datatype. This direction require manually casting the types to the smaller type. Casting is done with the smaller datatype in parentheses
  
> General syntax for casting: 
  >>smallerType varName = (smallerType) biggerType

```
    Ex:
      double a = 9.99;
      int b = (int)a;
``` 

  - Casting from a bigger datatype to a smaller datatypes has the possibility for data loss. If a datatype cannot hold the value being assigned to it, there will be a calculation run for represent how much data was lost. When casting floating number to whole numbers the floating numbers are also lost. No rounding happens

---

### Operators

#### Arithmetic Operators
  Operators used to perform arithmetic calculations
  ``` 
	+ addition
	- subtraction
	* multiplication
	/ division
	% remainder/modulus
  ```
- Arithmetic operations between two different datatypes result in the biggest datatype between the two

- When you do arithmetic operations with short or byte the values are changed to int for the calculation, so the result of the operation is int

#### Shorthand operators:
  Shorter syntax to use the arithmetic operators and update the value of the variable without having to manually reassign

  ``` 
    +=
    -=
    *=
    /=
    %=
  ```
```

  Ex:
    normal use:
    
      int a = 10;
      a = a + 4; // a would have a value of 14 because the original value of a is taken, 4 is added to it, and then the result is reassign back into the variable
      
    shorthand use:
    
      int b = 6;
      b += 6; // b would have a value of 12 after this line because 6 is added to the original value of the variable and that result is automatically stored into the variable. The variable updates

```

#### Unary operators:

  ```
    +       (plus) positive number
    -       (minus) negative number
    ++      incrementing, adding 1
    --      decrementing, subtracting 1
    
    Pre and Post operations:
    
        Given int num = 0;

        pre-increment: increments the value before it is used in the expression
                ++num

        pre-decrement: decrements the value before it is used in the expression
                --num

        post-increment: increments the value after it is used in the expression
                num++

        post-decrement: decrements the value after it is used in the expression
                num--

    **** We will primarily use post incrementing and we will not need to worry about the post functionality of it

  ```

#### Relational Operators
  used to compare values. The result is a boolean value
```
  > greater than
  >= greater than or equal to
  < less than
  <= less than or equal to
  == equals: checks if two values are the same
  != not equals: checks if two values are not the same
```
> Q: What is the difference between `=` and `==`
  >> we use the `=` as the assignment operator
> 
  >>we use the `==` to compare the values to check if they are equal

#### Logical Operators
  used to compare booleans. The result of a boolean value

```
  && and --> both boolean statements must be true for an and expression to be true
  || or --> at least one boolean statement must be true for the expression to be true
  ! not --> used to check the opposite value of a boolean
  
  short circuit: 2 operators form (&& ||) is more efficient in execution. 
  If the result of the logical operators is known the remain code on a line does not need to be executed
```

#### Overall precedence of operators
```
  Execution goes top to bottom. Left to right. Each operator in the same line is same priority so it executed left to right.
  
    ! + - ++ -- 
    * / %
    + -
    < > <= >= 
    == !=
    &&
    ||
    = += -= *= /= %=
```

---

### Scanner: WIP







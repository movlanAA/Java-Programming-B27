
# Java Cheat Sheet

---
### This document will highlight the main points of the topics we cover.
#### Last updated: 07/21/2022

---
## Shortcuts
```
reformat code:
	mac: option + command + l
	windows: control + alt + l

search anything
    shift + shift
    
search inside of the files:
    command/control + shift + f
```

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

### Scanner

`Scanner` is a class that has methods to allow inputs of information from different sources. We will use the `Scanner` methods to type in the console to create some dynamic programs. In the future the dynamic aspect will come from testing applications

> We will learn what classes and methods are in more details in the future

1) To use `Scanner` we need to `import` the class
   > Importing allows a file to be used outside the package it was created in. We need to import the Scanner class to use it

   > We will learn importing better in the future as well

Add the import line between the `package` and the `class`
```java
import java.util.Scanner;
```

2) Create a `Scanner` object
  > creating an object will allow us to use the methods(code) that is already written to type in the console
```
 Syntax:
    Scanner input = new Scanner(System.in);
```
  - instead of `input` its possible to use any name, because it is just a name for the object. Common names are scan, keyboard, scanner, in

> the name of the object is better known as the reference, but that is something we will learn more about later

3) Use the `Scanner` methods
  to use the methods we need to call them from the object:
```
scannerObj.method();

Scanner methods:
  nextByte()
  nextShort()
  nextInt()
  nextLong()
  nextFloat()
  nextDouble()
  nextBoolean()
  next(): returns a String, but only accepts one word
  nextLine(): returns a String, and can allow multiple words, but also accept the enter input
```
> Known issue with nextLine():
> 
> Since the nextLine() method accepts the enter inputs it can cause issues whenever trying to use it with the other Scanner methods. Whenever a different Scanner method, besides nextLine() is used before the nextLine call there is a problem because when typing in the console the enter key is used to submit the info and continue the program to the next line, but that enter input is also finishing the nextLine call without allowing you to type any for that call.
> 
> The fix is to add an extra nextLine() call between the two Scanner methods 

---

# Conditional Statements

### If statements: Allow you to control how the program will be executed based on boolean expressions
  Types of is statements:
  - `single if`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the code will resume execution after the if statement
    
  > has one boolean expression 

    ```
    if(boolean_expression){
    
    }
    ```
  - `if else`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the else block will be executed

  > has one boolean expression

    ```
    if(boolean_expression){
    
    } else {
    
    }
    ```
  - `multi branch`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the next boolean expression is checked and so on. Whenever a boolean is true that related block of code is executed

  > has multiple boolean expressions

    ```
    if(boolean_expression){
    
    } else if(boolean_expression){
    
    } else {
    
    }
    ```
  - `nested if`: if statement that is defined in another if statement.

    ```
    if(boolean_expression){
    
        if(boolean_expression){
    
        }
    
    } else {
    
    }
    ```

Note: If statements can be declared without any curly brackets. If they are the first line after the statement is the block related to the if statement, but it is not readable and cannot work when there is multiple lines that belong to one block, so in general you should always use brackets

### Ternary 
  alternative way to write `if` statements

  syntax:
> returnValue = boolean_expression ? trueValue : falseValue

  The `?` is treated as `if`

  The `:` is treated as `else`

  ```
  Example:
    
    String s = 2 > 5 ? "Two" : "Five";
  ```
---

### Switch:
> A conditional statement that is useful when the possible values are known. Only useful for comparing exact values
>
> One of the key component of the switch in comparison to `if statements` is how execution of a switch is handled.
> Not all "conditions" or in this case "cases" are checked like they would be in an if statement. When the switch gets a value it will immateriality jump to the case and begin execution from that point top to bottom until the end of the switch or a `break` keyword.

```
    syntax:
    
	switch(input value){
		case x:
		   // statements
		   break;
	}       
```

#### Keywords for switch:
   - `case`: used to define the exact value that is being checked for and define the code that should be executed when the case is matched
        - valid input value types: byte, short, int String, char
        - NOT valid types: double, float, boolean
    
   - `default`: the case that is executed if no other case is matched. Acts similar to an else block in an if statement. The default is optional, if a switch doesn't have a default and the value given is not defined as a case nothing is executed. The default case can be anywhere in the switch. The order of the cases does not matter for matching

   - `break`: stops the switch statement execution

#### Benefit of switch statements: readable, easy to maintain, generally quicker execution compared to a multibranch if statement

---
#### If statement vs Switch vs Ternary
	In most cases you will use if statements
	any switch or ternary can always be converted to an if statement
	If statements allow more flexibility by using single if, if else, multi branch, or nested 

	Switch is useful to compare the exact value, so it is a good choice when all the possible values are known (they will be the cases)
	Downsides: only compare values, no boolean logic, and the datatypes that can be compared are a little restrictive

	Ternary useful sometimes to make a quick single if statement in one line
	Can only be used when a value is returned, and you need to at least define two possible outputs

---

## String

- `String` is a class located in the `java.lang` `package`
   - the `java.lang` `package` is automatically imported because it has classes/files that are used regularly in java code

- `String` are `immutable`, which means after the object is created it cannot be changed

- Strings can be created in two ways:
  - `literal`: using double quotations | **The way we will usually create Strings**
    ```
        String s = "java";
    ```
    > String literals are created in the String pool which is a special memory location to handle the commonly used datatype. The String pool is located in the `heap`
  - using `new` keyword -- **we will talk about object creation more in the future**
    ```
        String s = new String("java")
    ```
    > objects created using `new` are created directly in the `heap` memory where all objects are created
    
Note: Do not use `==` to compare Strings. Strings are objects so the `==` compares the objects not the values

- Every character in a String has an `index`. Indexes start from 0. Indexes can be helpful with some methods to get certain characters. Whenever an index is used that does not exist the program will stop with : `StringIndexOutOfBoundsException`

#### String methods: methods are used to do some action with String objects. Use a method by calling the String `object.method()`

Return boolean
```
equals(): checks if two objects have the same characters. Does check for case sensitivity

equalsIgnoreCase(): checks if two objects have the same characters, but it will ignore the case sensitivity

startsWith(str): checks if the String object starts with the characters defined in the parenthesis

endsWith(str): checks if the String object ends with the characters defined in the parenthesis

contains(str): checks if the String object has the given characters defined in the parenthesis anywhere in the String

isEmpty(): checks if the String has no characters

isBlank(): checks if the String has only white space characters and no other characters
```
Return String
```
toUpperCase(): converts the characters all to uppercase

toLowerCase(): converts the character all to lowercase

trim(): removes any spaces from the beginning and end of the String

substring(): returns part of the String
    (int): the String returned will start from the index that was given in the parenthesis and keep every character until the end of the String
    (int, int): the String returned will start from the given index in the parenthesis and will include all the character up to the second given index number. Not including that ending index
    
replace(): allows you to modify/change a certain character/s to another given character/s. Replaces all of the occurrences of the character in the String    
    (char, char) first give the char you want change, second one is the char you are changing to   
    (String, String) first give the String you want change, second one is the String you are changing to   
    
replaceFirst(): replaces the first instance of the given String
    only works with Strings in the parenthesis     			
```
Return int
```
length(): checks how many characters are in the String

indexOf(): return an int(index) where the given character/s is located in the String. 
    If the character does not exist in the String -1 is returned
    (char): give a char in the parenthesis and it returns the index where that character is found. Only return the first occurrence of the character
    (String): give a String in the parenthesis it will look for that sequence of characters in the String and if its find that sequence it will return the index of the first character in the sequence
    (char/String, int):  give a String or a char, the value you are searching the index of, then you give a number which is the starting point to search from(starting point)
    
lastIndexOf(): returns an int(index) of the given parenthesis value, but the first occurrence of the value from the end of the String    
```
Return char
```
charAt(int): returns the character at the given index number from the parenthesis
```

Note: There is more methods that exist, we can not learn every single method created, there is many files, classes, libraries we will use that all have so many useful method. We need to get an idea of some common functions of Strings for now. For the full list of String methods check the oracle documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

---

# Loops

Used to execute the same statements multiple times

> Loop types:

    - while loop: evalualtes a boolean expression to determine if the loop should iterate again
        - if the boolean expression is true: the statements in the loop body are executed
        - if the boolean expression is false: the loop stops

        while(boolean) {
            // statements
        }   

    - do while: one iteration of the statements is always guaranteed then the boolean expression is checked to determine if the loop continues or not
        - if the boolean expression is true: the loop repeats and code statements are executed again
        - if the boolean expression is false: the loop stops

		do {
                // statements
		} while(boolean);

    - for loop: used when the iterations are known. Useful loop type because of the ability to define the parts exactly how you need to use them. Has built in functions of how code is executed

        for(initialization; termination condition; update){
            // statements
        }
        
        flow of loop: variable from initialization part is created for the loop. This part only runs once. Then the boolean expression in the termination condtition is checked. If the boolean is true the statement in the loop are executed. Finally to finish an iteration the update part is executed. From there the boolean experssion is checked again and the cylce repeats until the boolean is false

> Note: When a loop's boolean expression will never change to false the loop will continue to execute making it an infinite loop.

> break & continue
>
>       break: stops and exits the loop
> 
>       continue: skips the rest of the current iterations 

#### Nested loop
> A nested loop is a loop inside another loop. 

```
Execution of a nested loop:
the outer loop executes one iteration at a time
but during each execution of the outer loop, the inner loop is executed from beginning to end each time
the inner loop starts and ends each iteration of the outer loop

    Example:
    
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 2; j++) {
            
            }   
        }
```
---
## Array
    storing multiple information of similar type to one object
    instead of using mutliple variables we can use an array to group that inforamtion

#### Declaring array:

```	
declaring with values/elements

    dataType[] name = {element, elm, elm ,etc};
    String[] words = {"java", "testing", "Friday"};
```
```
declare an empty array - the array will have default values based on type

    dataType[] name = new datatType[size]
    String[] strs = new String[5];
    
    default values of different types:
        whole number: 0
        floating number: 0.0
        boolean: false
        object: null
```
### Access Elements
```
elements have an index, start from 0
arrayName[index] --> use this to read a value: use information from that array
```
### Changing/Reassigning Elements
```
arrayName[index] = value --> use this to write to the array: put information into the array
```
### Printing an array
```
Trying to print the array reference will not show the elements, but instead some hash about the object in the memory

To print an array we need to use the utility class and its method:
    Arrays.toString(arr) -> returns a String format of the array
```

### For each loop
    a loop used to iterate elements from a collection/data strcuture
    
    we know arrays at this point
    
        for(datatype variableName: array) {
        
        }   

    flow: goes from the first element to the last always, every iteration the variableName represent every element, one element at a time
    
    the variableName is the same as arrayName[i] in a for loop where i is the index from 0 to the end of the array

> Note: The for each loop can only be used when reading/using information from the array, but whenever specific indexes are needed, or the array needs to be modified then the for each loop cannot be used
---
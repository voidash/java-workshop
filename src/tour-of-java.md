# Tour of Java

## Printing

### Basic Print Command
The print command `System.out.println("Hello world!");` prints the text "Hello world".

**Example:**
```java
System.out.println("Hello world!");
```
**Output:**
```
Hello world!
```

### Program Boilerplate
In Java, programs require some boilerplate code. The program name must correspond to the file name (e.g., `Example.java`).

**Example:**
```java
public class Example {
    public static void main(String[] args) {
        System.out.println("Text to be printed");
    }
}
```
**Output:**
```
Text to be printed
```

### Printing Multiple Lines
Each command is placed on a new line.

**Example:**
```java
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("... and the universe!");
    }
}
```

**Output:**
```
Hello world!
... and the universe!
```

### Terminology and Code Comments
**Command Parameters:**
Information to be printed by the `println` command is passed inside the parentheses.

**Semicolon Separates Commands:**
Commands are separated with a semicolon `;`.

**Comments:**
- Single-line comments: `//`
- Multi-line comments: `/* ... */`

**Example:**
```java
public class Comments {
    public static void main(String[] args) {
        // Single-line comment
        System.out.println("Text to print");
        /* Multi-line comment
           with multiple lines */
        System.out.println("More text to print");
    }
}
```

### Reading Input

Input refers to text written by the user and read by the program, always as a string. Use the `Scanner` tool from Java to read input.

**Setup:**
```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use the scanner tool to read input
    }
}
```

### Example Program
A program that asks for user input, reads the string, and prints it.

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println(message);
    }
}
```
When run, the output looks like:
```
Write a message:
Hello world
Hello world
```

### Fundamentals of Strings
Strings are sequences of characters. They can be printed directly or stored in variables.

**Variable Declaration:**
```java
String message = "Hello world!";
System.out.println(message);
```
**Output:**
```
Hello world!
```

A common mistake is putting quotation marks around variable names, which prints the name instead of the value.
```java
String message = "Hello world!";
System.out.println("message");
```
**Output:**
```
message
```

### Concatenation - Joining Strings Together
Join multiple strings using the `+` operator.

**Example:**
```java
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello " + "world!");
    }
}
```

Join string literals with string variables.
```java
public class Program {
    public static void main(String[] args) {
        String message = "Hello world!";
        System.out.println(message + " ... and the universe!");
    }
}
```
**Output:**
```
Hello world! ... and the universe!
```

Combine multiple strings.
```java
public class Program {
    public static void main(String[] args) {
        String start = "My name is ";
        String end = ", James Bond";
        System.out.println(start + "Bond" + end);
    }
}
```
**Output:**
```
My name is Bond, James Bond
```

### Reading Multiple Inputs
Read user input multiple times and print it.

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = scanner.nextLine();
        System.out.println("Write the second string:");
        String second = scanner.nextLine();
        System.out.println("Write the third string:");
        String third = scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
```
**Output:**
```
Write the first string:
The first
Write the second string:
second
Write the third string:
third
You wrote:
The first
second
third
```

### Using Input in Output
Combine user input with string literals.

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something: ");
        String message = scanner.nextLine();
        System.out.println("You wrote " + message);
    }
}
```
**Output:**
```
Write something:
this
You wrote this
```

### Combining Multiple Strings
Form more complex texts based on user input.

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = reader.nextLine();
        System.out.println("Write the second string:");
        String second = reader.nextLine();
        System.out.println("Write the third string:");
        String third = reader.nextLine();

        System.out.println("Last string you wrote was " + third + ", which ");
        System.out.println("was preceded by " + second + ".");
        System.out.println("The first string was " + first + ".");
        System.out.println("All together: " + first + second + third);
    }
}
```
**Output:**
```
Write the first string:
One
Write the second string:
two
Write the third string:
three
Last string you wrote was three, which
was preceded by two.
The first string was one.
All together: onetwothree
```

### Variables

#### Variable Types and Assignment
- **String**: Stores text. 
  ```java
  String text = "contains text";
  ```
- **int**: Stores whole numbers.
  ```java
  int wholeNumber = 123;
  ```
- **double**: Stores floating-point numbers.
  ```java
  double floatingPoint = 3.141592653;
  ```
- **boolean**: Stores true or false.
  ```java
  boolean trueOrFalse = true;
  ```

#### Output Example
```java
System.out.println("Text variable: " + text);
System.out.println("Integer variable: " + wholeNumber);
System.out.println("Floating-point variable: " + floatingPoint);
System.out.println("Boolean: " + trueOrFalse);
```

#### Variable Rules
- **Unique Names**: Each variable must have a unique name.
- **Declaration and Initialization**: 
  ```java
  int value = 10;
  value = 4;  // Value changes but type remains int.
  ```
- **Type Consistency**: A variable’s type cannot be changed after declaration.
  ```java
  boolean flag = false;
  flag = 42;  // Error: cannot assign int to boolean.
  ```

#### Variable Naming Conventions
- Use descriptive names and camelCase.
  ```java
  double surfaceArea = pi * radius * radius;
  ```
- Avoid special symbols, spaces, and starting names with numbers.
  ```java
  int variable7 = 4;  // Allowed.
  ```

#### Input Reading and Conversion
- **Strings**: Read directly.
  ```java
  Scanner scanner = new Scanner(System.in);
  String text = scanner.nextLine();
  ```
- **Integers**: Convert from string.
  ```java
  int value = Integer.valueOf(scanner.nextLine());
  ```
- **Doubles**: Convert from string.
  ```java
  double value = Double.valueOf(scanner.nextLine());
  ```
- **Booleans**: Convert from string.
  ```java
  boolean value = Boolean.valueOf(scanner.nextLine());
  ```

#### Summary Program Example
```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        System.out.println("Enter an integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter a double:");
        double floatingPoint = Double.valueOf(scanner.nextLine());
        
        System.out.println("Enter a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("String: " + text);
        System.out.println("Integer: " + integer);
        System.out.println("Double: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);
    }
}
```

### Calculating with Numbers

#### Basic Operations and Precedence
- **Addition** (`+`), **Subtraction** (`-`), **Multiplication** (`*`), and **Division** (`/`) are straightforward.
- **Precedence**: Multiplication and division are performed before addition and subtraction. Parentheses alter the order of operations.

```java
int first = 2;
System.out.println(first); // prints 2
int second = 4;
System.out.println(second); // prints 4

int sum = first + second;
System.out.println(sum); // prints 6
```

#### Using Parentheses
- Operations inside parentheses are performed first.

```java
int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
System.out.println(calculationWithParentheses); // prints 23

int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
System.out.println(calculationWithoutParentheses); // prints 13
```

#### Expression and Statement
- An **expression** is a combination of values that results in another value.
- The expression is evaluated before assigning its result to a variable.

```java
int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
System.out.println(first + second); // prints 6
System.out.println(2 + second - first - second); // prints 0
```

#### Printing and Concatenation
- The `System.out.println` command prints the value of a variable.
- The `+` operator can concatenate strings and other types.

```java
int length = 42;
System.out.println("Length " + length); // prints Length 42

System.out.println("here is an integer --> " + 2); // prints here is an integer --> 2
System.out.println(2 + " <-- here is an integer"); // prints 2 <-- here is an integer

System.out.println("Four: " + (2 + 2)); // prints Four: 4
System.out.println("But! Twenty-two: " + 2 + 2); // prints But! Twenty-two: 22
```

#### Combining Text and Variables in Print Statements
- Expressions can be used in `System.out.println`.

```java
int x = 10;
System.out.println("The value of the variable x is: " + x);

int y = 5;
int z = 6;
System.out.println("y is " + y + " and z is " + z);
```

#### Division

- **Integer Division**: Results in an integer.

```java
int result = 3 / 2;
System.out.println(result); // prints 1
```

- **Floating-Point Division**: At least one operand must be a floating-point number.

```java
double whenDividendIsFloat = 3.0 / 2;
System.out.println(whenDividendIsFloat); // prints 1.5

double whenDivisorIsFloat = 3 / 2.0;
System.out.println(whenDivisorIsFloat); // prints 1.5
```

- **Type Casting**: Converting integers to floating-point numbers.

```java
int first = 3;
int second = 2;

double result1 = (double) first / second;
System.out.println(result1); // prints 1.5

double result2 = first / (double) second;
System.out.println(result2); // prints 1.5

double result3 = (double) (first / second);
System.out.println(result3); // prints 1.0
```

- **Multiplying to Convert to Double**:

```java
int dividend = 3;
int divisor = 2;

double result = 1.0 * dividend / divisor;
System.out.println(result); // prints 1.5
```

### Conditional Statements

- Conditional statements allow programs to execute different code based on certain conditions.

```java
System.out.println("Hello, world!");
if (true) {
    System.out.println("This code is unavoidable!");
}
```
- Outputs:
  ```
  Hello, world!
  This code is unavoidable!
  ```

#### Using Conditional Statements
- Conditional statements use the `if` keyword followed by a boolean expression in parentheses. The code block inside `{}` executes if the expression is true.

```java
int number = 11;
if (number > 10) {
    System.out.println("The number was greater than 10");
}
```

#### Code Blocks and Indentation
- Code blocks are enclosed in `{}` and define the scope and structure of the program.
- Proper indentation (4 spaces or 1 tab) is crucial for readability and avoiding errors.

```java
if (number > 10) {
    number = 9;  // Correctly indented
}
```

#### Comparison Operators
- Used to compare values:
  - `>` greater than
  - `>=` greater than or equal to
  - `<` less than
  - `<=` less than or equal to
  - `==` equal to
  - `!=` not equal to

```java
int number = 55;
if (number != 0) {
    System.out.println("The number is not equal to 0");
}
if (number >= 1000) {
    System.out.println("The number is at least 1000");
}
```

#### Else and Else If
- `else` provides an alternative block of code if the `if` condition is false.
- `else if` allows checking additional conditions.

```java
int number = 4;
if (number > 5) {
    System.out.println("Your number is greater than five!");
} else {
    System.out.println("Your number is five or less!");
}
```

#### Logical Operators
- Combine multiple conditions:
  - `&&` (and) - true if both conditions are true
  - `||` (or) - true if at least one condition is true
  - `!` (not) - inverts the boolean value

```java
int number = 7;
if (number >= 5 && number <= 10) {
    System.out.println("It is within the range 5-10.");
}
if (number < 0 || number > 100) {
    System.out.println("It is less than 0 or greater than 100.");
}
if (!(number > 4)) {
    System.out.println("The number is not greater than 4.");
}
```

#### Working with Boolean Variables
- Boolean variables store `true` or `false`.

```java
boolean isItTrue = true;
if (isItTrue) {
    System.out.println("Pretty wild!");
}
```

#### Modulo Operator
- The `%` operator returns the remainder of a division, useful for checking divisibility.

```java
int remainder = 7 % 2;
System.out.println(remainder); // prints 1
```

#### Comparing Strings
- Use `.equals` method to compare strings instead of `==`.

```java
Scanner reader = new Scanner(System.in);
String first = reader.nextLine();
String second = reader.nextLine();

if (first.equals(second)) {
    System.out.println("The strings were the same!");
} else {
    System.out.println("The strings were different!");
}
```

#### Example: FizzBuzz Program
- A classic example to demonstrate conditional statements.

```java
Scanner reader = new Scanner(System.in);
int number = Integer.valueOf(reader.nextLine());

if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz");
} else if (number % 3 == 0) {
    System.out.println("Fizz");
} else if (number % 5 == 0) {
    System.out.println("Buzz");
} else {
    System.out.println(number);
}
```


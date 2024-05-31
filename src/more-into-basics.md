# Common Recurring Problems 
https://maplant.com/2020-04-25-Writing-a-Simple-Garbage-Collector-in-C.html
### [Taken from maplant.com](https://maplant.com/2020-04-25-Writing-a-Simple-Garbage-Collector-in-C.html)
From elementary school through half of high school, I played drums. Every Wednesday at around 4:30 pm I had a drum lesson from a teacher who was quite good.

Whenever I was having trouble learning a new groove or beat or whatever, he would always give me the same diagnosis: I was trying to do everything at once. I looked at the sheet of music, and I simply tried to play with all my hands. But I couldn’t. And the reason why is because I didn’t know how to play the groove yet, and simply trying to play the groove wasn’t how I was going to learn.

So my teacher would enlighten me as to how I could learn: don’t try playing everything at once. Learn to play the high-hat part with your right hand. Once you’ve got that down, learn to play the snare with your left. Do the same with the bass, the tom-toms, and whatever other parts there are. When you have all the individual parts down, slowly begin to add them together. Add them together in pairs, then in threes, and eventually you’ll be able to play the entire thing

I never got good at drums, but I did take these lessons to heart in my programming. It’s really hard to just start to type out an entire program. The only algorithm you need to write code is divide and conquer. Write the function to allocate memory. Then, write the function to look through memory. Then, write the function that cleans up memory. Finally, add them all together.

As soon as you get past this barrier as a programmer, nothing practical becomes “hard”. You may not understand an algorithm, but anyone can understand an algorithm with enough time, paper, and the right book. If a project seems daunting, break it up into its individual parts. You may not know how to write an interpreter, but you sure as hell can write a parser. Find out what else you need to add, and do it.


### Combining multiple logics

### Reading User Input

The solution pattern for reading user input involves using the `Scanner` class. The `Scanner` is created in the main method, and the class is made available by importing `java.util.Scanner`.

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        String text = reader.nextLine();
        int number = Integer.valueOf(reader.nextLine());
        double numberWithDecimals = Double.valueOf(reader.nextLine());
        boolean trueOrFalse = Boolean.valueOf(reader.nextLine());
    }
}
```

### Calculating

To solve problems involving calculations:

1. Define and declare variables for inputs.
2. Identify the operation needed and declare a variable for the result.
3. Use the result for further actions (e.g., printing).

Example of calculating the sum of two integers:

```java
int first = 1;
int second = 2;

int sum = first + second;

System.out.println("The sum of " + first + " and " + second + " is " + sum);
```

A combined example of reading input and calculating the product of two integers:

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        int product = first * second;

        System.out.println("The product of " + first + " and " + second + " is " + product);
    }
}
```

### Conditional Logic

Conditional statements are used to perform actions based on certain conditions. The basic structure involves using `if`, `else if`, and `else`.

Example of a simple conditional statement:

```java
int value = 15;
if (value > 42) {
    System.out.println("ok");
} else {
    System.out.println("not ok");
}
```

Chaining multiple conditions:

```java
if (value > 5) {
    // functionality when value is greater than five
} else if (value < 0) {
    // functionality when value is less than zero
} else {
    // functionality otherwise
}
```

### Combined Example: Reading, Calculating, and Conditional Logic

A program that reads two integers, calculates their sum, and prints a message based on the sum:

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        int sum = first + second;

        if (sum > 100) {
            System.out.println("too much");
        } else if (sum < 0) {
            System.out.println("too little");
        } else {
            System.out.println("ok");
        }
    }
}
```

# Loops

Instead of writing repetitive code for tasks like reading multiple inputs, loops allow for more elegant and scalable solutions. For instance, consider a program that reads five numbers and calculates their sum:

```java
Scanner scanner = new Scanner(System.in);
int sum = 0;

System.out.println("Input a number: ");
sum += Integer.valueOf(scanner.nextLine());

System.out.println("Input a number: ");
sum += Integer.valueOf(scanner.nextLine());

System.out.println("Input a number: ");
sum += Integer.valueOf(scanner.nextLine());

System.out.println("Input a number: ");
sum += Integer.valueOf(scanner.nextLine());

System.out.println("Input a number: ");
sum += Integer.valueOf(scanner.nextLine());

System.out.println("The sum of the numbers is " + sum);
```

Using a loop simplifies this task:

```java
Scanner scanner = new Scanner(System.in);
int numbersRead = 0;
int sum = 0;

while (true) {
    if (numbersRead == 5) {
        break;
    }

    System.out.println("Input number");
    sum += Integer.valueOf(scanner.nextLine());
    numbersRead++;
}

System.out.println("The sum of the numbers is " + sum);
```

### Loops and Infinite Loops

A loop consists of an expression that determines whether the code within the loop should be repeated and a block containing the source code to be repeated:

```java
while (expression) {
    // Block of code
}
```

Using `true` as the expression creates an infinite loop:

```java
while (true) {
    System.out.println("I can program!");
}
```

### Ending a Loop

The `break` command exits a loop:

```java
int number = 1;

while (true) {
    System.out.println(number);
    if (number >= 5) {
        break;
    }
    number++;
}

System.out.println("Ready!");
```

### User Input and Loops

Programs can ask users for input within a loop, using `break` to exit under certain conditions:

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Exit? (y exits)");
    String input = scanner.nextLine();
    if (input.equals("y")) {
        break;
    }
    System.out.println("Ok! Let's carry on!");
}

System.out.println("Ready!");
```

### Example: Reading Numbers Until Zero

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Input a number, 0 to quit");
    int command = Integer.valueOf(scanner.nextLine());
    if (command == 0) {
        break;
    }
    System.out.println("You input " + command);
}

System.out.println("Done, thank you!");
```

### Using `continue` to Return to the Start of a Loop

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Insert positive integers");
    int number = Integer.valueOf(scanner.nextLine());

    if (number <= 0) {
        System.out.println("Unfit number! Try again.");
        continue;
    }

    System.out.println("Your input was " + number);
}
```

### Combining `if` Statements

Combining conditions can improve clarity:

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Input a number");
    int number = Integer.valueOf(scanner.nextLine());

    if (number < 0) {
        System.out.println("Unfit number");
    } else if (number == 0) {
        break;
    } else {
        System.out.println(number * number);
    }
}
```

### Calculation with Loops

For calculations that need to track multiple user inputs, variables must be defined outside the loop:

```java
Scanner scanner = new Scanner(System.in);
int ones = 0;

while (true) {
    System.out.println("Give a number (end with 0): ");
    int number = Integer.valueOf(scanner.nextLine());

    if (number == 0) {
        break;
    }

    if (number == 1) {
        ones++;
    }
}

System.out.println("The total of ones: " + ones);
```

### Example: Counting Positive and Negative Numbers

```java
Scanner reader = new Scanner(System.in);
int numberOfPositives = 0;
int numberOfNegatives = 0;

while (true) {
    System.out.println("Give a number (0 to stop): ");
    int numberFromUser = Integer.valueOf(reader.nextLine());

    if (numberFromUser == 0) {
        break;
    }

    if (numberFromUser > 0) {
        numberOfPositives++;
    } else {
        numberOfNegatives++;
    }
}

System.out.println("Positive numbers: " + numberOfPositives);
System.out.println("Negative numbers: " + numberOfNegatives);

if (numberOfPositives + numberOfNegatives > 0) {
    double percentageOfPositives = 100.0 * numberOfPositives / (numberOfPositives + numberOfNegatives);
    System.out.println("Percentage of positive numbers: " + percentageOfPositives + "%");
}
```
# Discovering Errors

## A Programmer Blind to Their Own Code

### Perceptual Blindness in Programming

Perceptual blindness occurs when focusing on a specific task causes relevant information to be filtered out. This can happen when a programmer concentrates on one part of the code, neglecting other important parts. For example, while inspecting a program's output, a programmer might focus on print statements and overlook errors in the logic.

### Example of Perceptual Blindness

Consider the following program used to calculate the average of user-inputted values. It contains an error, and the loop is often the first target when searching for it:

```java
Scanner scanner = new Scanner(System.in);
int values = 0;
int sum = 0;

while (true) {
    System.out.println("Provide a value, a negative value ends the program");
    int value = Integer.valueOf(scanner.nextLine());
    if (value < 0) {
        break;
    }

    values = values + 1;
    sum = sum + value;
}

if (sum == 0) {
    System.out.println("The average of the values could not be calculated.");
} else {
    System.out.println("Average of values: " + (1.0 * sum / values));
}
```

### Reducing Perceptual Blindness

1. **Taking Breaks**: Start early to allow time for breaks.
2. **Code Comments**: Explain how the code works to oneself.
3. **Proper Naming**: Use descriptive names for variables, methods, and classes.
4. **Debugging Prints**: Follow the program's flow and variable values.

### Commenting the Source Code

Comments help explain how the code works. Here's an example:

```java
/*
 Prints the numbers from ten to one.
Each number is printed on its own line.
*/

int value = 10;

while (value > 0) {
    System.out.println(value);
    value = value - 1;
}
```

A more practical approach is to write self-documenting code with meaningful names:

```java
public static void printValuesFromTenToOne() {
    int value = 10;
    while (value > 0) {
        System.out.println(value);
        value = value - 1;
    }
}

public static void printValuesFromLargestToSmallest(int start, int end) {
    while (start >= end) {
        System.out.println(start);
        start = start - 1;
    }
}
```

### Searching for Errors with Print Debugging

Print debugging involves adding print statements to follow the program's execution. Here's the previous example with print-debug statements:

```java
Scanner scanner = new Scanner(System.in);
int values = 0;
int sum = 0;

while (true) {
    System.out.println("-- values: " + values + ", sum: " + sum);

    System.out.println("Provide a value, a negative value ends the program");
    int value = Integer.valueOf(scanner.nextLine());
    if (value < 0) {
        System.out.println("-- value is negative, exiting loop");
        break;
    }

    values = values + 1;
    sum = sum + value;
}

System.out.println("-- loop exited");
System.out.println("-- values: " + values + ", sum: " + sum);

if (sum == 0) {
    System.out.println("The average of the values could not be calculated.");
} else {
    System.out.println("Average of values: " + (1.0 * sum / values));
}
```

### Testing Corner Cases

When testing, consider corner cases, such as when the user does not enter any acceptable value, or enters zeros or very large values. This helps in identifying hidden errors.


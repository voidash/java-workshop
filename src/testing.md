# Testing

Errors often occur in the programs we write. Some errors are minor and mostly cause inconvenience to users, while others can have serious consequences. Making mistakes is a natural part of learning to program, and it is important to investigate error messages to understand the errors made.

## Software Error Example

A report from MIT describes an incident caused by a serious software error. The bug resulted from the program expecting calculations in the International System of Units (meters, kilograms, etc.), while the programmer used the American Measurement System. This prevented the satellite navigation auto-correction system from working as intended, leading to the satellite's destruction.

## Stack Trace

When an error occurs in a program, it typically prints a stack trace, which is a list of method calls that led to the error. For example:

```
Exception in thread "main" ...
    at Program.main(Program.java:15)
```

The type of error is stated at the beginning, and the line "at Program.main(Program.java:15)" indicates the error occurred at line 15 in the `Program.java` file.

## Checklist for Troubleshooting

1. **Indent your code properly and check for missing parentheses.**
2. **Verify variable names are correctly used.**
3. **Test the program with different inputs to identify problematic inputs.**
4. **Add print statements to output variable values at various stages.**
5. **Ensure all variables are initialized to avoid `NullPointerException`.**
6. **Pay attention to the stack trace for exceptions to trace the error source.**
7. **Learn to use the debugger for more efficient error finding.**

## Passing Test Input to `Scanner`

Manual testing can be laborious. Automate input by passing a string to a `Scanner` object. Example:

```java
String input = "one\n" + "two\n"  +
               "three\n" + "four\n" +
               "five\n" + "one\n"  +
               "six\n";

Scanner reader = new Scanner(input);

ArrayList<String> read = new ArrayList<>();

while (true) {
    System.out.println("Enter an input: ");
    String line = reader.nextLine();
    if (read.contains(line)) {
        break;
    }

    read.add(line);
}

System.out.println("Thank you!");

if (read.contains("six")) {
    System.out.println("A value that should not have been added to the group was added to it.");
}
```

Passing a string to the `Scanner` constructor replaces keyboard input, allowing automated testing.

## Unit Testing

Unit testing involves testing individual components of the source code, such as classes and methods, in isolation. This method helps in identifying if each class and method fulfills its responsibility.

### Example: Calculator Class

```java
public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value - number;
    }

    public int getValue() {
        return this.value;
    }
}
```

### Writing Unit Tests

Create a test class under the Test-Packages folder, named `CalculatorTest`.

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }
}
```

Run tests to ensure the functionality works as expected. Add more tests for different functionalities.

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubtracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        assertEquals(-2, calculator.getValue());
    }
}
```

Running these tests helps identify and correct errors, such as in the `subtract` method.

## Test-Driven Development (TDD)

TDD is a software development process that involves writing tests before implementing functionality. The process involves:

1. **Write a test** for the desired functionality.
2. **Run the test** to check if it fails (it should, as the functionality isn't implemented yet).
3. **Implement the functionality** to pass the test.
4. **Run the tests again** to ensure they pass.
5. **Refactor the code** if necessary, while ensuring tests still pass.

Repeat these steps until the program is complete.

## More About Software Testing

Unit testing is one aspect of software testing. Developers also perform integration tests to check the interoperability of components and interface tests to validate the application's user interface.

These testing methods are covered in more advanced courses.

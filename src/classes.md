# **Classes and Objects**

A class defines the attributes (instance variables) and behaviors (methods) of objects. For example, the `ArrayList` class allows creating objects that can store lists of elements.

**Creating and Using Classes**

A class acts as a blueprint for objects. For instance, a `Person` class can define a person's name and age:

```java
public class Person {
    private String name;
    private int age;
}
```

Instance variables are private, meaning they are encapsulated within the object.

**Constructors**

A constructor initializes the state of a new object:

```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
```

Objects are created using the `new` keyword, calling the constructor:

```java
Person ada = new Person("Ada");
```

**Methods**

Methods define the functionality of objects. A method is written inside the class and can modify the object's state:

```java
public class Person {
    // ... constructor and variables

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age++;
        }
    }
}
```

**Returning Values from Methods**

Methods can return values by specifying the return type:

```java
public class Person {
    // ... constructor and variables

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
}
```

**String Representation of Objects**

The `toString` method provides a string representation of the object:

```java
public class Person {
    // ... constructor and variables

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
```

**Method Parameters and Internal Methods**

Methods can have parameters and can call other methods within the class:

```java
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, body mass index is " + this.bodyMassIndex();
    }
}
```

**Using the Class**

Creating objects and using their methods:

```java
public static void main(String[] gs) {
    Person matti = new Person("Matti");
    matti.setHeight(180);
    matti.setWeight(86);

    System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
}
```

# Working with Lists and Objects in Java

## Type Parameters in Lists

The type parameter in a list defines the type of elements that can be added to the list. For instance, `ArrayList<String>` includes strings, `ArrayList<Integer>` integers, and `ArrayList<Double>` floating point numbers.

Example of adding strings to a list and printing them:

```java
ArrayList<String> names = new ArrayList<>();

// Adding strings to the list
names.add("Betty Jennings");
names.add("Betty Snyder");
names.add("Frances Spence");
names.add("Kay McNulty");
names.add("Marlyn Wescoff");
names.add("Ruth Lichterman");

// Using different loops to print the list elements
// 1. while loop
int index = 0;
while (index < names.size()) {
    System.out.println(names.get(index));
    index++;
}

// 2. for loop with index
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}

// 3. for-each loop
for (String name: names) {
    System.out.println(name);
}
```

### Sample Output
```
Betty Jennings
Betty Snyder
Frances Spence
Kay McNulty
Marlyn Wescoff
Ruth Lichterman
```

## Adding Objects to a List

Handling objects in a list involves defining the type for the stored elements when creating the list. Below is an example of a `Person` class and adding `Person` objects to a list.

### Person Class Definition

```java
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age++;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
```

### Adding `Person` Objects to a List

```java
ArrayList<Person> persons = new ArrayList<>();

// Creating and adding person objects
Person john = new Person("John");
persons.add(john);

persons.add(new Person("Matthew"));
persons.add(new Person("Martin"));

// Printing the person objects
for (Person person: persons) {
    System.out.println(person);
}
```

### Sample Output
```
John, age 0 years
Matthew, age 0 years
Martin, age 0 years
```

## Adding User-Inputted Objects to a List

You can read input from the user to create and add objects to a list.

### Example with User Input

```java
import java.util.ArrayList;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
ArrayList<Person> persons = new ArrayList<>();

// Reading names from the user
while (true) {
    System.out.print("Enter a name, empty will stop: ");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
        break;
    }
    persons.add(new Person(name));
}

// Printing the number of entered persons and their information
System.out.println("Persons in total: " + persons.size());
System.out.println("Persons: ");
for (Person person: persons) {
    System.out.println(person);
}
```

### Sample Output
```
Enter a name, empty will stop: Alan Kay
Enter a name, empty will stop: Ivan Sutherland
Enter a name, empty will stop: Kristen Nygaard

Persons in total: 3
Persons:
Alan Kay, age 0 years
Ivan Sutherland, age 0 years
Kristen Nygaard, age 0 years
```

## Handling Multiple Constructor Parameters

If the constructor requires more than one parameter, you can query the user for each parameter separately.

### Example with Multiple Constructor Parameters

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Scanner scanner = new Scanner(System.in);
ArrayList<Person> persons = new ArrayList<>();

// Reading person information from the user
while (true) {
    System.out.print("Enter name, empty will end: ");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
        break;
    }

    System.out.print("Enter the age of the person " + name + ": ");
    int age = Integer.valueOf(scanner.nextLine());

    persons.add(new Person(name, age));
}

// Printing the number of inputted persons and their details
System.out.println("Total number of persons: " + persons.size());
System.out.println("Persons: ");
for (Person person: persons) {
    System.out.println(person);
}
```

### Sample Output
```
Enter name, empty will end: Grace Hopper
Enter the age of the person Grace Hopper: 85

Total number of persons: 1
Persons:
Grace Hopper, age 85 years
```

## Reading Input in a Specific Format

You can read input in a specific format, such as comma-separated values.

### Example with Comma-Separated Input

```java
Scanner scanner = new Scanner(System.in);
ArrayList<Person> persons = new ArrayList<>();

// Reading person information from the user
System.out.println("Enter the person details separated by a comma, e.g.: Randall,2");
while (true) {
    System.out.print("Enter the details, empty will stop: ");
    String details = scanner.nextLine();
    if (details.isEmpty()) {
        break;
    }

    String[] parts = details.split(",");
    String name = parts[0];
    int age = Integer.valueOf(parts[1]);
    persons.add(new Person(name, age));
}

// Printing the number of entered persons and their details
System.out.println("Total number of persons: " + persons.size());
System.out.println("Persons: ");
for (Person person: persons) {
    System.out.println(person);
}
```

### Sample Output
```
Enter the person details separated by a comma, e.g.: Randall,2
Enter the details, empty will stop: Leevi,2
Enter the details, empty will stop: Anton,2
Enter the details, empty will stop: Sylvi,0

Total number of persons: 3
Persons:
Leevi, age 2 years
Anton, age 2 years
Sylvi, age 0 years
```

## Filtered Printing from the List

You can filter objects in the list based on specific criteria.

### Example of Filtered Printing

```java
System.out.print("What is the age limit? ");
int ageLimit = Integer.valueOf(scanner.nextLine());

for (Person person: persons) {
    if (person.getAge() >= ageLimit) {
        System.out.println(person);
    }
}
```

---- 


## Key Concepts of OOP

1. **Class**: A blueprint for creating objects. It defines a type of object according to its attributes (data) and behaviors (methods).

2. **Object**: An instance of a class. It encapsulates data and methods that operate on the data.

3. **Encapsulation**: The bundling of data and methods that operate on that data within one unit, e.g., a class. It restricts direct access to some of the object's components, which is a means of preventing unintended interference and misuse.

4. **Inheritance**: A mechanism for creating a new class from an existing class. The new class inherits attributes and methods of the existing class.

5. **Polymorphism**: The ability of different objects to respond to the same method call in different ways.


## Example: Clock Implementation

Let's explore these concepts through an example of implementing a clock.

### Initial Implementation with Integer Variables

The clock has three hands: hours, minutes, and seconds. Each hand progresses based on certain conditions:

```java
int hours = 0;
int minutes = 0;
int seconds = 0;

while (true) {
    // Printing the time
    if (hours < 10) System.out.print("0");
    System.out.print(hours + ":");
    if (minutes < 10) System.out.print("0");
    System.out.print(minutes + ":");
    if (seconds < 10) System.out.print("0");
    System.out.print(seconds);
    System.out.println();

    // Progress the second hand
    seconds++;
    if (seconds > 59) {
        minutes++;
        seconds = 0;
        if (minutes > 59) {
            hours++;
            minutes = 0;
            if (hours > 23) hours = 0;
        }
    }
}
```

While functional, this approach is not very readable. We can improve it by using OOP principles.

### Creating a `ClockHand` Class

We start by defining a `ClockHand` class to encapsulate the behavior of a clock hand:

```java
public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value++;
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        return (this.value < 10 ? "0" : "") + this.value;
    }
}
```

### Using `ClockHand` Objects

Now, we can use `ClockHand` objects to represent the hands of the clock:

```java
ClockHand hours = new ClockHand(24);
ClockHand minutes = new ClockHand(60);
ClockHand seconds = new ClockHand(60);

while (true) {
    // Printing the time
    System.out.println(hours + ":" + minutes + ":" + seconds);

    // Advancing the second hand
    seconds.advance();

    // Advancing the other hands when required
    if (seconds.value() == 0) {
        minutes.advance();
        if (minutes.value() == 0) {
            hours.advance();
        }
    }
}
```

### Creating a `Clock` Class

To further enhance clarity, we encapsulate the clock's behavior in a `Clock` class:

```java
public class Clock {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;

    public Clock() {
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.seconds.advance();
        if (this.seconds.value() == 0) {
            this.minutes.advance();
            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
```

### Using the `Clock` Class

Finally, we use the `Clock` class in our main program:

```java
Clock clock = new Clock();

while (true) {
    System.out.println(clock);
    clock.advance();
}
```

### Summary

OOP involves creating abstractions by defining classes that encapsulate data and behavior. By isolating the concept of a clock hand into a `ClockHand` class and the overall clock into a `Clock` class, we improve code readability and maintainability. This example demonstrates the power of OOP in organizing and simplifying complex systems.

## Object Terminology

### Object

An object refers to an independent entity that contains both data (instance variables) and behavior (methods). Objects interact with one another through method calls, used to request information or give instructions.

### Example: Person Class

In the Java programming language, a `Person` class that keeps track of name, age, weight, and height, and provides the ability to calculate body mass index and maximum heart rate would look like this:

```java
public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return this.name + ", BMI: " + this.bodyMassIndex()
            + ", maximum heart rate: " + this.maximumHeartRate();
    }
}
```

### Creating and Using Person Objects

```java
Scanner reader = new Scanner(System.in);
System.out.println("What's your name?");
String name = reader.nextLine();
System.out.println("What's your age?");
int age = Integer.valueOf(reader.nextLine());
System.out.println("What's your weight?");
double weight = Double.valueOf(reader.nextLine());
System.out.println("What's your height?");
double height = Double.valueOf(reader.nextLine());

Person person = new Person(name, age, weight, height);
System.out.println(person);
```

**Sample Output:**

```
What's your name?
Napoleone Buonaparte
What's your age?
51
What's your weight?
80
What's your height?
1.70
Napoleone Buonaparte, BMI: 27.68166089965398, maximum heart rate: 170.03900000000002
```

### Example: Rectangle Class

A class defining the functionality of a rectangle:

```java
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void widen() {
        this.width++;
    }

    public void narrow() {
        if (this.width > 0) {
            this.width--;
        }
    }

    public int surfaceArea() {
        return this.width * this.height;
    }

    public String toString() {
        return "(" + this.width + ", " + this.height + ")";
    }
}
```

### Creating and Using Rectangle Objects

```java
Rectangle first = new Rectangle(40, 80);
Rectangle second = new Rectangle(10, 10);

System.out.println(first);
System.out.println(second);

first.narrow();
System.out.println(first);
System.out.println(first.surfaceArea());
```

**Sample Output:**

```
(40, 80)
(10, 10)
(39, 80)
3920
```



# Array

We've gotten familiar with the ArrayList, which offers significant functionality for programmers, particularly for adding elements. The size of the ArrayList appears unlimited, but in reality, it allocates more space in memory as needed and copies the data to the new space.

Despite its simplicity, sometimes we need to use the ancestor of the ArrayList, the Array. An Array has a fixed number of elements, referred to by indices. The size of an Array is determined upon creation and specifies the number of values it can hold.

Creating an Array:
1. Explicitly define the size:
   ```java
   int[] numbers = new int[3];
   String[] strings = new String[5];
   ```

Assigning and Accessing Elements:
- Elements are accessed by their index:
   ```java
   int[] numbers = new int[3];
   numbers[0] = 2;
   numbers[2] = 5;

   System.out.println(numbers[0]);
   System.out.println(numbers[2]);
   ```

The index ranges from 0 to length - 1. For example, an Array with 5 elements has indices 0 to 4.

Iterating Over an Array:
- Use a while loop to iterate over each element:
   ```java
   int[] numbers = new int[4];
   numbers[0] = 42;
   numbers[1] = 13;
   numbers[2] = 12;
   numbers[3] = 7;

   System.out.println("The array has " + numbers.length + " elements.");

   int index = 0;
   while (index < numbers.length) {
       System.out.println(numbers[index]);
       index++;
   }
   ```

Handling Index Errors:
- Accessing an invalid index throws an ArrayIndexOutOfBoundsException. Ensure indices are within the valid range.

Creating Arrays with a Block:
- Arrays can be initialized with values directly:
   ```java
   int[] numbers = {100, 1, 42};
   String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
   double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};
   ```

Arrays as Method Parameters:
- Arrays can be passed as parameters to methods. Changes to the array within the method persist after execution:
   ```java
   public static void listElements(int[] integerArray) {
       for (int number : integerArray) {
           System.out.print(number + " ");
       }
       System.out.println("");
   }

   int[] numbers = {1, 2, 3};
   listElements(numbers);
   ```

---

# ArrayLists

In programming, storing multiple values in separate variables is impractical:

```java
String word1;
String word2;
String word3;
// ...
String word10;
```

Java offers a tool called `ArrayList` for storing many values of the same type efficiently.

### Using and Creating Lists

To use `ArrayList`, first import it:

```java
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> list = new ArrayList<>();
    }
}
```

The type of values stored is specified when creating the list:

```java
ArrayList<String> list = new ArrayList<>();
```

### Defining the Type of Values

When defining an `ArrayList`, the type of values must be capitalized:

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(1);

ArrayList<Double> list = new ArrayList<>();
list.add(4.2);

ArrayList<Boolean> list = new ArrayList<>();
list.add(true);

ArrayList<String> list = new ArrayList<>();
list.add("String is a reference-type variable");
```

### Adding to and Retrieving Values from a List

Add values with `add` and retrieve them with `get`:

```java
ArrayList<String> wordList = new ArrayList<>();

wordList.add("First");
wordList.add("Second");

System.out.println(wordList.get(0)); // Output: First
System.out.println(wordList.get(1)); // Output: Second
```

### Handling Non-Existent Indices

Retrieving from a non-existent index results in an `IndexOutOfBoundsException`:

```java
ArrayList<String> wordList = new ArrayList<>();

wordList.add("First");
wordList.add("Second");

System.out.println(wordList.get(2)); // Error: IndexOutOfBoundsException
```

### Iterating Over a List

Use a loop to iterate over list elements. Using `size` gives the number of elements:

```java
ArrayList<String> teachers = new ArrayList<>();

teachers.add("Simon");
teachers.add("Samuel");
teachers.add("Ann");
teachers.add("Anna");

for (int i = 0; i < teachers.size(); i++) {
    System.out.println(teachers.get(i));
}
```

For a for-each loop:

```java
ArrayList<String> teachers = new ArrayList<>();

teachers.add("Simon");
teachers.add("Samuel");
teachers.add("Ann");
teachers.add("Anna");

for (String teacher : teachers) {
    System.out.println(teacher);
}
```

### Removing Values from a List

Remove by index or value:

```java
ArrayList<String> list = new ArrayList<>();

list.add("First");
list.add("Second");
list.add("Third");

list.remove(1); // Removes "Second"
list.remove("First"); // Removes "First"
```

### Checking for Existence of a Value

Use `contains` to check if a value exists in the list:

```java
ArrayList<String> list = new ArrayList<>();

list.add("First");
list.add("Second");
list.add("Third");

boolean found = list.contains("Second"); // true
```

### Lists as Method Parameters

Lists can be passed as method parameters:

```java
public static void print(ArrayList<String> list) {
    for (String value : list) {
        System.out.println(value);
    }
}

ArrayList<String> strings = new ArrayList<>();
strings.add("First");
strings.add("Second");
strings.add("Third");

print(strings);
```

### Modifying Lists in Methods

Methods can modify lists passed to them:

```java
public static void removeFirst(ArrayList<Integer> numbers) {
    if (numbers.size() > 0) {
        numbers.remove(0);
    }
}

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);

removeFirst(numbers); // Removes first element
```

### Summary of List Methods

- **Add a value**: `list.add("value");`
- **Get a value**: `String value = list.get(0);`
- **Remove by index**: `list.remove(0);`
- **Remove by value**: `list.remove("value");`
- **Check existence**: `boolean found = list.contains("value");`
- **List size**: `int size = list.size();`

### Example Usage

```java
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello world!");
        
        System.out.println("Size: " + list.size()); // Size: 1
        System.out.println("Value: " + list.get(0)); // Value: hello world!
        list.remove("hello world!");
        System.out.println("Contains 'hello world!': " + list.contains("hello world!")); // false
    }
}
```



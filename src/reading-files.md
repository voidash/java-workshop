# Reading Files

Software often involves handling data in various forms. Applications like music players handle music files, image editors manage image files, and social media platforms handle user data stored in file-based databases. These tasks typically involve reading and manipulating data, which is ultimately stored in files.

## Reading From the Keyboard

We've used the `Scanner` class to read user input. The typical pattern involves reading input in a loop until a specific input ends the reading process.

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    String line = scanner.nextLine();
    if (line.equals("end")) {
        break;
    }
    // Handle the input line
}
```

To handle the input as integers, we convert the string input to integers.

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    String row = scanner.nextLine();
    if (row.equals("end")) {
        break;
    }
    int number = Integer.valueOf(row);
    System.out.println(number);
}
```

## Files and the Filesystem

Files are collections of data stored on a computer, and they can contain text, images, music, etc. The file format determines how the content is stored and which programs can read it. Browsing files is typically done through the operating system's file system.

## Reading From a File

To read a file using the `Scanner` class, we provide the file's path to the constructor. Java's `Paths.get` command is used to get the file path.

```java
import java.util.Scanner;
import java.nio.file.Paths;

try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
    while (scanner.hasNextLine()) {
        String row = scanner.nextLine();
        System.out.println(row);
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

In this example, the file `file.txt` is read line by line, and each line is printed to the console.

To add lines from a file to an `ArrayList`:

```java
ArrayList<String> lines = new ArrayList<>();

try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
    while (scanner.hasNextLine()) {
        lines.add(scanner.nextLine());
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

System.out.println("Total lines: " + lines.size());
```

## Handling Empty Lines

Sometimes, files contain empty lines that should be skipped.

```java
try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        if (line.isEmpty()) {
            continue;
        }
        // Handle non-empty line
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Reading Data in a Specific Format

Data is often stored in files using specific formats, such as comma-separated values (CSV).

### Reading CSV Data from User Input

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.print("Enter name and age separated by a comma: ");
    String line = scanner.nextLine();
    if (line.equals("")) {
        break;
    }

    String[] parts = line.split(",");
    String name = parts[0];
    int age = Integer.valueOf(parts[1]);

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
```

### Reading CSV Data from a File

```java
try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Reading Objects From a File

Creating objects from data read from a file can be done similarly. Assume we have a `Person` class:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
```

### Reading `Person` Objects from a File

```java
ArrayList<Person> people = new ArrayList<>();

try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        people.add(new Person(name, age));
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

System.out.println("Total amount of people read: " + people.size());
```


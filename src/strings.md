# Strings

### Creating and Printing Strings

Creating a string variable and printing it:

```java
String magicWord = "abracadabra";
System.out.println(magicWord);
```

### Reading and Printing Strings

Reading a string using `Scanner` and printing it:

```java
Scanner reader = new Scanner(System.in);

System.out.print("What's your name? ");
String name = reader.nextLine();

System.out.println(name);
```

### Concatenating Strings

Concatenating strings using the `+` operator:

```java
String greeting = "Hi ";
String name = "Lily";
String goodbye = " and see you later!";

String phrase = greeting + name + goodbye;

System.out.println(phrase);
```

### String Comparisons and `equals`

Comparing strings with `equals`:

```java
String text = "course";

if (text.equals("marzipan")) {
    System.out.println("The text variable contains the text marzipan.");
} else {
    System.out.println("The text variable does not contain the text marzipan.");
}
```

Comparing two string variables:

```java
String text = "course";
String anotherText = "horse";

if (text.equals(anotherText)) {
    System.out.println("The two texts are equal!");
} else {
    System.out.println("The two texts are not equal!");
}
```

Using negation in string comparison:

```java
String text = "pie";

if (!text.equals("cake")) {
    System.out.println("it wasn't!");
} else {
    System.out.println("it was!");
}
```

### Splitting a String

Splitting a string into parts using `split`:

```java
String text = "first second third fourth";
String[] pieces = text.split(" ");
System.out.println(pieces[0]);
System.out.println(pieces[1]);
System.out.println(pieces[2]);
System.out.println(pieces[3]);

for (int i = 0; i < pieces.length; i++) {
    System.out.println(pieces[i]);
}
```

### Data of Fixed Format

Using `split` for fixed-format data (e.g., CSV):

```java
Scanner reader = new Scanner(System.in);

while (true) {
    String input = reader.nextLine();
    if (input.equals("")) {
        break;
    }

    String[] pieces = input.split(",");
    System.out.println("Name: " + pieces[0] + ", age: " + pieces[1]);
}
```

### Extracting Characters from Strings

Getting a character at a specified index using `charAt`:

```java
String text = "Hello world!";
char character = text.charAt(0);
System.out.println(character);
```

### Using Numerical Data in Strings

Handling numerical data within strings:

```java
Scanner reader = new Scanner(System.in);
int sum = 0;

while (true) {
    String input = reader.nextLine();
    if (input.equals("")) {
        break;
    }

    String[] parts = input.split(",");
    sum = sum + Integer.valueOf(parts[1]);
}

System.out.println("Sum of the ages is " + sum);
```

### Calculating Averages

Calculating the average from numerical data in strings:

```java
Scanner reader = new Scanner(System.in);
int sum = 0;
int count = 0;

while (true) {
    String input = reader.nextLine();
    if (input.equals("")) {
        break;
    }

    String[] parts = input.split(",");
    sum = sum + Integer.valueOf(parts[1]);
    count = count + 1;
}

if (count > 0) {
    System.out.println("Age average: " + (1.0 * sum / count));
} else {
    System.out.println("No input.");
}
```

### Finding Length of a String

Getting the length of a string using `length`:

```java
String word = "equisterian";
int length = word.length();
System.out.println("The length of the word " + word + " is " + length);
```


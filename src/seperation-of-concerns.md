# Seperation of concerns 

1. **Identify Subproblems:** The first step is to identify the distinct subproblems that the program needs to solve. In the example, the subproblems involve getting user input for words, storing entered words, checking for repeated words, and displaying the result.

2. **Separate Responsibilities:** Once you have identified the subproblems, you can separate the functionalities that address each subproblem into individual classes. These classes will encapsulate the data and logic related to their specific responsibilities.

3. **Classes and Objects:** In OOP, classes act as blueprints that define the properties (attributes) and behaviors (methods) of objects. Objects are instances of classes that hold specific values for the attributes and can execute the defined methods.

4. **User Interface (UI):** A well-designed program often has a separate class responsible for handling user interactions. This UI class typically interacts with other classes to get the necessary data and perform actions based on user input.

5. **Benefits of Decomposition:** Decomposing a program into well-defined classes offers several advantages. It makes the code easier to understand and modify. Changes made to one class are less likely to affect other parts of the program. Additionally, reusable classes can be utilized in different projects.



**Program Overview:**
The program asks the user to write words until they write the same word twice.

**Sample Output:**
```
Write a word: your
Write a word: father
Write a word: my
Write a word: father
Write a word: going
Write a word: to 
Write a word: fish 
You wrote the same word twice!
```

**Step-by-Step Implementation:**

**1. User Interface Setup:**
Start by creating a `UserInterface` class with a `Scanner` object for reading user input.

```java
public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        // do something
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    UserInterface userInterface = new UserInterface(scanner);
    userInterface.start();
}
```

**2. Looping and Quitting:**
Outline the loop that continuously reads words until a certain condition is met.

```java
public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }
        }
        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        return false; // Placeholder implementation
    }
}
```

**3. Storing Words:**
Use an `ArrayList` to store entered words.

```java
public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<String>();
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }
            this.words.add(word);
        }
        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        return this.words.contains(word);
    }
}
```

**4. Refining the Design:**
Encapsulate the list of words into a separate class `WordSet`.

```java
import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
```

Modify the `UserInterface` to use the `WordSet` class.

```java
public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    WordSet set = new WordSet();
    UserInterface userInterface = new UserInterface(set, scanner);
    userInterface.start();
}
```

**5. Enhancements and Additional Functionality:**
Implement new features like counting palindromes in the `WordSet` class.

```java
import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }

    public int countPalindromes() {
        int count = 0;
        for (String word : this.words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
        System.out.println(this.wordSet.countPalindromes() + " of the words were palindromes.");
    }
}
```


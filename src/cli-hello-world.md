
---

# Manual Hello World in Java 

## Prerequisites

- Java Development Kit (JDK) installed and configured in your PATH.

After you have set the environment variables and when you type `java --version`  

```
[I] cdjk@voidashs-MacBook-Air ~/test-java> java --version
openjdk 21.0.2 2024-01-16
OpenJDK Runtime Environment (build 21.0.2+13-58)
OpenJDK 64-Bit Server VM (build 21.0.2+13-58, mixed mode, sharing)
```
---

### Step 1: Open Visual Studio Code

1. Launch Visual Studio Code.

### Step 2: Create a New Java File

1. Open VSCode.
2. Click on `File > New File` or press `Ctrl+N` (Windows/Linux) or `Cmd+N` (Mac).
3. Save the file by clicking on `File > Save` or press `Ctrl+S` (Windows/Linux) or `Cmd+S` (Mac).
4. Name the file `HelloWorld.java` and save it in your desired directory.

### Step 3: Write Your Java Code

1. In `HelloWorld.java`, add the following code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Step 4: Save the File

1. Save the file by pressing `Ctrl+S` (Windows/Linux) or `Cmd+S` (Mac).

### Step 5: Open Integrated Terminal in VSCode

1. Open the integrated terminal by clicking on `View > Terminal` or pressing `` Ctrl+` `` (Windows/Linux/Mac).

### Step 6: Navigate to the Directory

1. Use the `cd` command to navigate to the directory where `HelloWorld.java` is saved. For example:

```sh
cd path/to/your/directory
```

Replace `path/to/your/directory` with the actual path.

### Step 8: Compile the Java Program

1. In the terminal, compile the Java source file using the `javac` command:

```sh
javac HelloWorld.java
```

This command compiles `HelloWorld.java` and produces a `HelloWorld.class` file, which contains the bytecode that can be executed by the Java Virtual Machine (JVM).

### Step 9: Run the Java Program

1. In the terminal, run the compiled Java program using the `java` command:

```sh
java HelloWorld
```

You should see the following output:

```plaintext
Hello, World!
```

---

## Summary of Commands

1. **Navigate to the directory**:

    ```sh
    cd path/to/your/directory
    ```

2. **Compile the Java source file**:

    ```sh
    javac HelloWorld.java
    ```

3. **Run the compiled Java program**:

    ```sh
    java HelloWorld
    ```

---

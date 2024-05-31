# Understanding Primitive and Reference Variables in Java

**Primitive Variables:**
- Java has eight primitive data types: `boolean`, `byte`, `char`, `short`, `int`, `long`, `float`, and `double`.
- The value of a primitive variable is stored directly in the memory allocated for the variable.
- Example:
  ```java
  int value = 10;
  System.out.println(value); // Output: 10
  ```
- Memory for each primitive type is allocated based on its size (e.g., 32 bits for `int`).
- Primitive values are copied when assigned to another variable or passed to a method, ensuring the original value remains unchanged.

**Reference Variables:**
- Reference variables store references (addresses) to objects, not the objects themselves.
- Example:
  ```java
  public class Name {
      private String name;
      public Name(String name) { this.name = name; }
      public String toString() { return this.name; }
  }
  
  Name luke = new Name("Luke");
  System.out.println(luke); // Output: Luke (after overriding toString)
  ```
- Without overriding `toString`, printing a reference variable shows the type and a unique identifier (e.g., `Name@4aa298b7`).
- Reference variables can be altered through their methods, affecting the object they point to.

**Memory and Methods:**
- Assigning an object to a new reference variable copies the reference, not the object.
- Example:
  ```java
  Person first = new Person("First");
  Person second = first;
  second.setBirthYear(1971);
  System.out.println(first); // Output: First (1971)
  ```
- When passed to methods, primitives pass their value, while reference types pass the reference, allowing the method to alter the object's state.

**Example Program:**
```java
public class Example {
    public static void main(String[] args) {
        Person first = new Person("First");
        System.out.println(first); // Output: First (1970)
        youthen(first);
        System.out.println(first); // Output: First (1971)
    }
    
    public static void youthen(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}
```

**Key Takeaways:**
- Primitive variables store values directly; reference variables store references to objects.
- Assignments and method calls involving primitives copy the value; those involving references copy the reference.
- Objects can be mutated through reference variables, unlike primitives.

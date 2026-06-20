# ICT 2207 — Object Oriented Pattern Design (Java)
### Question Bank / Assessment Booklet

A ready-to-use assessment package covering one module of ICT 2207: static members & constructors, abstraction, overriding/overloading, the `Object` class, polymorphism, and dynamic binding.

## Course Information

| | |
|---|---|
| **Course Code** | ICT 2207 |
| **Course Title** | Object Oriented Pattern Design (Java) |
| **Institution** | Mawlana Bhashani Science and Technology University (MBSTU), Department of ICT |
| **Instructor** | Prof. Dr. Ziaur Rahman — [rahmanziaur.github.io](https://rahmanziaur.github.io/) |

## Package Contents

| File | Description |
|---|---|
| `ICT2207_Question_Bank.docx` | Full assessment booklet — cover page, instructions, marks distribution, Sections A–C, and an instructor-only answer key |
| `README.md` | This file |

## Topics Covered

1. Static members and constructor overloading/chaining
2. Abstract class vs. interface
3. Method overriding vs. overloading
4. The `Object` class and `toString()`
5. Polymorphism (compile-time vs. runtime)
6. Dynamic binding

## Booklet Structure

| Section | Type | Questions | Marks |
|---|---|---|---|
| A | Multiple Choice | 10 | 10 (1 each) |
| B | Short Answer | 6 | 30 (5 each) |
| C | Long Answer / Practical (Java code) | 5 | 60 (12 each) |
| **Total** | | **21** | **100** |

Section C questions each combine a conceptual part (a) with a coding/tracing part (b), so they assess both understanding and applied skill. An answer key with MCQ answers, short-answer marking points, and Section C rubric notes/expected outputs is included at the end of the document for instructor use.

## The Five Core Questions

These are the five long-answer/practical questions that form the basis of Section C in the booklet. Each pairs a conceptual part (a) with a practical/coding part (b).

### Q1. Static Members & Constructor Overloading/Chaining *(Understand + Apply)*

**(a)** Explain the difference between a static variable and an instance variable in terms of memory allocation and scope. Why can a static method not directly access an instance variable?

**(b)** Write a class `Employee` with fields `id`, `name`, and `salary`. Use a **static variable** `count` to track how many `Employee` objects have been created, and a **static method** `getCount()` to return it. Provide three overloaded constructors:
- `Employee()` — sets default values
- `Employee(String name)` — sets name, default salary
- `Employee(String name, double salary)` — sets both

Use **constructor chaining** (`this(...)`) so only one constructor contains the actual initialization logic, and increment `count` exactly once per object regardless of which constructor is called.

---

### Q2. Abstract Class vs. Interface *(Understand + Apply)*

**(a)** List three differences between an abstract class and an interface (consider: constructors, fields, multiple inheritance, default method bodies). Give one real-world scenario where an abstract class is the better design choice, and one where an interface is better, with justification.

**(b)** You're designing a system with `Car`, `Bicycle`, and `Boat`. All three should support a `Movable` behavior (`move()`), but only `Car` and `Boat` share common state/behavior like `fuelLevel` and `refuel()`. Design the class/interface hierarchy: decide what becomes an interface and what becomes an abstract class, and write the skeleton code (signatures only, no full implementation needed).

---

### Q3. Overriding vs. Overloading *(Analyze)*

**(a)** Differentiate overriding and overloading along four dimensions: method signature, inheritance requirement, binding type (compile-time vs runtime), and whether it can occur within a single class.

**(b)** Given this code, identify which method calls are resolved via overloading and which via overriding, and predict the exact output:

```java
class Animal {
    void sound() { System.out.println("Some sound"); }
    void sound(int times) { System.out.println("Repeated " + times + " times"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sound(3);
    }
}
```

---

### Q4. The Object Class and `toString()` *(Understand + Apply)*

**(a)** Every class in Java implicitly extends `Object`. Name three methods inherited from `Object` and explain what the default `toString()` returns if it is not overridden.

**(b)** Given the class below, predict what `System.out.println(b1)` prints **before** any changes. Then override `toString()` so it instead prints `Book: Java Basics by Alice (Price: 450.0)`, and explain why overriding `toString()` is preferred over writing a separate method like `display()`.

```java
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Alice", 450.0);
        System.out.println(b1);
    }
}
```

---

### Q5. Polymorphism & Dynamic Binding *(Analyze + Evaluate)*

**(a)** Distinguish compile-time (static) polymorphism from runtime (dynamic) polymorphism with one example of each. Explain what "dynamic binding" means and which one of the two relies on it.

**(b)** Trace through the following code and predict the output. For each call, state **at compile time** which method the compiler considers (based on reference type) versus **at runtime** which method actually executes (based on object type), and explain why:

```java
class Shape {
    double area() { return 0; }
    void describe() { System.out.println("Area: " + area()); }
}

class Circle extends Shape {
    double radius = 5;
    @Override
    double area() { return Math.PI * radius * radius; }
}

class Square extends Shape {
    double side = 4;
    @Override
    double area() { return side * side; }
}

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square() };
        for (Shape s : shapes) {
            s.describe();
        }
    }
}
```

# Assignment 1: University Management System (Comprehensive OOP Challenge)

## Course Information

**Course:** Object-Oriented Programming Lab (Java)
**Assignment:** 01
**Topic:** Abstract Class, Multilevel Inheritance, Dynamic Binding, and Downcasting
**Language:** Java

---

## Scenario

A university is developing a Human Resource Management System to manage its personnel. Different categories of employees have different responsibilities, qualifications, and privileges. The university administration wants a flexible software solution that can manage all personnel through a common framework while still allowing access to specialized information when needed.

Your task is to design and implement the system using Object-Oriented Programming (OOP) principles in Java.

---

## Learning Outcomes

After completing this assignment, students will be able to:

* Design and implement Abstract Classes.
* Apply Multilevel Inheritance.
* Demonstrate Runtime Polymorphism (Dynamic Binding).
* Perform Safe Downcasting using `instanceof`.
* Develop reusable and extensible object-oriented software.

---

# Requirements

## 1. Abstract Class

Create an abstract class named `UniversityMember`.

### Attributes

* memberId
* name

### Methods

* Constructor for initialization
* `displayBasicInfo()`
* `performDuty()` (abstract)

All personnel-related classes must inherit from this abstract class.

---

## 2. Multilevel Inheritance

Implement the following inheritance hierarchy:

```text
UniversityMember
        ↓
      Employee
        ↓
 AcademicStaff
        ↓
   Professor
```

Each class must introduce:

* At least one new attribute
* At least one new method

Example:

| Class         | Possible Attribute |
| ------------- | ------------------ |
| Employee      | salary             |
| AcademicStaff | department         |
| Professor     | researchArea       |

You may use different attributes if they are meaningful and justified.

---

## 3. Dynamic Binding (Runtime Polymorphism)

Store all personnel objects in a single collection:

```java
ArrayList<UniversityMember>
```

The collection must contain:

* At least one `Professor`
* At least one additional subclass derived from `Employee`

Examples:

* AdministrativeOfficer
* LabEngineer
* Accountant
* SystemAdministrator

Iterate through the collection and invoke:

```java
performDuty();
```

The output must demonstrate Runtime Polymorphism where the correct overridden method is selected during execution.

---

## 4. Downcasting

The university administration occasionally needs access to Professor-specific information such as:

* Research Area
* Number of Publications
* Research Grant Information

These methods should not be available in the superclass.

Identify Professor objects from the collection and safely downcast them using:

```java
if(member instanceof Professor){
    Professor p = (Professor) member;
    p.showResearchProfile();
}
```

Demonstrate at least one Professor-specific method through downcasting.

---

# Additional Requirements

1. Create at least one additional subclass derived from `Employee`.
2. Follow proper naming conventions.
3. Use meaningful variable names and comments.
4. Avoid code duplication.
5. Ensure your program compiles and runs without errors.
6. Include sample data for testing.

---

# Deliverables

Submit the following files to your GitHub Classroom repository:

## Source Code

All `.java` files required for the project.

## UML Class Diagram

A diagram showing:

* Classes
* Attributes
* Methods
* Inheritance relationships

Accepted formats:

* PDF
* PNG
* JPG

## Sample Output

Provide screenshots or a text file showing program execution.

## Documentation

Create a `REPORT.md` file explaining:

1. Where the Abstract Class is used.
2. How Multilevel Inheritance is implemented.
3. Where Dynamic Binding occurs.
4. Why Downcasting is necessary.
5. How your design can be extended in the future.

---

# Repository Structure

```text
Assignment01/
│
├── src/
│   ├── UniversityMember.java
│   ├── Employee.java
│   ├── AcademicStaff.java
│   ├── Professor.java
│   ├── AdministrativeOfficer.java
│   └── Main.java
│
├── UML_Diagram.pdf
├── REPORT.md
└── README.md
```

---

# Assessment Rubric

| Component              | Marks   |
| ---------------------- | ------- |
| Program Design         | 2.0      |
| Abstract Class         | 1.5      |
| Multilevel Inheritance | 2.0      |
| Dynamic Binding        | 2.0      |
| Safe Downcasting       | 1.5      |
| Documentation & UML    | 1.0      |
| **Total**              | **100** |

---

# Academic Integrity

* You may discuss ideas with classmates.
* Submitted code must be your own work.
* Be prepared to explain your design and implementation during the viva examination.
* Copying code from online sources, AI tools, or classmates without understanding may result in mark deductions.

---

# Submission Deadline

Refer to the GitHub Classroom assignment page for the official deadline.

Good luck and happy coding!

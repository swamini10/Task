# 🎓 Student Record Management System

A simple **Java CLI (Command Line Interface)** project that performs **CRUD (Create, Read, Update, Delete)** operations on student records using **Object-Oriented Programming (OOP)** concepts and **ArrayList**.

---

## 📌 Objective

Develop a menu-driven Java application to manage student records where users can:

* Add a new student
* View all students
* Update student details
* Delete a student
* Search a student by ID

This project helps beginners understand Java OOP concepts, collections, and menu-driven programming.

---

## 🚀 Features

* ✅ Add Student Record
* ✅ View All Student Records
* ✅ Update Student Information
* ✅ Delete Student Record
* ✅ Search Student by ID
* ✅ Duplicate ID Validation
* ✅ User-Friendly CLI Menu

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList Collection
* Scanner Class
* Command Line Interface (CLI)

---

## 📂 Project Structure

```
StudentRecordManagementSystem/
│
├── Student.java
├── StudentManagementSystem.java
└── README.md
```

---

## 📖 Student Class

The `Student` class contains:

| Field | Type   |
| ----- | ------ |
| id    | int    |
| name  | String |
| marks | double |

It also includes:

* Constructor
* Getters
* Setters
* toString() Method

---

## 📖 Functionalities

### 1. Add Student

Allows the user to enter:

* Student ID
* Student Name
* Student Marks

Duplicate IDs are not allowed.

---

### 2. View Students

Displays all student records stored in the system.

---

### 3. Update Student

Updates:

* Student Name
* Student Marks

using the Student ID.

---

### 4. Delete Student

Deletes a student record using the Student ID.

---

### 5. Search Student

Searches and displays a student's details using their ID.

---

## ▶️ How to Run

### Compile

```bash
javac Student.java StudentManagementSystem.java
```

### Run

```bash
java StudentManagementSystem
```

---

## 💻 Sample Menu

```
==============================
 STUDENT RECORD MANAGEMENT
==============================
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Search Student
6. Exit
```

---

## 🧠 Concepts Covered

* Java Classes & Objects
* Constructors
* Encapsulation
* ArrayList
* CRUD Operations
* Linear Search
* Loops
* Switch Case
* Scanner Class
* Menu-Driven Programming

---

## 🎯 Learning Outcomes

After completing this project, you will understand:

* How to build a Java CLI application
* How to use ArrayList to store objects
* How CRUD operations work
* How Java OOP is applied in real-world applications
* How to create reusable methods

---

## 🔮 Future Enhancements

* Store records in a MySQL database using JDBC
* File handling for permanent data storage
* GUI using Java Swing or JavaFX

---

## 👩‍💻 Author

**Swamini Bhandare**

If you found this project useful, feel free to ⭐ the repository and contribute with improvements.

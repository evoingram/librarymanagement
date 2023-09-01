# Library Management System


## Overview 

This project is my week 1 practical application assignment from my promotion/improvement plan.  I have decided to do a library management system given that I own a lot of tech books and have plenty of domain knowledge to draw from.

As a brief background, I used ChatGPT to come up with a 20-week promotion/improvement plan.  Every week, there is a capstone project which covers everything learned or reviewed that week, and this is the capstone project for week 1.   The improvement plan may be [found here](https://docs.google.com/document/d/1khvd-Hnr2aloLgFFNf_-HvQcC3RJbUHeoJ2zemckrlA/edit?pli=1).


## Assignment

Combine your learning to work on a larger coding project that incorporates the concepts from the week, such as building a simple library management system or a basic e-commerce platform.

This project is in Java since this week was spent reviewing fundamental Java concepts.  It is only intended to review concepts, not intended to be a fully finished, polished project.


## Concepts to Cover

These are the concepts I reviewed/utilized from week 1 that this project needs to cover.

- [X] OOP principles - encapsulation, polymorphism, abstraction, inheritance
- [X] objects, classes, and instances
- [X] access modifiers
- [X] constructors
- [X] overloading & overriding
- [X] this keyword
- [X] static members
- [X] data hiding & encapsulation
- [X] inheritance classes
- [X] extends keyword
- [X] method overriding
- [X] super keyword usage
- [X] constructor chaining
- [X] interfaces
- [X] implements keyword
- [X] multiple interface implementation
- [X] default methods
- [X] marker interfaces
- [ ] collections -- List, Set, Map, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap
- [ ] iteration techniques for collections
- [X] exception handling
- [X] try catch finally
- [X] exception hierarchy - checked/unchecked (RuntimeException)
- [X] throws clause
- [ ] clean up


## Plan

Work In Progress.

- Book:
  - Properties
    - Book ID
    - Title
    - Author (list)
    - Publication Year
    - Publisher
    - ISBN
    - Pages
    - Genre (list)
    - Tags (list)
    - Format (list)
  - Methods
    - get/set all properties
    - auto-set tags such as small, medium, large, textbook, etc.

- Book List
  - Properties
  - Methods
    - generate book lists using different collections
      - Book List Sorted by Publication Year
      - Book List Sorted by Title
      - Book List Sorted by Author
      - Book List Sorted by Publisher
      - Book List by Genre
      - Book List by Tag

- User
  - Properties
    - user ID
    - First Name
    - Last Name
    - Address
    - City
    - State
    - ZIP
    - Email
    - Phone Number
    - type of user
      - employee
      - card holder
      - business
  - Methods
    - check out book
    - return book
    - add late fine
    - reduce late fine
    - pay fine
  
- Format
  - Properties
  - Methods

- Author
  - Properties
  - Methods

- Genre
  - Properties
  - Methods

- Tags
  - Properties
  - Methods

- interface LibraryActions
  - check out book
  - return book
  - add late fine
  - reduce late fine
  - pay fine
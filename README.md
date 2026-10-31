# Difference Between Arrays and ArrayLists in Java

In Java, arrays and ArrayLists are both used to store multiple values in one variable. However, they differ in how they store data and how easily they can be modified. Understanding these differences is important when developing Java applications.

An **array** stores a fixed number of elements of the same data type. Once an array is created, its size cannot be changed. Each element can be accessed using an index, starting at zero. Arrays are useful when the number of elements is already known and will not need to change. For example, an array can store the test scores of five students.

An **ArrayList** is part of Java’s Collections Framework and allows a collection to grow or shrink as needed. Unlike an array, an ArrayList provides methods such as `add()`, `remove()`, and `size()` to manage its elements. It uses objects rather than primitive types directly, so wrapper classes such as `Integer` are used to store integer values. ArrayLists are helpful when the number of items may change while a program is running (Oracle, n.d.-a, n.d.-b).

The main conceptual difference is that arrays have a fixed length, while ArrayLists are resizable. Arrays can store primitive values directly, such as `int`, whereas an ArrayList uses reference types, such as `Integer`. Arrays use the `length` property to determine their size, while ArrayLists use the `size()` method. Both support indexed access, but ArrayLists provide additional methods for modifying a collection.

For this project, I created a Java program that demonstrates how to declare an array, access its values, add and remove values in an ArrayList, and compare their sizes. This example demonstrates when each structure is appropriate. I would use an array when the number of elements is fixed and an ArrayList when flexibility is needed.

## References

Oracle. (n.d.-a). *Arrays*. The Java Tutorials. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

Oracle. (n.d.-b). *ArrayList*. Java Platform, Standard Edition API Specification. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
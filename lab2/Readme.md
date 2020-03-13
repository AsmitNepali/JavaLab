# Constructors
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

**Note:** It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

# Rules for creating Java constructor
**1. Constructor name must be the same as its class name**

**2. A Constructor must have no explicit return type**

**3. A Java constructor cannot be abstract, static, final, and synchronized**

# Types Of Constructor:

 - > Default constructor (no-arg constructor)
 - > Instance Variable
 - > Parameterized constructor


## 1. Default constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

A local variable cannot be defined with "static" keyword.

## 2. Parameterized constructor
A constructor which has a specific number of parameters is called a parameterized constructor.
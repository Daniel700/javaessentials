/*

##############################
        OO BASICS:
##############################

- Abstraction
    -> Abstraction is a process of exposing essential features of an entity by hiding the other irrelevant details.
    Abstraction mainly reduces complexity and increases efficiency.

- Encapsulation
    -> Encapsulation is the process of putting data and the operations (functions)
    that can be performed on that data into a single container called class.

- Polymorphism
    -> It is a feature, which lets us create functions with same name but different arguments,
    which will perform differently.

- Inheritance
    -> Inheritance is a way to reuse code of existing objects, or to establish a subtype from an existing object,
    or both, depending upon programming language support.

------------------------------------------------------------------------------------------------------------------------

##############################
    OO DESIGN PRINCIPLES:
##############################

- Identify the aspects of your application that vary and separate them from what stays the same.
    (We often try to take what varies in a system and encapsulate it.)

- Program to interfaces (supertypes), not to implementations.

- !!! Favor composition over inheritance. !!! (Advantage: Change behaviour at runtime)

- Classes should be open for extension, but closed for modification (From Decorator Pattern).

- Dependency Inversion Principle: Depend upon abstractions. Do not depend upon concrete classes.
(Wenn ein Objekt auf viele andere verschiedene Objekte referenziert besteht eine hohe Abhängigkeit von diesen Klassen)
    # Guidelines:
    # No variable should hold a reference to a concrete class
    # No class should derive from a concrete class
    # No method should override an implemented method of any of its base classes

- Principle of least knowledge - talk only to your immediate friends.
    (Eine Klasse sollte nur auf eine begrenzte Anzahl an anderen Klassen verweisen bzw. benutzen (Composition)
     -> sonst wird die Komplexität eines Systems zu sehr gesteigert)

    [Example:
        Without the principle:
        public float getTemp() {
            Thermometer thermometer = station.getThermometer();
            return thermometer.getTemperature();
        }

        With the principle:
        public float getTemp() {
            return station.getTemperature();
        }
    ]

- The Hollywood Principle: Don't call us, we'll call you.
    Low Level Components can participate in the computation but the high-level components controls when and how.
    A low-level component never calls a high-level component directly.

- A class should have only one reason to change.
    Every responsibility of a class is an area of potential change.
    More than one responsibility means more than one area of change.
    Each class should only have a single responsibility.


------------------------------------------------------------------------------------------------------------------------

##############################
    PATTERN DEFINITIONS:
##############################

    - Strategy Pattern:                 Encapsulates interchangeable behaviours and uses delegation to decide which one to use
    - Observer Pattern:                 Allows objects to be notified when state changes
    - Decorator Pattern:                Wraps an object to provide new behaviour
    - Factory Method Pattern:           Subclasses decide which concrete classes to create
    - Abstract Factory Pattern:         Allows a client to create families of objects without specifying their concrete classes
    - Singleton Pattern:                Ensures one and only object is created
    - Command Pattern:                  Encapsulates a request as an object
    - Adapter Pattern:                  Wraps an object and provides a different interface to it
    - Facade Pattern:                   Simplifies the interface of a set of classes
    - Template Method Pattern:          Subclasses decide how to implement steps in an algorithm
    - Iterator:                         Provides a way to traverse a collection of objects without exposing its implementation
    - Composite Pattern:                Clients treat collections of objects and individual objects uniformly
    - State Pattern:                    Encapsulates state-based behaviours and uses delegation to switch between behaviours
    - Proxy Pattern:                    Wraps an object to control access to it
    # Bridge Pattern:                   a
    # Builder Pattern:                  Constructs complex objects by separating construction and representation
    # Chain of Responsibility Pattern:  a
    # Flyweight Pattern:                Reduces the cost of creating and manipulating a large number of similar objects.
    # Interpreter Pattern:              a
    # Mediator Pattern:                 a
    # Memento Pattern:                  a
    # Prototype Pattern:                a
    # Visitor Pattern:                  a


*/
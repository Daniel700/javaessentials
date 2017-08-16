/*

##############################
        OO BASICS:
##############################

- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

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

    - Strategy Pattern:                 asd
    - Observer Pattern:                 asd
    - Decorater Pattern:                asd
    - Factory Pattern:                  asd
    - Singleton Pattern:                asd
    - Command Pattern:                  asd
    - Adapter Pattern:                  asd
    - Facade Pattern:                   asd
    - Template Method Pattern:          asd
    - Iterator and Composite Pattern:   asd
    - State Pattern:                    a
    - Proxy Pattern:                    a
    # Bridge Pattern:                   a
    # Builder Pattern:                  a
    # Chain of Responsibility Pattern:  a
    # Flyweight Pattern:                a
    # Interpreter Pattern:              a
    # Mediator Pattern:                 a
    # Memento Pattern:                  a
    # Prototype Pattern:                a
    # Visitor Pattern:                  a


*/
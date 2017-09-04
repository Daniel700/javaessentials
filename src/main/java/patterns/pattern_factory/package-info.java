package patterns.pattern_factory;
/*
When to use?
- When you code to an interface and often need to instance different concrete classes
  with the new operator use the pattern instead.
  (Duck duck = new MallardDuck(); )

Simple Factory is not the pattern:
- With the simple factory approach you just outsource the creation of objects (x = new x();) in a separate class.


Factory Method Pattern (create single object):
- The Factory Method Pattern defines an interface for creating an object,
  but lets subclasses decide which class to instantiate.
- Factory Method lets a class defer instantiation to subclasses.
- Factory Method relies on inheritance: object creation is delegated to subclasses
  which implement the factory method to create objects.

-------------------------------------------------------------------------------------------------
Dependency Inversion Principle is used for Abstract Factory Pattern...

Abstract Factory Pattern (creating multiple objects):
- The Abstract Factory Pattern provides an interface for creating families of related or dependent objects
  without specifying their concrete class.
- Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.


*/
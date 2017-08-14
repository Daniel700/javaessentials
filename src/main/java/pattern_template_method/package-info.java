package pattern_template_method;
/*
The template method pattern defines the steps of an algorithm
and allows subclasses to provide the implementation for one or more steps.


The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

- The template method's abstract class may define concrete methods, abstract methods and hooks.
- Abstract method's are implemented by subclasses.
- Hooks are methods that do nothing or default behaviour in the abstract class, but may be overridden by subclasses.

*/
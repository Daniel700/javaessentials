package patterns.pattern_bridge;
/*

At first sight, the Bridge pattern looks a lot like the Adapter pattern
in that a class is used to convert one kind of interface to another.
However, the intent of the Adapter pattern is to make one or more classes' interfaces
look the same as that of a particular class.
The Bridge pattern is designed to separate a class's interface from its implementation
so you can vary or replace the implementation without changing the client code.



Stackoverflow Answer:
----------------------------------------------------------------------------------------
The Bridge pattern is an application of the old advice, "prefer composition over inheritance".
It becomes handy when you must subclass different times in ways
that are orthogonal with one another. Say you must implement a hierarchy of colored shapes.
You wouldn't subclass Shape with Rectangle and Circle and then subclass Rectangle
with RedRectangle, BlueRectangle and GreenRectangle and the same for Circle, would you?
You would prefer to say that each Shape has a Color and to implement a hierarchy of colors,
and that is the Bridge Pattern. Well, I wouldn't implement a "hierarchy of colors",
but you get the idea...
*/
package patterns.pattern_flyweight;
/*

A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects.

- Reduces the number of object instances at runtime, saving memory
- A drawback of the pattern is that single logical instances of the class will not be able to behave
  differently from the other instances


To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties.
Intrinsic properties make the Object unique whereas extrinsic properties are set by client code
and used to perform different operations. For example, an Object Circle can have extrinsic properties
such as color and width.


This pattern should be used when:
- Many similar objects are used and the storage cost is high
- The majority of each object's state data can be made extrinsic
- A few shared objects would easily replace many unshared objects
- The identity of each object does not matter

*/
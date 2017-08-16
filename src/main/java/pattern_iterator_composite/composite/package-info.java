package pattern_iterator_composite.composite;
/*

The Composite Pattern allows you to compose objects into tree structures
to represent part-whole hierarchies. Composite lets clients treat individual
objects and compositions of objects uniformly.

- All Objects in the composite pattern have to implement a common interface
    That means for Objects that don't use certain methods because they make no sense we have to handle this
    Either by doing nothing as a default behaviour, returning null, returning false or throw an exception.

- A composite can have a leaf or another composite (tree structure)

- The composite pattern allows clients to treat composites and individual objects uniformly

*/
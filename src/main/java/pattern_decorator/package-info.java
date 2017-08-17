package pattern_decorator;
/*
The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

Example in Java API:
- FileInputStream -> component
- BufferedInputStream -> concrete decorator     (extend FilterInputStream -> the abstract decorator class)
- LineNumberInputStream -> concrete decorator   (extend FilterInputStream -> the abstract decorator class)

*/
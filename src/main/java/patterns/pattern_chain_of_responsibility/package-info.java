package patterns.pattern_chain_of_responsibility;
/*

- Client doesn't know which part of the chain will be processing the request and
it will send the request to the first object in the chain.

- Each object in the chain will have it’s own implementation to process the request,
either full or partial or to send it to the next object in the chain.

- Every object in the chain should have reference to the next object in chain
to forward the request to, its achieved by java composition.

- Creating the chain carefully is very important otherwise there might be a case
that the request will never be forwarded to a particular processor or
there are no objects in the chain who are able to handle the request.


Chain of Responsibility Pattern Examples in JDK:
- java.util.logging.Logger#log()
- javax.servlet.Filter#doFilter()

*/
package patterns.pattern_proxy;
/*

The proxy pattern provides a surrogate or placeholder for another object to control access to it.

In General:
A proxy intercepts a method invocation that a client is making on an object.
A remote proxy acts as a local representative to a remote object.
 -> The remote object is an object that lives in the heap of a different JVM

CAUTION:
The remote proxy implementation here may be outdated...


Types of proxies:
 - A Remote Proxy manages interaction between a client and a remote object
 - A Virtual Proxy controls access to an object that is expensive to instantiate
 - A Protection Proxy controls access to the methods of an object based on the caller

Proxy is similar to decorator but the two differ in their purpose

*/
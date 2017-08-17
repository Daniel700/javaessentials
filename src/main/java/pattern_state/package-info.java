package pattern_state;
/*
The State Pattern allows an object to alter its behaviour when its internal state changes.
The object will appear to change its class.

- The class diagram is the same as of the strategy pattern
  but the intent is different!

- In this implementation one of the states define what the next state should be.
  But this could be also done by the context.

- The states are only used by the context and never by the clients!

*/
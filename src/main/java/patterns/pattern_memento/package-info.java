package patterns.pattern_memento;
/*

Roles in the pattern:
--------------------------------
Originator - the object that knows how to save itself.
Caretaker - the object that knows why and when the Originator needs to save and restore itself.
Memento - the lock box that is written and read by the Originator, and shepherded by the Caretaker.

Intent of the pattern:
--------------------------------------
- Without violating encapsulation, capture and externalize an object's internal state
so that the object can be returned to this state later.
- A magic cookie that encapsulates a "check point" capability.
- Promote undo or rollback to full object status.


Memento pattern is simple and easy to implement, one of the thing needs to take care is that Memento
class should be accessible only to the Originator object. Also in client application,
we should use caretaker object for saving and restoring the originator state.


Drawback:
- If Originator object is very huge, Memento object size will also be very huge and use a lot of memory


Real-Life Example:
-----------------------------
Text Editor with its undo function.

*/
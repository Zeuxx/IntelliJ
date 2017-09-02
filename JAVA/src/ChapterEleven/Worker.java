package ChapterEleven;
/*
An interface looks much like a class, except that all of its methods
(if any) are implicitly public, static, and final. An interface is a
description of what a class does, but not how it is done; it declares
method headers, but not the instructions within those methods.

When you create a class that uses an interface, you include the keyword
implements and the interface name in the class header. This notation
requires the class to include an implementation for every method name in
the interface.

Whereas using extends allows a subclass to use nonprivate, nonoverriden
members of it's parent class, implements requires the subclass to implement
its own version of each method.
 */
public interface Worker
{
    /*
    When any class implements Worker, it must either include a
    work() method or the new class must be declared abstract, and
    then its descendants must implement the method.
     */
    void work();
}

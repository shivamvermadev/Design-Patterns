## Design Principle
- Identify the aspects of your application that vary and separate them from what stays the same.
- Program to an interface, not an implementation.
  - “Program to an interface” really means “Program to a supertype.”
    The word interface is overloaded here. There’s the concept of interface, but
    there’s also the Java construct interface. You can program to an interface,
    without having to actually use a Java interface. The point is to exploit
    polymorphism by programming to a supertype so that the actual runtime
    object isn’t locked into the code. And we could rephrase “program to a
    supertype” as “the declared type of the variables should be a supertype,
    usually an abstract class or interface, so that the objects assigned to those
    variables can be of any concrete implementation of the supertype, which
    means the class declaring them doesn’t have to know about the actual object
    types!
- Favor composition over inheritance.
  - HAS-A can be better than IS-A
    The HAS-A relationship is an interesting one: each duck has a FlyBehavior
    and a QuackBehavior to which it delegates flying and quacking.
    When you put two classes together like this you’re using composition.
    Instead of inheriting their behavior, the ducks get their behavior by being
    composed with the right behavior object.
- Strive for loosely coupled designs between objects that interact.
  - Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
- Classes should be open for extension, but closed for modification.

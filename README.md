# Design Patterns
- very important topic for LLD
- Design patterns are the principles for OOP, using design pattern we design manageable, scalable software design, which helps us when we scale.

## What's a design pattern?
- Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.
- You can’t just find a pattern and copy it into your program, the way you can with off-the-shelf functions or libraries. The pattern is not a specific piece of code, but a general concept for solving a particular problem. You can follow the pattern details and implement a solution that suits the realities of your own program.
- Patterns are often confused with algorithms, because both concepts describe typical solutions to some known problems. While an algorithm always defines a clear set of actions that can achieve some goal, a pattern is a more high-level description of a solution. The code of the same pattern applied to two different programs may be different.
- An analogy to an algorithm is a cooking recipe: both have clear steps to achieve a goal. On the other hand, a pattern is more like a blueprint: you can see what the result and its features are, but the exact order of implementation is up to you.

## What does the pattern consist of?
-  Intent of the pattern briefly describes both the problem and the solution.
-  Motivation further explains the problem and the solution the pattern makes possible.
-  Structure of classes shows each part of the pattern and how they are related.
-  Code example in one of the popular programming languages makes it easier to grasp the idea behind the pattern.

### Strategy Design Pattern
#### When to use strategy pattern ?
- when we found that in a parent child relation-ship in inheritance, the child classes are having a same piece of code (duplicate code) which is not present into the base class.
    - Using strategy pattern we can avoid this code duplicacy. Also, as the number of features grows it's not good to have duplicate code.

                               (0) -> base class 
                             /  |  \ 
                            /   |   \
                          (1)  (2)  (3) -> child classes(1, 3) having same code
    - this can be solved by strategy pattern.
    - In the implementation without strategy pattern we can see that OffRoadVehicle and SportsVehicle have the same functionality, i.e. code duplicacy.
    - With strategy pattern implementation the issue is fixed.
---

### Observer Design pattern
- In this design pattern we have observer and observable.
- Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
- Imagine that you have two types of objects: a `Customer` and a `Store`. The customer is very interested in a particular brand of product (say, it’s a new model of the iPhone) which should become available in the store very soon.
- The customer could visit the store every day and check product availability. But while the product is still en route, most of these trips would be pointless.
- ![img_2.png](img_2.png)
- On the other hand, the store could send tons of emails (which might be considered spam) to all customers each time a new product becomes available. This would save some customers from endless trips to the store. At the same time, it’d upset other customers who aren’t interested in new products.
- It looks like we’ve got a conflict. Either the customer wastes time checking product availability or the store wastes resources notifying the wrong customers.
-
- ![img.png](img.png)
- Theory nicely explained here https://refactoring.guru/design-patterns/observer

---

### Decorator Pattern
- Suppose we have an object F1 that has features, so we can wrap a wrapper around it F2, to add more features to it, so the new thing that we got is now F1 + F2 and like that with multiple wrappers we can have F1 + F2 + F3 + ... + Fn.
- ![img_1.png](img_1.png)
- Why we need decorator pattern ? 
  - To prevent `class explosion`.
- Real world analogy
- ![img_3.png](img_3.png)

---
### Factory Pattern
- It is used to create object based on some condition.

### Abstract Factory Pattern
- Factory of factory

### Chain of Responsibility Pattern
- Application Usage:
  - Design ATM
  - Design Vending Machine
  - Design Loggers(Amazon question)
  - Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
  - ![img_4.png](img_4.png)

### Proxy design pattern
- Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
- Why would you want to control access to an object? Here is an example: you have a massive object that consumes a vast amount of system resources. You need it from time to time, but not always.
- ![img_5.png](img_5.png)
- ![img_6.png](img_6.png)
- Application Usage:
  - Access restriction
  - Caching
  - for a request u want to do preprocessing or postprocessing.
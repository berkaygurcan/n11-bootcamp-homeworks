N11 Bootcamp - Week 1 Payment System

This project is a simple console-based payment system developed using Java.
The main goal is to demonstrate SOLID principles with a focus on extensible and maintainable design.

💡 Design Approach

The system is built using an interface-based architecture:

IPayment defines a common contract for all payment methods
Cash and CreditCard are concrete implementations
Payment class handles the payment process without depending on concrete classes
Test class manages user input and application flow

This design allows the system to remain flexible and loosely coupled.

🧠 SOLID Principles Used
SRP (Single Responsibility Principle): Each class has a single responsibility
OCP (Open/Closed Principle): New payment methods can be added without modifying existing code
DIP (Dependency Inversion Principle): High-level modules depend on abstraction (IPayment), not concrete implementations
➕ Extensibility

The system is designed to be easily extended.

New payment methods such as:

Crypto Payment
PayPal
Apple Pay

can be added by simply implementing the IPayment interface:

```java
class CryptoPayment implements IPayment {
    public void pay(String price) {
        System.out.println(price + " paid with crypto");
    }
}
```
No changes are required in existing classes.

 How to Run

Run the Test class to start the basic application.

Run the Test2 class for the Reflection-based runtime version.

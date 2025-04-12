# 🍕 Pizza Shop – Java Implementation using Decorator Pattern

Welcome to the Pizza Shop! This repository showcases a Java-based implementation of the **Decorator Design Pattern** to create flexible and extensible pizza orders with multiple toppings.

## 🚀 What is this Project?

This is a simple Java application that demonstrates how to build different types of pizzas with dynamic toppings using the **Decorator Pattern**. Instead of hardcoding every possible pizza + toppings combo, this design lets us compose pizzas and toppings at runtime in a clean and scalable way.

---

## 🧠 About the Decorator Pattern

The **Decorator Pattern** is a structural design pattern that lets you **add behavior or responsibilities to an object dynamically**, without altering its structure or the code of the base object.

### Why use it?

Imagine you want to create various types of pizzas:
- Margherita
- Margherita + Extra Cheese

Instead of creating separate classes for every combination, the **Decorator Pattern** allows us to:
- Start with a base pizza
- Wrap it with one or more decorators (toppings)
- Calculate cost and description dynamically

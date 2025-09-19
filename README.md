### Problem 2: Product Price Comparison App

---

### Description

This project is a small application for managing products in a store. It allows you to display products sorted by different criteria, such as name and price.

---

### Requirements

#### `Product` Class

The **`Product`** class has the following attributes:

-   **`id`**: `int`
-   **`name`**: `String`
-   **`price`**: `double`

It implements the **`Comparable`** interface to sort products by name.

#### `Comparator` with Lambda

A custom **`Comparator`** is used with a **lambda expression** to sort products specifically by their price. A **`TreeSet`** is used with this comparator to automatically maintain the products in a price-sorted order.

#### Collections Usage

-   A **`HashMap<Integer, Product>`** is used to store products, with the product's `id` as the key.
-   The application retrieves and displays products sorted in two ways:
    -   By name
    -   By price

---

#### Spring Core

A Spring bean, **`ProductService`**, is created with the following methods:

-   `addProduct(Product product)`: Adds a new product to the store.
-   `getProductsSortedByName()`: Retrieves a list of products sorted by their name.
-   `getProductsSortedByPrice()`: Retrieves a list of products sorted by their price.

The bean is loaded from **`applicationContext.xml`**, and its methods are called from the `main` method to demonstrate its functionality.

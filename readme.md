# E-Commerce Application Readme

Welcome to the E-Commerce Application, a Java console application designed for managing various aspects of an online store.

## Table of Contents

1. [Main Class (ECommerceApp)](#1-main-class-ecommerceapp)
2. [User Authentication](#2-user-authentication)
3. [Product Management](#3-product-management)
4. [Shopping Cart](#4-shopping-cart)
5. [Order Processing](#5-order-processing)
6. [Inventory Management](#6-inventory-management)
7. [Dynamic Product Search and Filtering](#7-dynamic-product-search-and-filtering)
8. [Payment Processing](#8-payment-processing)
9. [Initialization](#9-initialization)
10. [Classes](#10-classes)
11. [Optional Features](#11-optional-features)
12. [Execution Flow](#12-execution-flow)

## 1. Main Class (ECommerceApp)

The `ECommerceApp` class serves as the main class and contains the main method, acting as the entry point of the application. It initializes essential components, including the scanner, product list, shopping cart, inventory, and processors.

## 2. User Authentication

- The `handleLogin` method allows users to log in by entering a username and password.
- The `handleLogout` method logs out the current user if one is logged in.
- Each user has specific access to methods and a different menu depending on their role.

## 3. Product Management

- The `productManagementMenu` method provides options for adding, updating, and removing products from the inventory.
- Methods like `addProductToInventory`, `updateProductQuantity`, `updateProductPrice`, and `removeProductFromInventory` handle corresponding operations.
- The `displayInventory` and `findProductById` methods assist in displaying and finding products in the inventory.

## 4. Shopping Cart

- The `shoppingCartMenu` method provides options for managing the shopping cart, such as adding, displaying, and removing items.
- Methods like `addProduct`, `displayCart`, and `removeProduct` handle corresponding operations.

## 5. Order Processing

- The `orderProcessingMenu` method provides options for processing and canceling orders.
- Methods like `processOrder` and `cancelOrder` handle corresponding operations.

## 6. Inventory Management

- The `inventoryManagementMenu` method allows users to check stock levels and update stock.
- Methods like `checkStockLevels` and `updateStock` handle corresponding operations.

## 7. Dynamic Product Search and Filtering

- The `dynamicProductSearchMenu` method provides options for searching products by name and applying filters.
- Methods like `searchProductsByName`, `applyFilters`, and `filterProductsByPriceRange` handle corresponding operations.

## 8. Payment Processing

- The `paymentProcessingMenu` method provides options for selecting a payment method, providing payment details, and completing payment.
- The `selectPaymentMethod` method handles corresponding operations.

## 9. Initialization

- The `initializeData` method initializes sample data.

## 10. Classes

Various classes such as `Product`, `ElectronicsProduct`, `ConvenienceProduct`, `MedicalProduct`, `User`, `ShoppingCart`, `Inventory`, `InventoryManagement`, `Order`, `PaymentProcessor`, `Review`, `ReviewService`, `ShippingOption`, etc., support different aspects of the application.

## 11. Optional Features

The two optional features are user reviews and shipping options, as they are deemed important features in the project.

## 12. Execution Flow

Users start the application and can log in or perform various e-commerce operations.

### Admin can:

- Log In.
- Manage products.
- Manage Inventory.
- Log Out.

### Customer can:

- Log In.
- Dynamically search for products + filtering.
- Manage the Shopping Cart.
- Process orders.
- Process payments.
- Choose a shipping option.
- Add a review.
- View all reviews.
- Log Out.

Feel free to explore the functionalities and provide feedback for improvement. Thank you for using the E-Commerce Application!

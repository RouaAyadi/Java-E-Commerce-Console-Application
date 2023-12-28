This project 'Java E-Commerce Console Application' is composed of :
1. Main Class (ECommerceApp):
   The ECommerceApp class is the main class that contains the main method, serving as the entry point of the application. It initializes essential components, such as the scanner, product list, shopping cart, inventory, and processors.

2. User Authentication:
   The handleLogin method allows users to log in by entering a username and password.
   The handleLogout method logs out the current user if one is logged in.
   Each user have a certain access to methods and a different menu dependong on its role.

3. Product Management:
   The productManagementMenu method provides options for adding, updating, and removing products from the inventory.
   The addProductToInventory, updateProductQuantity, updateProductPrice,and removeProductFromInventory methods handle the corresponding operations.
   The displayInventory and findProductById methods assist in displaying and finding products in the inventory.

4. Shopping Cart:
   The shoppingCartMenu method provides options for managing the shopping cart, such as adding, displaying, and removing items.
   The addProduct,displayCart, and removeProduct methods handle the corresponding operations.

5. Order Processing:
   The orderProcessingMenu method provides options for processing and canceling orders.
   The processOrder and cancelOrder methods handle the corresponding operations.

6. Inventory Management:
   The inventoryManagementMenu method allows users to check stock levels and update stock.
   The checkStockLevels and updateStock methods handle the corresponding operations.

7. Dynamic Product Search and Filtering:
   The dynamicProductSearchMenu method provides options for searching products by name and applying filters.
   The searchProductsByName, applyFilters and filterProductsByPriceRange methods handle the corresponding operations.

8. Payment Processing:
   The paymentProcessingMenu method provides options for selecting a payment method, providing payment details, and completing payment.
   The selectPaymentMethod method handle the corresponding operations.

9. Initialization:
   The initializeData method initializes sample data.

10.Classes:
Various classes such as Product, ElectronicsProduct, ConvenienceProduct,MedicalProduct User, ShoppingCart, Inventory, InventoryManagement, Order, PaymentProcessor, Review, ReviewService, ShippingOption etc., support different aspects of the application.

11. Optional Features:
    The two optional features are: user reviews, shipping options as they seemed to be important features in the project

Execution Flow:
Users start the application and can log in or perform various e-commerce operations.
Admin can:
-LogIn.
-Manage products.
-Manage Inventory.
-LogOut.

Customer can:
-LogIn.
-Dynamically search for products + filtering.
-Manage the Shopping Cart.
-Pcocess orders.
-Process payments.
-Choose a shipping option.
-Add a review.
-View all reviews.
-LogOut.







    

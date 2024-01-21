# Shopping List App

Welcome to the Shopping List App! This simple app allows you to manage your shopping list by adding, editing, and deleting items.

## Screenshots

### Shopping List Editor
![ShoppingListEditor](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/8b861936-6d06-417b-b28b-8fe7e2b05d4f)
### Complete Shopping List
![CompleteShoppingList](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/33ee5515-8f7f-4b5e-849e-4906df1d9c47)

## Features

- Add new items to your shopping list.
- Edit existing items to update their name and quantity.
- Delete items from your shopping list.
- Clean and intuitive user interface.


## Limitation
This app currently lacks persistent storage, resulting in the absence of data persistence across app restarts.
Any items added or modified during one session will not be saved for future use. Implementing a persistent database or data storage solution, such as local databases (Room in Android) or cloud-based storage (Firebase), would be a valuable enhancement to ensure data persistence across app sessions.


## How to Use

1. **Add Item:**
   - Click the "Add Item" button to add a new item to your shopping list.
   - Enter the name and quantity of the item in the dialog.

2. **Edit Item:**
   - Click the edit icon next to an item to enter edit mode.
   - Update the name and quantity, then click "Save."

3. **Delete Item:**
   - Click the delete icon next to an item to remove it from your shopping list.

## Getting Started

To run the app locally, you can follow these steps:

```bash
# Clone the repository
git clone https://github.com/your-username/your-shopping-list-app.git

# Open the project in Android Studio

# Run the app on an emulator or physical device

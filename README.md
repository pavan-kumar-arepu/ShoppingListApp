# Shopping List App

Welcome to the Shopping List App! This application allows you to efficiently manage your shopping list by adding, editing, and deleting items. Below, you'll find an overview of the recent contributions and enhancements made to the app.

## Screenshots

![Add New Item](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/62dfa3cd-6fdf-4b6d-81ec-51662d2b4bd8)
![Shopping List Editor](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/8b861936-6d06-417b-b28b-8fe7e2b05d4f)
![whileLocationSelection](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/bcbadb7a-c633-4b20-9b4d-28afa7046383)
![AddressButton](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/a43c9b5b-5382-405c-818f-aa9b66fbdb80)
![CapuredLocation](https://github.com/pavan-kumar-arepu/ShoppingListApp/assets/13812858/c8e9610f-b9be-4efd-8a7c-fd9f5d33add9)

## Recent Contributions

### Folder Structure Update (26th January 2024)

- Introduced a cleaner folder structure following Clean Architecture principles.
- Organized packages like `data`, `network`, `ui`, `utils`, and `viewmodel` for better separation of concerns.
- Created sub-packages such as `model` within the `data` package to store data models.

### Location and Address Integration (26th January 2024)

- Added location-based features to the app.
- Incorporated the `LocationUtils` class to handle location-related operations.
- Implemented the `LocationSelectionScreen` component for choosing the location on the map.
- Utilized the Google Maps API for geocoding to fetch the formatted address based on coordinates.

## Architecture Details

The Shopping List App follows the principles of **Clean Architecture**:

1. **Separation of Concerns:**
   - **`data` package:** Contains data models, focusing on representing the data used in the application.
   - **`network` package:** Manages network-related operations, encapsulating the details of API communication.
   - **`ui` package:**
      - **`components` sub-package:** Custom UI components, responsible for displaying elements on the screen.
      - **`screens` sub-package:** Activities or Fragments representing different screens of the application.
   - **`utils` package:** Holds utility classes, such as `LocationUtils`, providing common functionality.
   - **`viewmodel` package:** Contains the `LocationViewModel` class, handling the presentation logic and data binding for UI components.

2. **Dependency Inversion:**
   - The inner layers (like `data`, `network`, and `utils`) don't depend on the outer layers (like `ui` and `viewmodel`).
   - The core business logic and models are independent and can be tested and maintained separately from the user interface and external dependencies.

3. **Testability:**
   - With the separation of concerns and dependency inversion, it becomes easier to write unit tests for individual components, ensuring code reliability.

4. **Scalability:**
   - The modular structure allows for easy addition of new features or modifications without affecting the entire application.

5. **Flexibility:**
   - You can replace or modify components in one layer without impacting the others, providing flexibility for updates and changes.

## Features

- Add new items to your shopping list.
- Edit existing items to update their name, quantity, and location.
- Delete items from your shopping list.
- Clean and intuitive user interface.

## Limitation
This app currently lacks persistent storage, resulting in the absence of data persistence across app restarts.
Any items added or modified during one session will not be saved for future use. Implementing a persistent database or data storage solution, such as local databases (Room in Android) or cloud-based storage (Firebase), would be a valuable enhancement to ensure data persistence across app sessions.

## How to Use

1. **Add Item:**
   - Click the "Add Item" button to add a new item to your shopping list.
   - Enter the name, quantity, and location in the dialog.

2. **Edit Item:**
   - Click the edit icon next to an item to enter edit mode.
   - Update the name, quantity, and location, then click "Save."

3. **Delete Item:**
   - Click the delete icon next to an item to remove it from your shopping list.

## Getting Started

To run the app locally, you can follow these steps:

```bash
# Clone the repository
git clone https://github.com/your-username/your-shopping-list-app.git

# Open the project in Android Studio

# Run the app on an emulator or physical device

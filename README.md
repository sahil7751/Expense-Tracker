# Smart Expense Tracker

Smart Expense Tracker is a simple Java mini project to manage daily expenses from the console.

## Features

- Add Expense
- View Expenses
- Search Expense
- Delete Expense
- Total Spending
- Exit

## Project Files

- `src/Main.java` - starts the program and shows the menu
- `src/Expense.java` - stores expense details
- `src/ExpenseManager.java` - handles add, view, search, delete, and total spending

## How To Run

1. Open the project folder in terminal.
2. Compile the Java files:

	```bash
	javac src/*.java
	```

3. Run the program:

	```bash
	java -cp src Main
	```

## Notes

- Expense title is used for delete option.
- Search works by matching title or category.
- Total spending shows the sum of all added expenses.


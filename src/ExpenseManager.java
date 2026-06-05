import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\n===== ALL EXPENSES =====");

        for (Expense expense : expenses) {

            System.out.println("Title    : " + expense.getTitle());
            System.out.println("Amount   : ₹" + expense.getAmount());
            System.out.println("Category : " + expense.getCategory());
            System.out.println("--------------------------");
        }
    }
}
import java.util.ArrayList;
import java.util.Iterator;

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

    public void searchExpense(String keyword) {

        boolean found = false;
        String searchText = keyword.toLowerCase();

        System.out.println("\n===== SEARCH RESULT =====");

        for (Expense expense : expenses) {

            String title = expense.getTitle().toLowerCase();
            String category = expense.getCategory().toLowerCase();

            if (title.contains(searchText) || category.contains(searchText)) {

                System.out.println("Title    : " + expense.getTitle());
                System.out.println("Amount   : ₹" + expense.getAmount());
                System.out.println("Category : " + expense.getCategory());
                System.out.println("--------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching expense found.");
        }
    }

    public void deleteExpense(String title) {

        Iterator<Expense> iterator = expenses.iterator();

        while (iterator.hasNext()) {

            Expense expense = iterator.next();

            if (expense.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Expense deleted successfully.");
                return;
            }
        }

        System.out.println("Expense not found.");
    }

    public void totalSpending() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        System.out.println("\n===== TOTAL SPENDING =====");
        System.out.println("Total spending: ₹" + total);
    }
}
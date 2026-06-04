public class Expense {

    private String title; // Instance Variables
    private double amount; // or Attributes
    private String category;

    public Expense(String title, double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}

import java.util.Scanner;

public class ItemPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of item types: ");
        int numItemTypes = scanner.nextInt();

        double totalExpenses = 0;

        for (int i = 1; i <= numItemTypes; i++) {
            System.out.println("Item Type " + i + ":");
            System.out.print("Enter the quantity purchased: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the price per item: ");
            double pricePerItem = scanner.nextDouble();

            double itemCost = quantity * pricePerItem;
            double discount = 0;

            if (quantity > 50) {
                discount = itemCost * 0.10;
            } else if (quantity >= 25 && quantity <= 50) {
                discount = itemCost * 0.05;
            }

            totalExpenses += itemCost - discount;
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}

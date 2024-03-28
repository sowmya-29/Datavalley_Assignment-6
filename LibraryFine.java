import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();

        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5;
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = daysLate * 1;
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = 5 * (daysLate - 14) + 14;
        } else {
            System.out.println("Membership canceled. You are extremely late in returning the book.");
            scanner.close();
            return;
        }

        System.out.println("Fine: Rs. " + fine);

        scanner.close();
    }
}

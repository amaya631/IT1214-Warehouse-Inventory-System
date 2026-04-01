import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        int choice = 1;

        while (choice != 0) {
            System.out.println("1 Add | 2 Remove | 3 Show | 0 Exit");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("ID: ");
                String id = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Qty: ");
                int qty = sc.nextInt();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                inv.add(new Item(id, name, qty, price));
            }

            else if (choice == 2) {
                System.out.print("ID: ");
                String id = sc.nextLine();
                inv.remove(id);
            }

            else if (choice == 3) {
                inv.show();
            }
        }

        System.out.println("End");
    }
}

import java.util.Scanner;

public class StoreCheckout {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Running accumulators for total cost and total number of items
        int total = 0;
        int itemsPurchased = 0;

        // Product names and prices
        String product1 = "Mouse"; int priceMouse = 20;
        String product2 = "Keyboard"; int priceKeyboard = 40;
        String product3 = "Headphones"; int priceHeadphones = 50;
        String product4 = "Laptop Stand"; int priceLaptopStand = 30;

        // Main shopping loop
        while (true) {
            // Display store menu
            System.out.println("===== SIMPLE STORE =====");
            System.out.println("");
            System.out.println("1. Mouse - $20");
            System.out.println("2. Keyboard - $40");
            System.out.println("3. Headphones - $50");
            System.out.println("4. Laptop Stand - $30");
            System.out.println("5. Checkout");
            System.out.println("");
            System.out.print("Choose a product: ");
            int choice = reader.nextInt();

            // Validate menu choice
            if (choice > 5 || choice < 1) {
                System.out.println("");
                System.out.println("Invalid option.");
                System.out.println("Please choose a number from 1 to 5.");
                System.out.println("");
                continue;
            }

            // Option 1: Mouse
            if (choice == 1) {
                System.out.println("");
                System.out.println("You selected: " + product1);
                System.out.println("Price: $" + priceMouse);
                System.out.print("Enter quantity: ");
                int quantity = reader.nextInt();

                // Validate quantity
                while (quantity <= 0) {
                    System.out.println("");
                    System.out.println("Invalid quantity.");
                    System.out.println("Quantity must be greater than 0.");
                    System.out.println("");
                    System.out.print("Enter quantity: ");
                    quantity = reader.nextInt();
                }

                total = total + priceMouse * quantity;
                itemsPurchased = itemsPurchased + quantity;
                System.out.println("");
                System.out.println("Added to cart!");
                System.out.println("Current total: $" + total);
                System.out.println("");
            } 
            // Option 2: Keyboard
            else if (choice == 2) {
                System.out.println("");
                System.out.println("You selected: " + product2);
                System.out.println("Price: $" + priceKeyboard);
                System.out.print("Enter quantity: ");
                int quantity = reader.nextInt();

                // Validate quantity
                while (quantity <= 0) {
                    System.out.println("");
                    System.out.println("Invalid quantity.");
                    System.out.println("Quantity must be greater than 0.");
                    System.out.println("");
                    System.out.print("Enter quantity: ");
                    quantity = reader.nextInt();
                }

                total = total + priceKeyboard * quantity;
                itemsPurchased = itemsPurchased + quantity;
                System.out.println("");
                System.out.println("Added to cart!");
                System.out.println("Current total: $" + total);
                System.out.println("");
            } 
            // Option 3: Headphones
            else if (choice == 3) {
                System.out.println("");
                System.out.println("You selected: " + product3);
                System.out.println("Price: $" + priceHeadphones);
                System.out.print("Enter quantity: ");
                int quantity = reader.nextInt();

                // Validate quantity
                while (quantity <= 0) {
                    System.out.println("");
                    System.out.println("Invalid quantity.");
                    System.out.println("Quantity must be greater than 0.");
                    System.out.println("");
                    System.out.print("Enter quantity: ");
                    quantity = reader.nextInt();
                }

                total = total + priceHeadphones * quantity;
                itemsPurchased = itemsPurchased + quantity;
                System.out.println("");
                System.out.println("Added to cart!");
                System.out.println("Current total: $" + total);
                System.out.println("");
            } 
            // Option 4: Laptop Stand
            else if (choice == 4) {
                System.out.println("");
                System.out.println("You selected: " + product4);
                System.out.println("Price: $" + priceLaptopStand);
                System.out.print("Enter quantity: ");
                int quantity = reader.nextInt();

                // Validate quantity
                while (quantity <= 0) {
                    System.out.println("");
                    System.out.println("Invalid quantity.");
                    System.out.println("Quantity must be greater than 0.");
                    System.out.println("");
                    System.out.print("Enter quantity: ");
                    quantity = reader.nextInt();
                }

                total = total + priceLaptopStand * quantity;
                itemsPurchased = itemsPurchased + quantity;
                System.out.println("");
                System.out.println("Added to cart!");
                System.out.println("Current total: $" + total);
                System.out.println("");
            } 
            // Option 5: Checkout
            else if (choice == 5) {
                System.out.println("");
                System.out.println("===== CHECKOUT =====");
                System.out.println("");
                System.out.println("Items purchased: " + itemsPurchased);
                System.out.println("Subtotal: $" + total);
                System.out.println("");

                // Calculate discount: 10% if subtotal is $100 or more
                int discount = 0;
                if (total >= 100) {
                    discount = (int) (total * 0.10);
                    System.out.println("You received a 10% discount!");
                }

                int finalTotal = total - discount;
                System.out.println("Discount: $" + discount);
                System.out.println("Final total: $" + finalTotal);
                System.out.println("");

                // Payment input and validation
                System.out.print("Enter payment amount: $");
                int payment = reader.nextInt();

                while (payment < finalTotal) {
                    int needed = finalTotal - payment;
                    System.out.println("");
                    System.out.println("Insufficient payment.");
                    System.out.println("You still need to pay: $" + needed);
                    System.out.println("");
                    System.out.print("Enter payment amount: $");
                    payment = reader.nextInt();
                }

                int change = payment - finalTotal;
                System.out.println("");
                System.out.println("Payment successful!");
                System.out.println("");

                // Final Receipt
                System.out.println("========================");
                System.out.println("      SIMPLE STORE");
                System.out.println("========================");
                System.out.println("Items purchased: " + itemsPurchased);
                System.out.println("Subtotal:    $" + total);
                System.out.println("Discount:    $" + discount);
                System.out.println("Final total: $" + finalTotal);
                System.out.println("Payment:     $" + payment);
                System.out.println("Change:      $" + change);
                System.out.println("========================");
                System.out.println("Thank you for shopping!");
                System.out.println("========================");

                // Exit the loop after checkout
                break;
            }
        }

        reader.close();
    }
}
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int secretNumber = 7;

            int attempts = 5;
            int quantity = 1;
            
            while(attempts>0){
                System.out.println("Enter a number: ");
                int attempt = reader.nextInt();

                if (secretNumber==attempt) {
                    System.out.println("Correct!");
                    System.out.println("You needed "+quantity + " attempts");
                    break;
                } else if (attempts>0 && attempt<secretNumber){
                    quantity++;
                    attempts--;
                    System.out.println("Too low!");
                } else if (attempts>0 && attempt>secretNumber){
                    quantity++;
                    attempts--;
                    System.out.println("Too high!");
                }
            }
            if (attempts == 0) {
            System.out.println("Game over!" );
            System.out.println("The secret numver was "+ secretNumber);
        }
    }
}

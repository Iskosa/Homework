import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int PIN = 1234;
        int attempts = 3;

        while (attempts>0) {
            System.out.println("Enter PIN: "); int attempt = reader.nextInt();
            if(attempt==PIN){
                System.out.println("Access granted!");
                break;
            } else if (attempt!=PIN){
                attempts--;
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left: "+ attempts);
            }
            if (attempts<=0){
                System.out.println("Card blocked.");
            }
        }
        
    }
}

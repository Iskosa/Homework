import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1;i<=10;i++){
            System.out.println("Enter number: "+i);
            int numbers = reader.nextInt();
        if (numbers>0){
            positiveCount++;
        } else if (numbers<0){
            negativeCount--;
        } else {
            zeroCount++;
        } 
        if (numbers%2==0){
            oddCount++;
        } else {
            evenCount++;
        }
        }
        System.out.println("\n===== STATISTICS =====");
        System.out.println("Positive numbers: " +positiveCount);
        System.out.println("Negative numbers: " +negativeCount);
        System.out.println("Zeros: " +zeroCount);
        System.out.println("Even numbers: "+ evenCount);
        System.out.println("Odd numbers: "+ oddCount);
    }
}

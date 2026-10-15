package tasks7;

public class Task37 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("--- while loop ---");
        int a = 1;
        while (a <= n) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println("--- do-while loop ---");
        int b = 1;
        if (n >= 1) { 
            do {
                System.out.print(b + " ");
                b++;
            } while (b <= n);
        }

        System.out.println("--- for loop ---");
        for (int c = 1; c <= n; c++) {
            System.out.print(c + " ");
        }
    }
}

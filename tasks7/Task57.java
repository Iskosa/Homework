package tasks7;

public class Task57 {
    public static void main(String[] args) {
        int n = 10; 

        System.out.println("--- 1. while loop ---");
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("--- 2. do-while loop ---");
        int j = 1;
        if (n >= 2) {
            do {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
                j++;
            } while (j <= n);
        }

        System.out.println("--- 3. for loop ---");
        for (int k = 1; k <= n; k++) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }
    }
}

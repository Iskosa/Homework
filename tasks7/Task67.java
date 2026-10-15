package tasks7;

public class Task67 {
    public static void main(String[] args) {
        int n = 10; 
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        int j = 1;
        if (n >= 1) {
            do {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }
                j++;
            } while (j <= n);
        }

        for (int k = 1; k <= n; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}

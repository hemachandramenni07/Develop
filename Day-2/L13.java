package class1;

import java.util.Scanner;

public class L13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = sc.nextInt();

        String num = "*";

        for (int i = 1; i <= n; i++) {

            // spaces for centering
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                
            }

            System.out.println();
        }

        sc.close();
    }
}

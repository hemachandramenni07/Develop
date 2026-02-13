package class1;

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a);

        sc.close();
    }
}

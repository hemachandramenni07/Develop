package class1;
import java.util.Scanner;
public class L31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number :");
		int a =in.nextInt();
		
		for (int i=1;i<=a;i++) {
			for (int s=1;s<=a-i;s++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int k=1;k<=a;k++) {
			for (int s1=1;s1<=k;s1++) {
				System.out.print(" ");
			}
			for (int r=a;r>k;r--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		in.close();
	}

}

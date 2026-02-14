package class1;
import java.util.Scanner;
public class L15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = in.nextInt();
		long n =1;
		for (int i=1;i<=a;i++) {
			n=n*i;
		}
		System.out.println("The Factorial of " + a + " is: " + n);
		in.close();
	}

}

package class1;
import java.util.Scanner;
public class L6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number :");
		int a = in.nextInt();
		int sum = 0;

		for (int i=1;i<=a;i++) {
			int o= (2*i) - 1;
			sum = sum + o;
			System.out.print(o+" ");
			
		}
		System.out.println();
		System.out.print("The Sum of odd Natural Number upto 10 terms :"+sum);
		in.close();
	}

}

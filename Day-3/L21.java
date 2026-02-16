package class1;
import java.util.Scanner;
public class L21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = in.nextInt();
		long sum = 0;
		for(int i = 1;i<=a;i++) {
			long N = (long)(Math.pow(10, i)-1);
			sum +=N;
		}
		System.out.println("Sum of the series is :"+ sum);
		in.close();
	}

}

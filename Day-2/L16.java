package class1;
import java.util.Scanner;
public class L16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = in.nextInt();
		int sum = 0;
		for (int i=1;i<=a;i++) {
			sum=sum+(2*i);
		}
		System.out.println(sum);
		in.close();
	}
}
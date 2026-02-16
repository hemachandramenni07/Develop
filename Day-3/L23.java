package class1;
import java.util.Scanner;
public class L23 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the values of the X:");
		long a = in.nextLong();
		System.out.print("Enter the number of terms :");
		long b = in.nextLong();
		
		double term = 1;
		double sum  =1;
		
		for (int i=1;i<b;i++) {
			term =term*a/i;
			sum+=term;
		}
		System.out.print(sum);
		in.close();
	}

}

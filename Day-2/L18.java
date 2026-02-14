package class1;
import java.util.Scanner;
public class L18 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the value of X :");
		int x =in.nextInt();
		System.out.print("Enter the number of terms :");
		int T=in.nextInt();
		
		double sum=1;
		double Term=1;
		for (int i=1;i<=T;i++) {
			Term=Term*(-1)*x*x / ((2*i)*(2*i-1));
			sum +=Term;
		}
		System.out.print(sum);
		in.close();
	}

}

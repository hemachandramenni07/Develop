package class1;
import java.util.Scanner;
public class L4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number of terms:");
		int a = in.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(a+" "+"x"+" "+i+" "+"="+" "+(a*i));
			
		}
		in.close();
	}

}

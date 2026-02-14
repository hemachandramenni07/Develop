package class1;
import java.util.Scanner;
public class L20 {

	public static void main(String[] arg) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int a=in.nextInt();
		
		for(int i=1;i<=a;i++) {
			for (int s=1;s<=a-i;s++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}

}

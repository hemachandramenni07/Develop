package class1;
import java.util.Scanner;
public class L39 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int r = in.nextInt(); 	
		for (int i=1;i<=r;i++) {
			for (int s=1;s<=r-i;s++) {
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print((char)('A'+j-1)+" ");
			}
			for (int j=i-1;j>=1;j--) {
				System.out.print((char)('A'+j-1)+" ");
			}
			System.out.println();
		}
		in.close();
	}

}

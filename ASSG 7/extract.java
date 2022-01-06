//Question 9
import java.util.*;
class extract{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
   		String str = sc.nextLine();
		System.out.println("Enter the starting index: ");
		int n= sc.nextInt();
		System.out.println("Enter the range of character to be extracted: ");
   		int m = sc.nextInt();
		String extract = str.substring(n,n+m);
		System.out.print("\n"+extract);
	}
}

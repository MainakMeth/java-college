//Question 3
import java.util.*;

class Trim_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("String before trimming: " + str);
		System.out.println("Length before trimming: " + str.length());
		str = str.trim();
		System.out.println("String after trimming: " + str);
		System.out.println("Length after trimming: " + str.length());
	} // end of main()
} // end of class

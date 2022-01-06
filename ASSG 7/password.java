import java.util.*;
class password{
	public static void main(String args[]){
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name: ");
   		String  str = sc.nextLine();
		char ch[] = str.toCharArray();
		System.out.print("Enter your roll number: ");
		String roll=sc.nextLine();
		int rlen = roll.length();
		char[] p = new char[4];
		p[0] = str.charAt(0);	
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				for(int j=1;j<=2;j++) {
					p[j]=str.charAt(i+1);
				}
			}
		}
		String pass= String.valueOf(p).trim().concat(roll.substring(rlen-4,rlen));
		System.out.print("password- "+pass);

	}
}

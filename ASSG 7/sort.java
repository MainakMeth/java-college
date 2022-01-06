//Q5 without space
import java.util.*;
class sort{
	void swap(char ch[],int len){
		char temp;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(ch[j]<ch[i]){
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}
	public static void main(String args[]){
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string - ");
   		String  str = sc.nextLine();
		int n=str.length();
		char ch[] = str.toCharArray();
		System.out.print("\nUnsorted-");
		for(int i=0;i<str.length();i++){
			System.out.print(ch[i]);
		}
		sort ob=new sort();
		ob.swap(ch,n);
		System.out.print("\nSorted-");
		for(int i=0;i<str.length();i++){
			System.out.print(ch[i]);
		}
	}
}

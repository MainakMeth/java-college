import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
int number, digit, rev= 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
while(number > 0)
{
digit = number % 10;

rev = rev*10 + digit;

number = number / 10;
}

System.out.println("Sum of Digits: "+rev);
}
}

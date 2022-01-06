/* Assignment 7 question 2
Take a string from keyboard and a char array (of length 5).
Now append the string to that char array.*/

import java.util.*;
 class c {

    public static void main(String args[])
    {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String str=sc.nextLine();
        char[] ch = new char[5];
      System.out.println("Add some charecter");
      for (int i = 0; i < 5; i++)
      {
            ch[i] =sc.next().charAt(0);
        }
        String string =new String(ch);
         System.out.println(string);

       String s3= str+string;
        System.out.println(s3);
        }
  }

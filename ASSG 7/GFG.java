//Assignment 7 question1
/*Take a sting from keyboard and
convert into character array (new one).*/

import java.util.*;
 class GFG {

    public static void main(String args[])
    {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String str=sc.nextLine();
        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
    }
}

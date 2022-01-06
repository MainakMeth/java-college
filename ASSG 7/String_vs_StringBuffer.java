//question 7
public class String_vs_StringBuffer {

    public static void main(String[] args) {

        String str_ob = new String("Hello");
        StringBuffer str_buff_ob = new StringBuffer("Hello");

        str_ob.concat(" World!");
        str_buff_ob.append(" World!");

        System.out.println("String object: " + str_ob);
        System.out.println("String buffer object: " + str_buff_ob);
    } // end of main()
} // end of class String_vs_StringBuffer

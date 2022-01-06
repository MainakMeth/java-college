//Q10
class String_delElement {

    String del_element(String str, int m) {
        // deletes the mth element from String str

        String new_str = "";

        for (int i = 0; i < str.length(); i++) {
            if (i != m)
                new_str += str.charAt(i);
        }

        return new_str;
    } // end of del_element(String, int)

    public static void main(String[] args) {

        String str = "";
        int m = 0;

        try {
            str = args[0].trim();
            m = Integer.parseInt(args[1]);
        }
        catch (Exception e) {
            System.out.println("err: " + "INVALID INPUT");
            java.lang.System.exit(0);
        }

        String new_str = (new String_delElement()).del_element(str, m);

        System.out.println("Entered string: " + str);
        System.out.println("String after deletion of " + m + "th element: " + new_str);        
    } // end of main(String[])
} // end of class String_delElement
// input Mainak n
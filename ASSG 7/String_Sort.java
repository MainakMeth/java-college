//Q8
// takes a string as input from command-line argument and displays the alphabetically sorted string
class String_Sort {

    String sort_alphabetic(String str) {

        String str2 = str.toUpperCase();
        String sorted_str = "";

        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((int)str2.charAt(j) == i) {
                    sorted_str += str.charAt(j);
                }
            } // end of inner for loop
        } // end of outer for loop

        return sorted_str;
    } // end of sort_alphabetic(String)

    public static void main(String[] args) {

        String str = "";

        try {
            str = args[0].trim();
        }
        catch (Exception e) {
            System.out.println("err: " + "INVALID INPUT");
            java.lang.System.exit(0);
        }

        String sorted_str = (new String_Sort()).sort_alphabetic(str);

        System.out.println("Entered string: " + str);
        System.out.println("Sorted string: " + sorted_str);
    } // end of main(String[])
} // end of class String_Sort
//Question 6
class Generate_Pass {

    String generate(String first_name, String middle_name, String last_name, long roll) {

        String pass = "";

        pass += first_name.charAt(0);
        if (middle_name.length() != 0) pass += middle_name.charAt(0);
        pass += last_name.charAt(0);

        pass += Long.toString(roll % 10000);

        return pass;
    } // end of generate(String, String, String, long)

    public static void main(String[] args) {

        String first_name = "";
        String middle_name = "";
        String last_name = "";
        long roll = 0;

        try {
            int index = 0;

            first_name = args[index++];
            if (args.length == 4) middle_name = args[index++];
            last_name = args[index++];
            roll = Long.parseLong(args[index++]);
        }
        catch (Exception e) {
            System.out.println("err: " + "INVALID INPUT");
        }

        String pass = (new Generate_Pass()).generate(first_name, middle_name, last_name, roll);

        System.out.println("password: " + pass);
    } // end of main(String[])
} // end of class Generate_Pass

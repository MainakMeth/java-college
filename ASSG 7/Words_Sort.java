//Q5 with space
class Words_Sort {

    String[] str;

    Words_Sort(String str) {
        this.str = str.split("");
    } // end of constructor

    void display() {
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
        System.out.println();
    } // end of display()

    void sort_word(int lb, int ub) { // lb = lower bound, ub = upper bound

        String temp;

        for (int i = lb; i < ub - 1; i++) {
            for (int j = lb; j < ub - 1 - (i - lb); j++) {
                if (str[j].charAt(0) > str[j + 1].charAt(0)) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            } // end of inner for loop
        } // end of outer for loop
    } // end of sort_word(int, int)

    void sort() {
        int lb = 0;
        int ub = 0;

        while (ub < str.length) {

            if (str[ub].charAt(0) == ' ') {
                sort_word(lb, ub++);
                lb = ub;
            }

            ub++;
        }
    } // end of sort()

    public static void main(String[] args) {

        String str = "";

        try {
            str = args[0];
            str = str.trim() + " ";
        }
        catch (Exception e) {
            System.out.println("err: " + "INVALID INPUT");
        }

        Words_Sort ob = new Words_Sort(str);
        ob.display();

        ob.sort();
        ob.display();
    } // end of main(String[])
} // end of class Words_Sort

public class Split
{

    public static void main(String args[]) {
        String test = "Miruna";
        int splitvalue = 3;
        splitString(test, splitvalue);
    }

    static void splitString(String str1, int n) {
        int str_size = str1.length();
        if (str_size % n != 0) {
            System.out.println("The size of the given string is not divisible by " + n);
            // return;
        } else {
            System.out.println("The given string is: " + str1);
            System.out.println("The string divided into " + n + " parts and they are: ");
            int part_size = str_size / n;
            for (int i = 0; i < str_size; i++) {
                if (i % part_size == 0) {
                    System.out.println("");
                }
                System.out.print(str1.charAt(i));
            }
        }
    }

}







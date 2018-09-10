import java.util.Scanner;


public class vowelandcon {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter the word");
        String st = in.nextLine();
        int len = st.length();
        for (int i=0; i<len; i++){

            if((st.charAt(i)>='a' && st.charAt(i)<='z') || (st.charAt(i)>='A' && st.charAt(i)<='Z')) {
                if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i'
                        || st.charAt(i) == 'o' || st.charAt(i) == 'u' || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I'
                        || st.charAt(i) == 'O' || st.charAt(i) == 'U') {
                    System.out.println(st.charAt(i) + "\t vowel");
                } else {

                    System.out.println(st.charAt(i) + "\t consonent");
                }
            }
                else System.out.println( st.charAt(i)+"\terror it is not a character");
        }


    }

}



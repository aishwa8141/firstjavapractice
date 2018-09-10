import java.util.Scanner;

public class reverse_str {

    public static void main(String[] args){
        Scanner str=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=str.next();
        String reverse = "";


        for(int i = str1.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str1.charAt(i);
        }

         System.out.println(reverse);
    }
}

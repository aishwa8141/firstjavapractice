import java.util.Scanner;




public class Palindrome {

    public static void main(String[] args) {

        int reversno = 0;
        System.out.println("enter the number to check palindrome or not");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int original_no;
        original_no = n;

        while (n != 0) {
            int r = n % 10;
            reversno = reversno * 10 + r;
            n = n / 10;
        }
        if (original_no == reversno) {
            int number=original_no;
            int even_digits_sum = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    even_digits_sum = even_digits_sum + digit;
                }
                number /= 10;
            }
            if (even_digits_sum > 25) {

                System.out.println( original_no+"palindrome and the sum of even numbers is greater than 25");
            }
           else{
               System.out.println(original_no+"is is palindrome and sum of even numbers is less than 25");
            }
        }

        else {
            System.out.println("the given no:" + original_no + " is not a palindrome");
        }
    }
}


import java.util.Scanner;

public class repeat {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("enter a string");
        String str1 = str.next();
        Scanner n = new Scanner(System.in);
        System.out.println("enter a number");
        int num = n.nextInt();
        int num1=num;
        int len = str1.length();
        char arr1[]=str1.toCharArray();
        int len1=arr1.length;

        System.out.print(str1);
        while (num != 0) {
            for(int i=(len1-num1);i<len1;i++)
                System.out.print(arr1[i]);
            num--;

        }
    }
}
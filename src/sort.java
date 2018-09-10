import java.lang.reflect.Array;
import java.util.Scanner;

public class sort {


    public static void main(String [] args){
        Scanner num=new Scanner(System.in);
        System.out.println("enter a num");
        int number=num.nextInt();
        String n=Integer.toString(number);
        char[] arr=n.toCharArray();
        int len=n.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++)
            {
               if(arr[i]<arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
               }
            }

        }
        System.out.println(arr);
        int even_digits_sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                even_digits_sum = even_digits_sum + digit;
            }
            number /= 10;
        }


        if (even_digits_sum > 15) {

            System.out.println("sum of even numbers:"+even_digits_sum);

            System.out.println( "true");
        }
        else{
            System.out.println("sum of even numbers:"+even_digits_sum);
            System.out.println("false");
        }


    }
}

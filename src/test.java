import java.util.Scanner;

public class test {

    public static void main(String[] args){

        System.out.println("Enter a integer number");
        int num;
        Scanner scan=new Scanner(System.in);
        num= scan.nextInt();

        if(num>20&&num<30){
            if(num%2==0){
                System.out.println("jerry");
            }
            else {
                System.out.println("tom");
            }
        }



    }



}

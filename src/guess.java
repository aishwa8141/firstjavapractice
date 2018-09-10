import java.util.Scanner;

public class guess {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number in the range 1and 50");

        int number=scan.nextInt();
        int n=10;
        if(number==n) {

            System.out.println("number guessed matches original number");
        }
        else if(number>n){
            System.out.println("number guessed greater than original number");

        }
        else{
          System.out.println("number guessed is less than original number");
        }

        }



    }


import java.util.Scanner;

public class Firstjava {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner n = new Scanner(System.in);

       do{
           double a = n.nextDouble();
            if(a<0)
                break;
               System.out.println(a);

           }while (true);


    }
}

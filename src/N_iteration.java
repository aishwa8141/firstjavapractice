import java.util.Scanner;

public class N_iteration {

    public static void main(String [] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number");
        int n=scan.nextInt();

        for (int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);

            }



    }

}

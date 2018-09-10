import java.util.Scanner;

public class integersum {

    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        int total=0;
        System.out.println("input: enter 0 to stop");
        int num=n.nextInt();
         while (num!=0){
             total += num;
             num=n.nextInt();
         }
     System.out.println("output:"+total);
    }
}

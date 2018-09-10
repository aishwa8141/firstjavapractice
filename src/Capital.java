import java.util.Scanner;

public class Capital {


    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a character ");
        char ch=input.next().charAt(0);
        if(ch>='A'&& ch<='Z')
        {
            System.out.println(ch+"\tis a capital letter");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println(ch+"\t lowercase");
        }
        else if(ch>='0'&& ch<='9')
        {
            System.out.println(ch+"it is a digit");
        }
        else{
            System.out.println("it is a special character");
        }

    }
}

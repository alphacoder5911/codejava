
import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        System.out.println("HI SHREYAS");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AGE OF SHREYAS ");
        int s=sc.nextInt();
        System.out.println("THE AGE IS "+s);
        if(s>18)
        {
            System.out.println("SHREYAS CAN HAVE A DRIVERS LICSENCE");
        }
        else
        {
            System.out.println("LICENCE NAHI MILEGA");
        }
        
    }
}

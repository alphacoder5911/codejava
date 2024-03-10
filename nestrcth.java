import java.util.Scanner;

public class nestrcth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int [] arr=new int[3];
    arr[0]=41;
    arr[1]=61;
    arr[2]=22;
      System.out.println("ENTER THE VALUE U WANT TO DIVIDE");
      int val= sc.nextInt();
      System.out.println("ENTER THE INDEX OF ARRAY ");
      int ind=sc.nextInt();
      try{
         
        System.out.println("THIS IS FOR LEV 1");
         try{
            System.out.println("THE VALUE AT INDEX ENETERD IS "+arr[ind]);
            System.out.println("THE VALUE AFTER DIVISION IS "+arr[ind]/val);
         }
         catch (ArrayIndexOutOfBoundsException e)
         {
            System.out.println("ARRAY OUTA BOUND EXECPTION"+e);
         }
      }
      catch(Exception e)
      {
         System.out.println("SOME OTHER EXCEPTIN"+e);
      }

    }
}

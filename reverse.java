import java.util.*;

public class reverse {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int [] cal;
    
    System.out.println("ENTER THE size of the array ");
    int m= sc.nextInt();
    cal= new int[m];
    System.out.println("ENTER THE VALUES TO BE ADDED");
    for(int i=0;i<m;i++)
    {
         
                cal[i]=sc.nextInt();

    }
   System.out.println("REVERSING ELEMENTS IN THE ARRAY");
    int temp;
    for(int i=0;i<m/2;i++)
    {
        temp=cal[i];
        cal[i]=cal[m-i-1];
        cal[m-i-1]=temp;

    }
    for(int i=0;i<m;i++)
    {
        System.out.println(cal[i]+"\n");
    }
}
}

import java.util.Scanner;

class AGEEXEPTON extends Exception{
    public String getMessage()
    {
        return super.getMessage()+"AGE KAM DAAL LAVDE";
    }
}
public class excepclass {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AGE OF THE PEROON");
        int age=sc.nextInt();
        if(age>100)
        {
            try{
                throw new AGEEXEPTON();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}


import java.util.*;
/**
 * RANDOM
 */
class random {
private int inp;
private int y;

public random()
{
    Random ran=new Random();
    y=ran.nextInt(100);

}

public int getuser()
{
    return y;
}

public void takeinp(int n)
{
    inp=n;
}
public int getinp()
{
    return inp;
}
    
}

public class rangame {

    
   
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        random cho=new random();
        int count=0;
         while(true){
            count++;
            
        System.out.println("ENTERING THE TAKE INPUT ");
        int s=sc.nextInt();
            cho.takeinp(s);
        
            if(cho.getinp()==cho.getuser())
            {
                System.out.println("yess ! its a match");
                System.out.println("TRY"+count);
                break;
            }
            else if(cho.getinp()>cho.getuser())
            {
                System.out.println("INPUT IS GREATER THAN GENERATED NUM");
            }
            else
            {
                System.out.println("SMALLER THAN NUMBER ");
            }
            
            

        }
        }
}

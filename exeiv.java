import java.util.InputMismatchException;
import java.util.Scanner;
class inputmismatchexp extends Exception{
    public String toString(){
        return "CANNOT PERFORM CALC WITH  THE GIVEN SET";

    }
    public String getMessage(){
        return super.getMessage()+"CANNOT PERFORM THE GIVEN OP";
    }
}
class maxnumbers extends Exception{
    public String toString(){
        return "MAXIMUM NUMBERS EXCEEDED ";

    }
    public String getMessage(){
        return super.getMessage()+"MAXIMUM NUMBERS EXCEEDED";
    }
}
class cannotdivzero extends Exception{
    public String toString(){
        return "ILLEGAL TO DIVIDE BY ZER0";

    }
    public String getMessage(){
        return super.getMessage()+"ILLEGAL TO DIVIDE BY ZER0";
    }
}


class costumcal {
    int addition(int a,int b )  throws inputmismatchexp,maxnumbers
    {
        if(a>10000 ||b>10000)
        {
            throw new maxnumbers();
        }
        if(a==8 || b==9)
        {
            throw new inputmismatchexp();
        }
        return a+b;
    }

    int substrcation(int a,int b) throws inputmismatchexp,maxnumbers
    {
        if(a>10000 ||b>10000)
        {
            throw new maxnumbers();
        }
        if(a==8 || b==9)
        {
            throw new inputmismatchexp();
        }
        return a-b;
    }

    double multiplication(int a,int b) throws maxnumbers{
        if(a>10000 ||b>10000)
        {
            throw new maxnumbers();
        }
        if(a>7000 || b>7000)
        {
            throw new maxnumbers();
        }
        return a*b;
    }

    double div(int a,int b) throws cannotdivzero,maxnumbers
    {
        if(a>10000 ||b>10000)
        {
            throw new maxnumbers();
        }
        if(b==0)
        {
            throw new cannotdivzero();
        }
        return a/b;
    }
}
public class exeiv {
   
    public static void main(String[] args) throws InputMismatchException{
    Scanner sc=new Scanner(System.in);
    costumcal cal=new costumcal();
    int choice;
        do{
            System.out.println("PRESS 1]ADD. 2]SUB 3]MUL 4]DIV");
            int cho=sc.nextInt();
             switch (cho) {
                case 1:System.out.println("ENTER TWO NUMBERS FOR ADDITION ");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        int c;
                        try{
                        System.out.println( cal.addition(a, b));
                        }
                        catch(Exception e)
                        {System.out.println(e);}
                         break;
                case 2:
                System.out.println("ENTER TWO NUMBERS FOR SUBTRACTION  ");
                int a1=sc.nextInt();
                int b1=sc.nextInt();
               
                try{
                System.out.println( cal.substrcation(a1, b1));
                }
                catch(Exception e)
                {System.out.println(e);}
                 break; 
            case 3:
            System.out.println("ENTER TWO NUMBERS FOR multiplication ");
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            try{
                System.out.println("MULTIPLICATION IS "+cal.multiplication(a2, b2));
            }
            catch(Exception e)
            {System.out.println(e);}
            break;
            case 4:
            System.out.println("ENTER TWO NUMBERS FOR division ");
            int a3=sc.nextInt();
            int b3=sc.nextInt();
            try{
                System.out.println("DIVISON IS "+cal.div(a3, b3));
            }
            catch(Exception e)
            {System.out.println(e);}
            break;
            
                default:
                    break;
             }
             System.out.println("want to perform again press 1");
              choice=sc.nextInt();
        }while(choice==1);
    }
}

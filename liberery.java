import java.util.Scanner;

class lib{
    
    String b [];
    String is[];
    int count,i;

    public lib()
    {
        this.b=new String[100];
        this.is=new String[100];
        this.count=0;
    }
    public void addbook(String boo){
    
            this.b[i]=boo;
            i++;
            count++;
    }
    /**
     * @param boo
     */
   public void issuebook(String book)
   {
    for(int i=0;i<this.b.length;i++)
    {
        if (this.b[i].equals(book))
        {
            System.out.println("THE BOOK HAS BEE ISSUED ");
         this.b[i]=null;
         return;

        }
        int j=0;
        is[j]=book;
        j++;
    }
   }
    public void availbook()
    {
        for(String element:this.b)
        {
            if(element == null)
            {
                continue;
            }
            System.out.println(element);
        
        }
    }
    

    
    public void isdisp()
    {
        for(String ele:is)
        {
            if(ele==null)
            {
                break;
            }
            System.out.println(ele);
        }
    }

    
    
}

public class liberery {
    public static void main(String[] args) {
        
        int y;
        Scanner sc=new Scanner(System.in);
        lib booka=new lib();
        do
        {
        System.out.println("CHOOSE 1.ADD BOOK \n 2.ISSUE BOOK \n3.RETURN BOOK \n4.SHOW AVAILABLE BOOKS ");
        int c=sc.nextInt();
        switch (c) {
            case 1:
            System.out.println(" ADD THE BOOKS TO THE LIBRARY ");
            String bo=sc.next();
            booka.addbook(bo);
                break;
            case 2: 
            System.out.println("YOUR CHOICES ARE ");
            booka.availbook();
            System.out.println("ENTER THE BOOK YOU WANT ");
            String issue=sc.next();
            booka.issuebook(issue);
            booka.isdisp();
            break;

            case 3:
            System.out.println("NUMBER OF AVAILABLE BOOKS ARE");
                booka.availbook();
                break;
            
            case 4:
            System.out.println("ENTER THE BOOK YOU WANT TO RETURN ");
             String boo=sc.next();
            booka.addbook(boo);
            
            default:
                break;
        
        }
        System.out.println("do u want to repeat the above ops if yes press 1  ");
         y=sc.nextInt();
        }while(y==1);
        
    }
    
}

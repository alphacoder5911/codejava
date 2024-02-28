class baap {
    int res;
    public baap(){
        System.out.println("RESULT KA KYA HUA");
    }   
    public baap(int i)
    {
        System.out.println("  IS YOUR RUSULT "+i);
        this.res=i;
    }
    public void order()
    {
        System.out.println("PADHAI KARRRRRR");
    }
}

interface baaporder{
    public void run();
    public void dukaanja();
}

class choote extends baap implements baaporder{//COMPULSORILY IMPLEMENT THE ABSTRACT DEFLARATION OF BAAP ORDER  
   
        public void run()
    {
        
        System.out.println("LATE HOOGAYA COLLEGE KO BHAAG ");
    }
    public void dukaanja()
    {
        
        System.out.println("DUKAAN SE SAMAAN LAAAA ");
    }
    public void order()
    {
        
        
        System.out.println("DRIVING A CAR");
    }
    choote(){
        super(22);
        System.out.println("CONSTRUCTOR OF CHILD");//SUPER KEYWORD WRT CONSRUCTORS CAN BE USED ONLY IN CONSTRUCTOR
        //OF CHILD CLASS 
    }

}
public class interfice2 {
    public static void main(String[] args) {

        //JUST A PRACTICE ON INTERFACE 
        choote shreyas=new choote();
        
                shreyas.run();
    }
    
}

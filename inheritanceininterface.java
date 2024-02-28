interface parentinter{
    void meth1();
    void meth2();
}

interface  childinter extends parentinter{
    void meth3();
   
}

class sample implements childinter{
    //NOW IN THIS CLASS I WILL HAVE TO IMPLEMENT METHS OF PARENTINTER OR DECLARE THE COM
    //PLETE CLASS AS ABSTRACT 
    public void meth1()
    {
        System.out.println("METHOD 1");
    }
    public void meth2()
    {
        System.out.println("MEHTOD2 ");
    }

    public  void meth3()
    {
        System.out.println("method 3 ");
    }


}
public class inheritanceininterface {
    
    public static void main(String[] args) {
        sample samp=new sample();
        samp.meth1();
        
    }
}

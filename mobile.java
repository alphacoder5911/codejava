interface camera
{
    public void takephoto();
    public void takevdo();
    default void take4kvdo()
    {
        System.out.println("Taking vdo in 4k");//auto added to all the implemented classes
    }
}
/**
 DEFAULT METHODS ARE USED WHEN WE WANT TO MAKE ANY ADDITIONS IN ANY INTERFACE , IF WE DIRECTLY DO IT WE MAY RECIEVE 
 AN ERROR FORM THE IMPLEMENTED CLASS TO MAKE CHANGES IN THEM ACCORDING TO THE NEWLY ADDITION 
 THEREFORE TO AVOID THAT WE USE DEFAULT METHODS  */
 interface wifi {
    String [] nets();
    public void connettonet();
    
}
class cellphone{
    public void callnumber()
    {
        System.out.println("CALLING............");
    }
    public void callpick()
    {
            System.out.println("HELLO");
    }
}

class mysmartphone extends cellphone implements wifi,camera{
    public void takephoto()
    {
        System.out.println("CLICKKKKKKKKK");
    }
    public void takevdo()
    {
        System.out.println("TAKIN VDO");
    }

public String[] nets()
{
    System.out.println("LIST OF AVAILABLE NETWORKS");
    String[] networklist = { "SPL" , "DLINK" ,"RAKKUS"};
    return networklist;
}
    public void connettonet()
    {
        System.out.println("CONNECTING TO NET");
    }
}
public class mobile {
    public static void main(String[] args) {
        mysmartphone sam=new mysmartphone();
        String [] ar= sam.nets();
        for(String item:ar)
        {
            System.out.println(item);
        }
        sam.take4kvdo();;
}
    
}

class base{
    int a;
    public int meth1()
    {
        return 22;
    }
    public void meth2(){
        System.out.println("THIS IS A METHOD OF BASE ");
    }

}

class child extends base{
    public int meth1()
    {
        return 22;
    }

    public void meth2(){
        System.out.println("THIS IS A METHOD OF CHILD ");
    }
}

public class overriding_method {
    //IN THIS  FILE WELL SEE ABOUT OVRRIDING OF METHODS IN JAVA
public static void main(String[] args) {
    /*FIRST LETS  KNOW WHATS METHOD  OVERLODING :
     * WE SAY THAT A METHOD IS OVERRIDDEN WHEN A CHILD CLASS USES OR IMPLEMENTS A METHOD PRESENT IN 
     * MAIN OR BASE CLASS ,[BUT WITH ITS OWN IMPLEMENTATION ]just redifining the exact method as it is 
     * we should not change the number of arguements and any such alteration activities like that .
     * 
     * NOW LETS SEE A PROGRAMME :
    */
    base b= new base();
    System.out.println(b.meth1());
    b.meth2();
    child c =new child();
    c.meth2();
    /*basically kys karenge ki same method copy karenge karneke baad just slight changes to the copied code can be done , note that 
    no changes in parameters,access specifiers and return type should be made;
    Method overriding is used for runtime polymorphism
    
    
{****}Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
     */
}
    
}

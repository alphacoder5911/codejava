class base{
    public int x;
    public void setx(int x)
    {
        this.x=x;
    }
    public int getx()
    {
        return x;
    }
}

class DERIVED extends base{
public int y;
public void sety(int x)
    {
        this.y=x;
    }
    public int gety()
    {
        return y;
    }

}
public class inheritance {
    /*INHERITANCE IS USED TO DERIVA PROPERTIES AND METHODS FROM BASE CLASS AND IF WE WANT TO ADD SOMETHING EXTRA TO THE DERIVED CLASS 
      THEN WE CAN HAPPILY DO THAT WILL HELP IGNORING REINVENTING A WHEEL 

      INHERITANCE MEANS DERIVING SOMETHING OR BUILDING NEW THING WITH EXISTIN CODE
        NOW FOR EXAMPLE SEE THE FOLLOWING PROGRAMME :
    */
    
    public static void main(String[] args) {
        base b=new base();
        //created object for base class 
        b.setx(44);
        System.out.println(b.getx());
        //object for derived class\
        DERIVED der=new DERIVED();
        // here if i use var x of base here it will work but vice versa wont.
        der.sety(30);
        System.out.println(der.gety());
        der.setx(444);
        System.out.println(der.getx());//it inherits some part of base class 
        //java dosent support multilevel inheritance i.e from two class one class is derived 
        //a derived class is inherited by using extends keyword as done above 
    }
}

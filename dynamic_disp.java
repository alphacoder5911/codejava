class phone{
    public void greet()
    {
        System.out.println("good morning ");
    }

    public void ON()
    {
        System.out.println("NOKIA STATED ");
    }
}

class smartphone extends phone
{
    public void playmusic()
    {
        System.out.println("ding ding dign  ");
    }

    public void ON()
    {
        System.out.println("SAMSUNG S22 STARTED");
    }//overridden the function 

}

public class dynamic_disp {
    public static void main(String[] args) {

        phone nokia=new phone();
        nokia.ON();
        smartphone samsung=new smartphone();
        samsung.ON();
        //WE KNOW THAT BOTH ABOVE INSTANCIATIONS ARE LEGAL AND COMMONT .BUT 
        phone obj=new smartphone();
        //we can take the reference as superclass and object inst as subclass the above is also possible 
        //but the opposite of this is not possible 
        //***  SUPERCLASSS KA REFERENCE SUB CLASS KE BARAAABAR HOOSAKHTA HAI /
        /*TAKE FOR EXAMPLE : A SMARTPHONE SAM S24  , WE CAN SAY THAT BHAI PHONE UTHA KE DEDO , BUT IF ITS A BUTTON PHONE 
         * AND IF WE SAY SOMEONE THAT SMARTPHONE UTHA  KE DEDO HE WILL KICK MY ASS OFF 
         */
        //NOW IF WE

        obj.ON();//the on function in smartphone subclass will run as we hve instanced object of smartphone class 
        //but with reference to superclass i.e phone 
        //therefore we can only call those functions or meme=bers that are ther in super class and overriden in sublcass 
        //obj.playmusic();//NOT ALLOWED ****************************

    }
    
}

abstract class parent1{//ABSTRACTION MEANS : HIDING UNNECCESSARY DETAILS FROM THE USER NAD ONLY SHOWING ESSESTIAL DETAILS 
    //ABSTRATION CAN BE ACHIEVED BY ABSTRACT CLASSES nd methods
    parent1()
    {
        System.out.println("hi i am constructor of parent 1");// class mei agar ek abstract method hai tph bhi complete class abstract hai

    }

    abstract public void greet();//parent tells its children that i have just declared an ab class you guys fill whatever you want.
    //in short abstract method matlab ki bhai mei ek method declare abhi karunga but usko kaise aur kab use karna hai woh classes pe depend hoog
    
}

class baccha extends parent1{
    public void greet()
    {
        System.out.println("HI BEHEN KE LAVDE");
    }
}

abstract class baccha2 extends parent1{
    public void grt()
    {
        System.out.println("CHALAJA BHOSADIKE ");
    }

}
//----------------------------------------------------------------------------------------------------------------------------------
//IMPORTANT{
/*BHAI DEKH IF I AM MAKING A CHILD CLASS OF AN ABSTRACT CLASS I MUST AND SHOULD HAVE TO OVERRIDE THAT METHOD OF THE ABSTRACT CLASS in 
the child ones OR I HAVE TO DECLARE THE COMPLETE CHILD CLASS AS ABSTRACT ;
 * IT WOULD BE ILLEGAL OR ERRENOUS TO LEAVE THE ABOVE LINES IGNORED WHILE CODING;

 ABSTRACT CLASSESS OR METHODS CAN BE USED TO ACHEVE DATA SECURITY OR ABSTRACTOIN ;
 */
//IMPORTANT}
//----------------------------------------------------------------------------------------------------------------------------------

// abstract class is a class / zariya jiske help se ek existing class banasakhte ho 
//using abstract class or abstract methods other concrete classes can be derived 
public class ABS {
    //abstract means existing in thoughts and not reality(khayli pulav)
    /*abstract method means just declaring a method and  not implementing it .
     * SIMILARLY ABSTRACT CLASS MEANS THAT CONTAINS Abstract method. EVEN EXISTANCE OF A SINGLE ABSTRACT 
     * METHOD IN A CLASS MAKES THE WHOLE CLASS ABSTRACT 
     * (AB METH)==> abstract void meth(int x, int y)-->here we just declared a function but havent 
     * implemented or we aint know shit what it does 6   */
    public static void main(String[] args) {
        baccha baby=new baccha();//SEE A DERIVED CLASS CAN BE INSTANTIATED / CAN HAVE AN OBJ 
        //parent1 baap=new parent1(); will result erreneous , complier kahega sun VATS(sanskrit 😂😂) abstract class ko instantiate karne ki bhool 
        //matt kar
        
    }

}

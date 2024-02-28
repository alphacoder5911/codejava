/**
     * base
     */
    class base{
        int x;
        public void setx(int x)
        {
            this.x=x;
        }

        public int getx()
        {
            return x;
        }

        public base(){
            System.out.println("HI I AM CONST OF BC ");

        }
        public base(int b)
        {
            System.out.println("HI I AM OVERLOADED CONSTRUCTOR OF VALUE "+b);
        }
        

    }

    class child extends base{
        int y;
        public void sety(int y)
        {
            this.y=y;
        }

        public int gety()
        {
            return y;
        }
       
        public child()
        {
            super(5);
            System.out.println("i am constructor of child class ");
        }
        /*WHEN THERE IS CASE OF CONST OVERLOADING IN PARENT CLASS BY DEFAULT THE CLASS WITHOUT
        PARAMETER IS CALLED ,THERE FORE TO CALL THE ONE WITH PARAMATER SUPER CAN BE USED */
    }
public class const_inherit {
    
    public static void main(String[] args) {
        //base b=new base();//INSTANTIATIONG BASE 
        child c=new child();//INSTANTIATION OF CHILD 
        /*NOW WHEN I RUN THE PROG FIRST THE CONTENTS OF BASE WILL BE EXEXTED THEN CHILD IF I ONLY 
         * PRINT/INVOKE CHILD CUZ CHILD IS DERIVED FROM BASE 
         */
/*WHENEVER I INHERIT A CLASS THE CHILD WILL HAVE ALL THE CONTENTS OF SUPERCLASS AND WHEN THE CHILD IS CALLED
 ALL THE CONTENTS OF SUPERCLASS IN CHILD CLASS WILL BE ALWAYS EXECUTED FIRST */    
        /*NOW LETS OVERLOAD THE CONSTRUCTORS  */
    }
}

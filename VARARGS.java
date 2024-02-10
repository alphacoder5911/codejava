import java.util.*;
public class VARARGS {

    static int add(int ...arr)
    {
        int result=0;
        //THE ABOVE ARGUEMENT IS AVAILABLE IN THE FUNCTION AS AN ARRAY int [] arr;
        for(int element:arr)
        {
                result+=element;// WILL ADD ALL THE ELEMENTS PASSED AS ARUGEMENTS 
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("THE SUM OF THE ENETERD ELEMENTS IS ");
        //HOW THE VARARGS WORKS IS U CAN PASS N NUMBER OF ARGUEMENTS  TO FUNC WHAT IT DOES IS IT WILL STORE 
        //ALL THE ARGUEMETNTS AS AN ARRAY NO MATTER HOW MANY ARE TEHY AND PERFORMS WHATEVER THE OPERATION IS .
        System.out.println(add(9,10,20));
        
    }
}

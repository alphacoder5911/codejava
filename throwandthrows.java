class NegativeRadiusException extends Exception{
    public String toString()
    {
        return "The entered radius is negative.PLEASE CONSTIDER ENTERING POSITIVE ONE ";
    }@Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+"The entered radius is negative";

}
}
public class throwandthrows {
    //LETS DEFINE A FUNCTIONN TO RETURN AREA OF CIRCLE,for that we will define our exception class;

    public static double circle(int r) throws NegativeRadiusException{//THROWS KEYWORD WARNS THE USER OR READER TO RUN THE FUNCTION INTO TRY CATCH 
        //BLOCK TO AVOID FURTHRER ERROERS 
        if(r<0)
        {
            throw new NegativeRadiusException();
        }
        double radius=Math.PI*r*r;
        return radius;

    }
    public static void main(String[] args) {
        try {
            double res=circle(-2);
            System.out.println("THE AREA OF CIRCLE IS "+res);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

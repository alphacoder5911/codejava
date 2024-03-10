public class FinallyBlock {
    //DEFINING A FUNC TO DIVIDE TWO NUMS 
    public static int division(int a,int b) 
    {
        int c;
        try{
            return c=a/b;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("THE FUNCTON IS BEEN EXECUTED NOW CLEARING RESOURCES ");
        }
        return 0;
    }
public static void main(String[] args) {
    //FINALLY IS A BLOCK WHICH IS ALWAYS IN ANY CASE EXECUTED WHETHER OR NOT THE EXECPTIONS ARE HANDELED ;
    /* IN GENERAL IT CONSISTE THE CODET TO RELEASE RESOURCES OR CLOSE A CONNECTION 
    LETS WRITE A CODE TO SHOW THAT :*/ 
    division(20, 0);
}
}

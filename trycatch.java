public class trycatch {
    public static void main(String[] args) {
        //AN EXCEPTION IS A CASE IN WHICH THE PROGRAMME IS NO LONGER WORKING IN NORMAL FLOW AND 
        // GIBIN ERRORS TWO 
        /* TWO TYPES
         * 1]CHECKED--->EXCEPTION IN COMPILE TIME THE COMPILER THROWS ERRER
         * 2]UNCHECKED===>RUNTIME
        */
        //NOW TAKE THE SITUATION OF DIVIDING 6000 BY ANY NUMBER 
        int a=6000;
        int b=0;
        int c;
        /*IF I NORMALLY TRY TO EXECUTE THE PROGRAMME IT WILL THROW AN EXCEPTION 
         * HENCE TRY CATCH IS A METHOD WIRH WHICH WE CAN HANDLE THIS EXCEPTION AND DISPLAY AN APPROPRIATE MSG 
         * THE USE OF TC IS GIVEN  BELOW 
         */
        try {
            c=a/b;
            System.out.println("THE DIVISION OF THE GIVEN NUM ARE "+c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("THERE WAS A PROBLEM RUNNING THE PROGRAMME .AND THE ERROR IS "+e);
        }
        /*IN THE ABOVE TC BLOCK IT WILL FIRST TRY TO DIVIDE THE GIVEN NUMBERS 
         * IF ANY EXCEPTION OCCURS THEN THE EXCEPTION PART WILL HANDEL THE CASE .THIS IS DONE IN ORDER TO PROVIDE GOOD USER EXPERIENCE .
         */
    } 
}

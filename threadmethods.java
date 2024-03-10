class thr2 extends Thread {
    public void run(){
        int i=0;
        while(i<10)
        {
            System.out.println("HI I AM THREAD " +this.getName());
            i++;
        }
        
    }
    public  thr2(String name){
        super(name);
    }
    
}
public class threadmethods {
    public static void main(String[] args) {
        thr2 t1=new thr2("SHRYAS1");
        thr2 t2=new thr2("shryas 2");
        t1.start();
        //NOW IF I WANT TO FIRST TOTALLY COMPLETE EXECUTOI OF T1 THEN I WILL USE JOIN() METH IN TRY CATCH LOOP
        // try{
        //     t1.join();
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e);
        // }
        //if i want t1 to sleep for some time and then continue execution then
        try{
            t1.sleep(40);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        t2.start();
    }
}

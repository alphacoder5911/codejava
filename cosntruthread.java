class merathrd extends Thread implements Runnable{
    public void run(){
        System.out.println("HI I AM THREAD 1");
    }
    public  merathrd(String name){
        super(name);
    }
    public merathrd(Runnable r,String name)
    {
            super(r,name);
        
    }
}
public class cosntruthread {
    public static void main(String[] args) {
        merathrd t1=new merathrd("spl");
        Thread r1=new Thread();
        t1.start();
        System.out.println("ID OF THREAD IS"+t1.getId());
        System.out.println("daemon is ");
        t1.setDaemon(true);
    }
}
////still research karna haiiiii


class thr1 extends Thread {
    public void run(){
        int i=0;
        while(i<30)
        {
            System.out.println("HI I AM THREAD " +this.getName());
            i++;
        }
        
    }
    public  thr1(String name){
        super(name);
    }
    
}
public class priorthread {
    public static void main(String[] args) {
        thr1 t1=new thr1("shreyas1");
        thr1 t2=new thr1("shreyas2");
        thr1 t3=new thr1("shreyas3");
        thr1 t4=new thr1("shreyas4");
        thr1 t5=new thr1("shreyas5");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}

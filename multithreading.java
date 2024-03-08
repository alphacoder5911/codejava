
class thread1 extends Thread{
    int i=0;
    public void run()
    {
        while(i<10)
        {
        System.out.println("I AM COOKING  ");
        System.out.println("I AM HAPPU ");
        i++;
        }
    }
}

class thread2 extends Thread{
    int i=0;
    public void run()//overridden inbuilt method in java thread class 
    {
            while(i<10)
            {
            System.out.println("I AM STUDYING ");
            System.out.println("I AM FRUSTRATED ");
            i++;
            }
    }
}

public class multithreading {
    public static void main(String[] args) {
        //MULTITHREADING IS JUST LIKE MULTIPROCESSTING WHILE BOTH ARE USED FOR A SAME TASK I.E MUTLITASKING 
        //THREAD IS PROCESS INSIDE OF PROCESS THAT TAKES CARE OF INTERNAL PROCESSINF OF A PROCESS AND HELPS IN LIGHT WEIGHT EXECUTION
        //CONCURRENCY : RUNNING AND MANAGING TASKS AT A TIME BUT PERFORMING ONE AT A TIME PERFECTLY.
        //PARALLELISM: RUNNING AND MANAGING MULTIPLE TASKS BY PERFORMING THEM IN PARALLEL REAL TIME.
        //-----------------------------------------
        /*However, we use multithreading than multiprocessing because threads use a shared memory area.
         They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.
         
         Mostly used in games ,aanimations etc*/

         thread1 t1=new thread1();
         thread2 t2= new thread2();
         t1.start();
         t2.start();//these are inbuit methods in java thread class 
    }
}

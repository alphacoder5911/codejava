

class myrunnabble implements Runnable{
     int i=0;
    public void run()
    {
        while(i<400)
        {
        System.out.println("HI I AM BULLET FIRED FROM GUN 1");
            i++;
    }
    }

}
class myrunnabble2 implements Runnable{
     int i=0;
    public void run()
    {
        while(i<400)
        {
        System.out.println("HI I AM BULLET FIRED FROM GUN 2");
            i++;
    }
    }

}

public class runnable {
    public static void main(String[] args) {
        myrunnabble bullet1=new myrunnabble();//class 
        Thread gun1=new Thread(bullet1);//firing thread class function 
        //i cannot use bullet1.start() directly cuz its simiply useless to fire a gun without bullet
        gun1.start();

        myrunnabble2 bullet2=new myrunnabble2();
        Thread  gun2=new Thread();
        gun2.start();
    }
    
}

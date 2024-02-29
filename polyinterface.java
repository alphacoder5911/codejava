interface gps{
    public void location();
}

interface camera{
    public void clickphoto();
    public void takevdo();
    default void  take4kvdo()
    {
            System.out.println("4K VDO TAKING");
    }
}

interface mediaplayer{
    public void playmusic();
}

class cellph{
    void takecall()
    {
        System.out.println("HELLO , SHREYAS SPEAKING ");
    }
    
    void pickcall(int num)
    {
        System.out.println("CALL FROM THE NUMBER "+num);
    }
}

class smartphone extends cellph implements camera,gps,mediaplayer{
    public void location()
    {
        System.out.println("YOU ARE IN SDM COLLEGE , NETRAVATI BOYS HOSTEL");
    }
    public void clickphoto()
    {
        System.out.println("SMILE PLEASEEEEE");
    }

    public void takevdo()
    {
            System.out.println("TAKING VDO ");
    }

    public void playmusic()
    {
        System.out.println("BHEEGE HOOT TERE ");
    }
}

public class polyinterface {
    public static void main(String[] args) {
        //POLYMORPHISM MEANS ONE THING THAT HAS MANY FORMS;
        //DYNAMIC DISPATCH CAN BE USED TO ACHIEVE POLYMORPHISM;
        /*TAKE EXAMPLE OF A SMARTPHONE THAT IS USED AS A CELLPHONE TO CALL,CAMERA AND GPS */
        smartphone oneplus=new smartphone();
        oneplus.clickphoto();// normal 
        //SUPPOSE WE WANT TO USE CAMERA , USKO MEI SMARTPHONE THAMADIYA AUR CAMERA OPEN KARDIYA ;
        //I WILL USE DYNAMIC DISPATCH 
        camera meracam=new smartphone();
        meracam.takevdo();
        //in the above vdo i can use only the features of camera as i made the camera as the referance 
       // meracam.pickcall();-->CANNOT BE PERFORMED 
       gps liveloc= new smartphone();
       liveloc.location();;
    }
    
}

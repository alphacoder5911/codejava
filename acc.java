
class employee
{
    private int id;
    private String name;
    public void setid(int i)
    {
        id=i;
    }
    public int getid()
    {
        return id;
    }
    public void setname(String n)
    {
        name=n;
    }
    public String getname()
        {
            return name;
        }
    
}

public class acc {
    //ACCESSES SPECIFIERS 
    public static void main(String[] args) {
        /*THERE ARE 4 ACCESS SPEC 
        1]PRIVATE:ONLY CHILD AND ITS MEMBERS
        2]PUBLIC:ALL IN PACKAGE OR OUTA PACKAGE
        3]PROTECTED: ALL FIELDS  WITHIN PACKAGE AND A CHILD CLASS OUTSIDE THE PACKAGE;

        THERE ARE FEW NON-ACCESS MODS LIKE:STATIC,TRANSIENT,abstract, synchronized, native, volatile
        NOW LETS TAKE EG:OF A PRIVATE ONE 
         */

            employee e1=new employee();
            //e1.id=1123; such kind od attribute setting is not allowed on a private variable
            //hence we use getters and setters for this job
            e1.setid(1233);
           System.out.println( e1.getid());
           e1.setname("shreyas");
           System.out.println(e1.getname());
    }
}

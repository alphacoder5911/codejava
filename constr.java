class meraemploy {
    private int id;
    private int salary;
    private String name;
    
    public  meraemploy(int n,int sal)
    {
        id=n;
       salary=sal;//this keywork is used to help the compiler from confusion that this salary is froom the class 
    }
    public meraemploy(int n,int sal,String name)
    {/*MAINLLY IF U HAVE THE CONSTRUCTOR INVOKED YOU WILL BE FREE FROM THE BURDEN OF SETTERS THAT NEEDS TO BE INVOKED ALL THE TIME */
        id=n;
        salary=sal;
        this.name=name;
    }
    public int getid()
    {
        return id;
    }
    public int getsalary()
    {
        return salary;
    }
        
    public String getname()
    {
        return name;
    }
    }
    public class constr {
        public static void main(String[] args) {
            meraemploy emp=new meraemploy(56,500000);/*WHEN YOU CREATE AN INSTANCE OF CLASS ITS CORRESPONDING CONSTRUCTOR IS AUTOMATICALLY 
            INVOKED AND THE NEEDFULL IS DONE <REFET THE CLASS ITSELF> */ 
            System.out.println(emp.getid()+"\n"+emp.getsalary());
            meraemploy emp1=new meraemploy(56, 40000,"SHREYAS");
            System.out.println(emp1.getid()+"\n"+emp1.getsalary()+"\n"+emp1.getname());
        }/*Rules for creating Java constructor
    There are two rules defined for the constructor.
    
    Constructor name must be the same as its class name
    A Constructor must have no explicit return type
    A Java constructor cannot be abstract, static, final, and synchronized
     */
    }
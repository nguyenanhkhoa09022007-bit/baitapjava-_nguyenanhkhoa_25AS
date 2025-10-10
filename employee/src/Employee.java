public class Employee {
    private int id;
    private  String firstname;
    private String latename;
    private int salary;

    public Employee(int id,String firstname,String latename,int salary){
        this.id = id;
        this.firstname = firstname;
        this.latename = latename;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public  String getLatename(){
        return  latename;
    }
    public  String getName(){
        return firstname+" "+ latename;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary ;

    }
    public int getAnnualsalary(){
        return salary * 12;
    }
    public int raisesalary(int percent){
        salary += salary * percent / 100;
        return salary;
    }
    public String toString(){
        return "Employee[id=" + id +",name =" + getName()+",salary=" + salary +"]" ;
    }
}

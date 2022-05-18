
public class Worker extends Person{  
    private int salary; private String deptName;
    public Worker(String name, int salary, String deptName) { 
        super(name);
        this.salary = salary;
        this.deptName = deptName;
        //your code goes here     
    }  
    /*Complete the below function for second test case*/
    public int getSalary() {
     return(salary);
    }
  public String toString() {
    String s = super.getName() + "  " + salary + "  " + deptName;
    //String u = String.format("%s  %3d %s",super.getName(),salary,deptName);
    return(s);
  }  
    //add and complete your other methods here (if needed)
 
}

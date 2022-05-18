
public class Employee {
    private String name;
    private double salary;
      

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    
   //add and complete your other methods here (if needed)

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalarys() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getName()+"\t"+this.getSalarys();
    }
    
}

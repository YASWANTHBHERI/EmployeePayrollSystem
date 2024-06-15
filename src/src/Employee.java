import java.util.ArrayList;

//creating an abstract class
abstract class Employee {

    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee [name = "+name+", id = "+id+",salary = "+calculateSalary()+"]";
    }


}

//creating fulltime employee class
class FulltimeEmployee extends Employee{

    private double monthSalary;

    public FulltimeEmployee(String name, int id, double monthSalary ){
        super(name, id);
        this.monthSalary = monthSalary;
    }
    @Override
    public double calculateSalary() {
        return monthSalary;
    }

}

//creating part-time employee class
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double  hourlyRate;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

}

//creating payrollsystem class to perform operations
class PayrollSystem{
    public ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;

        for(Employee emp: employeeList){
            if(emp.getId()==id) {
                employeeToRemove = emp;
                break;
            }
        }

        if (employeeToRemove!=null) employeeList.remove(employeeToRemove);
    }

    public void displayAllEmployees(){
        for(Employee emp: employeeList){
            System.out.println(emp);
        }
    }

    public void displayEmployeeById(int id){
        Employee getEmployeeById = null;
        for(Employee emp:employeeList){
            if(emp.getId()==id)
            {
                System.out.println(emp);
                getEmployeeById = emp;
                break;
            }
        }
        if(getEmployeeById==null) System.out.println("No Employee Found");
    }

    public void displayMultipleEmployeesByName(String name){
        ArrayList<Employee> multipleEmployees = new ArrayList<>();
        for (Employee emp : employeeList){
            String empName = name.toUpperCase();
            if(emp.getName().toUpperCase().equals(empName)){
                multipleEmployees.add(emp);
            }
        }
        if(multipleEmployees.size()==0) System.out.println("No Employees Found");
        else{
            for (Employee emp : multipleEmployees){
                System.out.println(emp);
            }
        }
    }

}



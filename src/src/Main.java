public class Main {
    public static void main(String[] args) {
        //creating objects of clases
        PayrollSystem payrollSystem = new PayrollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("yaswanth",1,50000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Yash",2,100,40);
        FulltimeEmployee emp3 = new FulltimeEmployee("yaswanth",3,70000.0);
        PartTimeEmployee emp4 = new PartTimeEmployee("Yash",4,100,60);
        FulltimeEmployee emp5 = new FulltimeEmployee("yaswanth",5,90000.0);
        PartTimeEmployee emp6 = new PartTimeEmployee("Niranjan",6,100,80);


        //adding employees in employeeList

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        payrollSystem.addEmployee(emp6);

        //displaying employees
        System.out.println("All Employees");
        payrollSystem.displayAllEmployees();
        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(2);
        System.out.println("After Employee Removed");
        payrollSystem.displayAllEmployees();
        System.out.println("Getting Employee with Id");
        payrollSystem.displayEmployeeById(1);
        System.out.println("Getting Multiple Employees");
        payrollSystem.displayMultipleEmployeesByName("Yaswanth");
    }
}

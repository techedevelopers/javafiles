package Polymorphism;

class employee{
    private String name;
    private int employeeId;

    public employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double calculatePay(){
        return 0.0;
    }

    public static class FullTimeEmployee extends employee{
        private double salary;

        public FullTimeEmployee(String name, int employeeID, double salary){
            super(name, employeeID);
            this.salary = salary;

        }
        public double calculatePay(){
            return salary;
        }
    }
    public static class PartTimeEmployee extends employee{
        private double hourlyRate;
        private double hours;

        public PartTimeEmployee(String name, int employeeID, double hourlyRate, double hours) {

            super(name, employeeID);
            this.hourlyRate = hourlyRate;
            this.hours = hours;
        }
            public double calculatePay(){
                return hourlyRate * hours;
            }
        }
    }

public class Payroll {
    public static void main(String[] args) {
        employee.FullTimeEmployee employee1 = new employee.FullTimeEmployee("Rachel",1251,150000);
        System.out.println("Name of the employee is: " + employee1.getName());
        System.out.println("EmployeeId is: " + employee1.getEmployeeId());
        System.out.println("Salary of the employee is: " + employee1.calculatePay());

        System.out.println(" ");

        employee.PartTimeEmployee employee2 = new employee.PartTimeEmployee("Elena",2101,35.89,2040.68);
        System.out.println("Name of the employee is: " + employee2.getName());
        System.out.println("EmployeeId is: " + employee2.getEmployeeId());
        System.out.println("Salary of the employee is: " + employee2.calculatePay());
    }

}

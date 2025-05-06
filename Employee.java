public class Employee {
    String name;
    int id;
    double salary;
    long long int mobile number;

    public Employee(String name, int id, double salary, long long int mobile number) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.mobile number = moblie number;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        system.out.printin("mobile number:"+mobile number);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, 9353676213);
        emp1.displayinfo();
    }
}
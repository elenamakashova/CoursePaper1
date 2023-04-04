public class Employee {

    private final String firstName;
    private final String middleName;
    private final String secondName;
    private int department;
    private double salary;
    private int id;
    private static int i;

    public Employee(String secondName, String firstName, String middleName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        this.id = i++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID " + this.id + " Имя " + this.firstName + " " + this.middleName + " " + this.secondName + " Отдел " + this.department + " Зарплата " + this.salary;
    }
}
public class Main {

    public static void main(String[] args) {
        EmployeeBook EmployeeBook = new EmployeeBook();
        EmployeeBook.addEmployee("Аркатова", "Татьяна", "Николаевна", 4, 35000);
        EmployeeBook.addEmployee("Сясина", "Татьяна", "Сергеевна", 2, 54000);
        EmployeeBook.addEmployee("Цалина", "Виктория", "Сергеевна", 3, 47000);
        EmployeeBook.addEmployee("Григорович", "Екатерина", "Михайловна", 3, 43000);
        EmployeeBook.addEmployee("Елисеева", "Наталья", "Викторовна", 3, 49000);
        EmployeeBook.addEmployee("Никитина", "Юлия", "Владимировна", 2, 58000);
        EmployeeBook.addEmployee("Василевская", "Нина", "Васильевна", 4, 31000);
        EmployeeBook.addEmployee("Гурская", "Серафима", "Станиславовна", 4, 33000);
        EmployeeBook.addEmployee("Борникова", "Елена", "Анатольевна", 1, 66000);
        EmployeeBook.addEmployee("Чистякова", "Светлана", "Ивановна", 5, 28000);
        EmployeeBook.printList();
        EmployeeBook.increaseSalary();
        EmployeeBook.countMonthExpences();
        EmployeeBook.findMinimumSalary();
        EmployeeBook.findMaximumSalary();
        EmployeeBook.countAverageSalary();
        EmployeeBook.findDepartmentMinimumSalary(4);
        EmployeeBook.findDepartmentMaximumSalary(8);
        EmployeeBook.findDepartmentAverageSalary(3);
        EmployeeBook.increaseDepartmentSalary(1);
        EmployeeBook.printDepartment(2);
        EmployeeBook.findSmallerSalary(40000);
        EmployeeBook.findBiggerSalary(40000);
        EmployeeBook.changeEmployeeSalary("Григорович", "Екатерина", "Михайловна", 47000);
        EmployeeBook.changeEmployeeDepartment("Сясина", "Татьяна", "Сергеевна", 5);
        EmployeeBook.printDepartmentsSeparately();

    }


}
import java.sql.SQLOutput;

public class EmployeeBook {

    private final Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String secondName, String firstName, String middleName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(secondName, firstName, middleName, department, salary);
                employees[i] = newEmployee;
                break;
            }
        }
    }

    public void removeEmployee(String secondName, String firstName, String middleName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSecondName().equals(secondName)) {
                if (employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)) {
                    System.out.println(employees[i].getSecondName() + employees[i].getFirstName() + employees[i].getMiddleName() + " удален");
                    employees[i] = null;
                    return;
                }
            }
        }
    }

    public void printList() {
        System.out.println();
        System.out.println("Печать списка всех сотрудников");
        for (int i = 0; i < employees.length; i++) {
            //Contact contact = contacts[i];
            System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Отдел " + employees[i].getDepartment() + " Зарплата " + employees[i].getSalary() + ";");
        }
    }

    public void countMonthExpences() {
        System.out.println();
        System.out.println("Подсчет затрат на зарплату в месяц");
        double monthExpences = 0;
        for (int i = 0; i < employees.length; i++) {
            monthExpences = monthExpences + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + monthExpences + " рублей");
    }

    public void findMinimumSalary() {
        System.out.println();
        System.out.println("Поиск минимальной зарплаты");
        double minimumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minimumSalary >= employees[i].getSalary()) {
                minimumSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата " + minimumSalary + " рублей");
    }

    public void findMaximumSalary() {
        System.out.println();
        System.out.println("Поиск максимальной зарплаты");
        double maximumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maximumSalary <= employees[i].getSalary()) {
                maximumSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата " + maximumSalary + " рублей");
    }

    public void countAverageSalary() {
        System.out.println();
        System.out.println("Поиск средней зарплаты");
        double monthExpences = 0;
        for (int i = 0; i < employees.length; i++) {
            monthExpences = monthExpences + employees[i].getSalary();
        }
        double averageSalary = monthExpences / employees.length;
        System.out.println("Средняя зарплата " + averageSalary + " рублей");
    }

    public void increaseSalary() {
        System.out.println();
        System.out.println("Индексация зарплаты");
        double newSalary;
        for (int i = 0; i < employees.length; i++) {
            newSalary = employees[i].getSalary() + employees[i].getSalary() * 0.2;
            employees[i].setSalary(newSalary);
            System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Отдел " + employees[i].getDepartment() + " Индексированная зарплата " + employees[i].getSalary() + ";");
        }

    }

    public void findDepartmentMinimumSalary(int department) {
        System.out.println();
        System.out.println("Поиск минимальной зарплаты в отделе");
        double minimumDepartmentSalary = employees[5].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (minimumDepartmentSalary >= employees[i].getSalary()) {
                    minimumDepartmentSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в " + department + " отделе " + minimumDepartmentSalary + " рублей");
    }

    public void findDepartmentMaximumSalary(int department) {
        System.out.println();
        System.out.println("Поиск максимальной зарплаты в отделе");
        double maximumDepartmentSalary = employees[2].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (maximumDepartmentSalary <= employees[i].getSalary()) {
                    maximumDepartmentSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в " + department + " отделе " + maximumDepartmentSalary + " рублей");
    }

    public void findDepartmentAverageSalary(int department) {
        System.out.println();
        System.out.println("Подсчет средней зарплаты в отделе");
        double monthExpences = 0;
        int employeesAmount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                monthExpences = monthExpences + employees[i].getSalary();
                employeesAmount++;
            }
        }
        double averageDepartmentSalary = monthExpences / employeesAmount;
        System.out.println("Средняя зарплата в " + department + " отделе " + averageDepartmentSalary + " рублей");
    }

    public void increaseDepartmentSalary(int department) {
        System.out.println();
        System.out.println("Индексация зарплаты в отделе");
        double newDepartmentSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                newDepartmentSalary = employees[i].getSalary() + employees[i].getSalary() * 0.1;
                employees[i].setSalary(newDepartmentSalary);
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Отдел " + employees[i].getDepartment() + " Новая зарплата " + employees[i].getSalary() + ";");
            }
        }
    }

    public void printDepartment(int department) {
        System.out.println();
        System.out.println("Печать сотрудников отдела " + department);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Зарплата " + employees[i].getSalary() + ";");
            }
        }
    }

    public void findSmallerSalary(double salary) {
        System.out.println();
        System.out.println("Поиск зарплаты, меньшей, чем " + salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Зарплата " + employees[i].getSalary() + ";");
            }
        }
    }

    public void findBiggerSalary(double salary) {
        System.out.println();
        System.out.println("Поиск зарплаты, большей, чем " + salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Зарплата " + employees[i].getSalary() + ";");
            }
        }
    }

    public void changeEmployeeSalary(String secondName, String firstName, String middleName, double newSalary) {
        System.out.println();
        System.out.println("Изменение зарплаты сотрудника " + secondName + " " + firstName + " " + middleName);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSecondName().equals(secondName)) {
                if (employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)) {
                    employees[i].setSalary(newSalary);
                    System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Новая зарплата " + employees[i].getSalary() + ";");
                }
            }
        }
    }

        public void changeEmployeeDepartment(String secondName, String firstName, String middleName, int newDepartment) {
            System.out.println();
            System.out.println("Изменение отдела сотрудника " + secondName + " " + firstName + " " + middleName);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSecondName().equals(secondName)) {
                    if (employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)) {
                        employees[i].setDepartment(newDepartment);
                        System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " Новый отдел " + employees[i].getDepartment() + ";");
                    }
                }
            }
        }

    public void printDepartmentsSeparately() {
        System.out.println();
        System.out.println("Печать сотрудников по отделам");
        System.out.println("Отдел 1: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 1) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ";");
            }
        }
        System.out.println("Отдел 2: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 2) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ";");
            }
        }
        System.out.println("Отдел 3: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 3) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ";");
            }
        }
        System.out.println("Отдел 4: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 4) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ";");
            }
        }
        System.out.println("Отдел 5: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 5) {
                System.out.println("ID " + employees[i].getId() + " Имя " + employees[i].getSecondName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ";");
            }
        }
    }
    }
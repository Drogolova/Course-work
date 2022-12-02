
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванович", "Петров", 1, 70_000);
        employees[1] = new Employee("Пётр", "Сергеевич", "Попов", 1, 75_000);
        employees[2] = new Employee("Екатерина", "Алексеевна", "Смирнова", 2, 90_000);
        employees[3] = new Employee("Василий", "Васильевич", "Кузценов", 2, 80_000);
        employees[4] = new Employee("Светлана", "Владимировна", "Орлова", 3, 85_000);
        employees[5] = new Employee("Олег", "Алексеевич", "Семёнов", 3, 75_000);
        employees[6] = new Employee("Ольга", "Александровна", "Соколова", 4, 90_000);
        employees[7] = new Employee("Анастасия", "Сергеевна", "Васильева", 2, 60_000);
        employees[8] = new Employee("Александр", "Евгеньевич", "Михайлов", 5, 75_000);

        EmployeeBook employeeBook = new EmployeeBook(employees);

        System.out.println("Базовая сложность");
        System.out.println();
        employeeBook.listOfEmployees();
        System.out.println();
        System.out.println("Сумма затран на зарплаты в месяц: " + employeeBook.sumOfSalaries() + " рублей");
        System.out.println();
        employeeBook.employeeWithMinSalary();
        System.out.println();
        employeeBook.employeeWithMaxSalary();
        System.out.println();
        System.out.println("Среднее значение зарплат: " + employeeBook.averageSalary() + " рублей");
        System.out.println();
        System.out.println("Ф.И.О.: всех сотрудников: " + "\n" + employeeBook.fullNameOfEmployees());

        System.out.println("Повышенная сложность");
        System.out.println();
        employeeBook.changeOfSalary();
        System.out.println();
        System.out.println(employeeBook.minSalaryInDepartment(2) + " рублей");
        System.out.println();
        System.out.println(employeeBook.maxSalaryInDepartment(2) + " рублей");
        System.out.println();
        System.out.println(employeeBook.sumOfSalariesInDepartment(2) + " рублей");
        System.out.println();
        System.out.println(employeeBook.averageSalaryInDepartment(2) + " рублей");
        System.out.println();
        employeeBook.changeOfSalaryInDepartment(2, 20);
        System.out.println();
        employeeBook.listOfEmployeesInDepartment(2);
        System.out.println();
        employeeBook.salaryLessThen(70000);
        System.out.println();
        employeeBook.salaryMoreThen(80000);
        System.out.println();

        System.out.println("Очень сложно");
        System.out.println();
        Employee newEmployee = new Employee("Арсений", "Сергеевич", "Волков", 5,100_000);
        employeeBook.addEmployee(newEmployee);
        employeeBook.listOfEmployees();
        System.out.println();
        employeeBook.deleteEmployeeById(7);
        employeeBook.deleteEmployeeByName("Александр Евгеньевич Михайлов");
        employeeBook.listOfEmployees();
        System.out.println();
        employeeBook.changeSalary("Екатерина Алексеевна Смирнова", 100_000);
        System.out.println(employees[2].toString());
        System.out.println();
        employeeBook.changeDepartment("Олег Алексеевич Семёнов", 2);
        System.out.println(employees[5].toString());
        System.out.println();
        employeeBook.fullNamePerDepartment();
    }
}


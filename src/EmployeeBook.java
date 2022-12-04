public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public void listOfEmployees() {
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public int sumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int minSalary() {
        int min = sumOfSalaries();
        for (Employee employee : employees) {
            if (employee != null)
                if (min > employee.getSalary()) {
                    min = employee.getSalary();
                }
        }
        return min;
    }

    public void printEmployeeWithMinSalary() {
        int min = minSalary();
        System.out.println("Сотрудники с минимальной зарплатой: ");
        for (Employee employee : employees) {
            if (employee != null && min == employee.getSalary()) {
                System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
            }
        }
    }

    public void employeeWithMaxSalary() {
        int max = getMaxSalary();
        System.out.println("Сотрудники с максимальной зарплатой: ");
        for (Employee employee : employees) {
            if (employee != null && max == employee.getSalary()) {
                System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
            }
        }
    }

    private int getMaxSalary() {
        int max = 0;
        for (Employee employee : employees) {
            if (employee != null)
                if (max < employee.getSalary()) {
                    max = employee.getSalary();
                }
        }
        return max;
    }

    public int averageSalary() {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        int average = sumOfSalaries() / counter;
        return average;
    }

    public String fullNameOfEmployees() {
        StringBuilder fullNameOfEmployee = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                fullNameOfEmployee.append(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + "\n");
            }
        }
        return fullNameOfEmployee.toString();
    }

    public void changeOfSalary() {
        System.out.println("Проиндексированные зарплаты сотрудников: ");
        int changePercent = 15;
        for (Employee employee : employees) {
            if (employee != null) {
               employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * changePercent));
               String someEmployee = employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName();
                System.out.println(someEmployee + ": " + employee.getSalary() + " рублей");
            }
        }
    }

    public int minSalaryInDepartment(int department) {
        int min = sumOfSalaries();
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment())
                if (min > employee.getSalary()) {
                    min = employee.getSalary();
                }
        }
        System.out.print("Минимальная зарплата по отделу: " + department + " составляет: ");
        return min;
    }

    public int maxSalaryInDepartment(int department) {
        int max = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment())
                if (max < employee.getSalary()) {
                    max = employee.getSalary();
                }
        }
        System.out.print("Максимальная зарплата по отделу : " + department + " составляет: ");
        return max;
    }

    public int sumOfSalariesInDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        System.out.print("Сумма затрат на зарплату по отделу: " + department + " составляет: ");
        return sum;
    }

    public int averageSalaryInDepartment(int department) {
        int counter = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum += employee.getSalary();
                counter++;
            }
        }
        int average = sum / counter;
        System.out.print("Средняя зарплата в отделе: " + department + " составляет: ");
        return average;
    }

    public void changeOfSalaryInDepartment(int department, int percent) {
        System.out.println("Проиндексированные зарплаты сотрудников на: " + percent + "%" +  " в отделе: " + department);
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
                String someEmployee = employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName();
                System.out.println(someEmployee + ": " + employee.getSalary() + " рублей");
            }
        }
    }

    public void listOfEmployeesInDepartment(int department) {
        String employeeInDepartment = null;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                employeeInDepartment = "Отдел " + department + ": " + "Ф.И.О.: " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + ", зарплата: " + employee.getSalary() + " рублей";
                System.out.println(employeeInDepartment);
            }
        }
    }

    public void salaryLessThen(int someValue) {
        System.out.println("Сотрудники с зарплатой меньше чем " + someValue + " рублей");
        String someEmployee = null;
        for (Employee employee : employees) {
            if (employee != null)
                if (someValue > employee.getSalary()) {
                    someEmployee = "id " + employee.getId() + ": Ф.И.О.: " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + ", зарплата: " + employee.getSalary() + " рублей";
                    System.out.println(someEmployee);
                }
        }
    }

    public void salaryMoreThen(int someValue) {
        System.out.println("Сотрудники с зарплатой больше чем " + someValue + " рублей");
        String someEmployee2 = "";
        for (Employee employee : employees) {
            if (employee != null)
                if (someValue < employee.getSalary()) {
                    someEmployee2 = "id " + employee.getId() + ": Ф.И.О.: " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + ", зарплата: " + employee.getSalary() + " рублей";
                    System.out.println(someEmployee2);
                }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployeeById(int idEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == idEmployee) {
                employees[i] = null;
                break;
            }
        }
    }

    public void deleteEmployeeByName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void changeSalary(String fullName, int newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(newSalary);
                break;
            }
        }
    }

    public void changeDepartment(String fullName, int newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setDepartment(newDepartment);
                break;
            }
        }
    }

    public void fullNamePerDepartment() {
        int departmentMax = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() > departmentMax) {
                departmentMax = employee.getDepartment();
            }
        }
        for (int i = 0; i <= departmentMax; i++) {
            if (i != 0) {
                System.out.println("Отдел " + i + ":");
            }
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == i) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }
}

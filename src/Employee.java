import java.util.Objects;

public class Employee {

    private String name;
    private int department;
    private int salary;
    public static int nextId = 0;
    private int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = nextId++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    public Employee(String name, int department, int salary, int id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Сотрудник " + name + '\'' +
                ", отдел " + department +
                ", заработная плата = " + salary +
                ", табельный номер - " + id + '}';
    }
}




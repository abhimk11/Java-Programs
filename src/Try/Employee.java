package Try;
import java.time.LocalDateTime;
public class Employee {
    private int emp_id;
    private int sal;
    private String name;
    private String designation;
    private LocalDateTime DateOfBirth;
    public Employee() {
    }

    @Override
    public String toString() {
        return "Try.Employee{" +
                "emp_id=" + emp_id +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }

    public Employee(int emp_id, int sal, String name, String designation, LocalDateTime dateOfBirth) {
        this.emp_id = emp_id;
        this.sal = sal;
        this.name = name;
        this.designation = designation;
        DateOfBirth = dateOfBirth;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDateTime getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}

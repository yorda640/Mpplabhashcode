import java.util.Objects;

class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String ssn;
    private double salary;

    public Employee(String employeeId, String firstName, String lastName, String birthDate, String ssn, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ssn = ssn;
        this.salary = salary;
    }

    // Getters for the employee details
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since Employee implements Cloneable
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + salary +
                '}';
    }
}


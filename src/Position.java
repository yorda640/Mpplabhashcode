import java.util.Objects;

class Position {
    private String title;
    private String description;
    private Employee employee;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void hireEmployee(Employee employee) {
        this.employee = employee;
    }

    public void print() {
        System.out.print("Position: " + title + " - " + description);
        if (employee != null) {
            System.out.println(" - Employee: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println(" - Vacant");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return title.equals(position.title) && description.equals(position.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }

    @Override
    public Position clone() {
        try {
            return (Position) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since Position implements Cloneable
            throw new AssertionError();
        }
    }
}
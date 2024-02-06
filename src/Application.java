import java.util.ArrayList;
import java.util.Objects;

class Application {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("XYZ Corp");

        // Create departments
        Department hrDepartment = new Department("HR", "Location1");
        Department itDepartment = new Department("IT", "Location2");

        // Add departments to the company
        company.addDepartment(hrDepartment);
        company.addDepartment(itDepartment);

        // Add positions to departments
        hrDepartment.addPosition(new Position("HR Manager", "Manages HR operations"));
        hrDepartment.addPosition(new Position("Recruiter", "Recruits new employees"));
        hrDepartment.addPosition(new Position("Training Coordinator", "Coordinates employee training"));

        itDepartment.addPosition(new Position("Software Engineer", "Develops software applications"));
        itDepartment.addPosition(new Position("Systems Administrator", "Manages IT infrastructure"));
        itDepartment.addPosition(new Position("IT Support Specialist", "Provides technical support"));

        // Hire some employees
        hrDepartment.getPositions().get(0).hireEmployee(new Employee("001", "John", "Doe", "01/01/1990", "123-45-6789", 50000));
        hrDepartment.getPositions().get(1).hireEmployee(new Employee("002", "Jane", "Smith", "02/02/1991", "987-65-4321", 45000));
        itDepartment.getPositions().get(0).hireEmployee(new Employee("003", "Mike", "Johnson", "03/03/1992", "567-89-0123", 60000));

        // Print the company hierarchy
        company.print();

        // Testing equals method for Employee
        Employee emp1 = new Employee("001", "John", "Doe", "01/01/1990", "123-45-6789", 50000);
        Employee emp2 = new Employee("002", "Jane", "Smith", "02/02/1991", "987-65-4321", 45000);
        System.out.println("Equality Test for Employees:");
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // Should return false

        // Testing equals method for Position
        Position pos1 = new Position("HR Manager", "Manages HR operations");
        Position pos2 = new Position("Recruiter", "Recruits new employees");
        System.out.println("\nEquality Test for Positions:");
        System.out.println("pos1.equals(pos2): " + pos1.equals(pos2)); // Should return false

        // Testing equals method for Department
        Department dept1 = new Department("HR", "Location1");
        Department dept2 = new Department("IT", "Location2");
        System.out.println("\nEquality Test for Departments:");
        System.out.println("dept1.equals(dept2): " + dept1.equals(dept2)); // Should return false

        // Testing toString method for Employee, Position, and Department
        System.out.println("\nEmployee toString(): " + emp1);
        System.out.println("Position toString(): " + pos1);
        System.out.println("Department toString(): " + dept1);

        // Testing hashCode method for Employee
        System.out.println("\nHashCode Test for Employee:");
        System.out.println("Hashcode for emp1: " + emp1.hashCode());
        System.out.println("Hashcode for emp2: " + emp2.hashCode());

        // Testing hashCode method for Position
        System.out.println("\nHashCode Test for Position:");
        System.out.println("Hashcode for pos1: " + pos1.hashCode());
        System.out.println("Hashcode for pos2: " + pos2.hashCode());

        // Testing clone method for Employee
        Employee empClone = emp1.clone();
        System.out.println("\nCloned Employee:");
        System.out.println(empClone);

        // Testing clone method for Position
        Position posClone = pos1.clone();
        System.out.println("\nCloned Position:");
        System.out.println(posClone);

        // Testing interface methods
        System.out.println("\nInterface Methods:");
        IPerson.myStatic(); // Static method
        emp1.myDefault();   // Default method
    }
}









f
import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void print() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.print();
        }
    }
}
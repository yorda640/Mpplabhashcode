import java.util.ArrayList;
import java.util.Objects;

class Department {
    private String name;
    private String location;
    private ArrayList<Position> positions;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void print() {
        System.out.println("Department: " + name + " - Location: " + location);
        for (Position position : positions) {
            position.print();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department department = (Department) obj;
        return name.equals(department.name) && location.equals(department.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}


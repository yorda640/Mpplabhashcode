final class ImmutableClass {
private final String name;
private final int age;

public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
        }

public String getName() {
        return name;
        }

public int getAge() {
        return age;
        }

@Override
public String toString() {
        return "ImmutableClass{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
        }
        }


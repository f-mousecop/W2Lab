package org.charles;

public class SomethingSomething {
    private final String name;
    private final int age;

    public SomethingSomething(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Invalid age");
        }

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
        return "SomethingSomething [name=" + name + ", age=" + age + "]";
    }
}

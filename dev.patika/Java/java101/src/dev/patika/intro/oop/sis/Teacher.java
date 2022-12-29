package dev.patika.intro.oop.sis;

public class Teacher {

    String name;
    String branch;

    Teacher(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}

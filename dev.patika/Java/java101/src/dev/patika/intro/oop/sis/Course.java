package dev.patika.intro.oop.sis;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vivaVoce;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        //this.note = 0;
    }

    void assignTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println(teacher.toString() + " assigned to the course successfully!");
        } else
            System.out.println(teacher.toString() + " did not assign to the course, check the branch please!");
    }

    void printTeacher() {
        System.out.println(this.teacher.toString());
    }


    @Override
    public String toString() {
        return "Course{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", prefix='" + prefix + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

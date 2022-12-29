package StudentDataSystem;

public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        } else
            System.out.println("Your entry is: " + note1 + "! Note must be between 0 - 100 points.");
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        } else
            System.out.println("Your entry is: " + note2 + "! Note must be between 0 - 100 points.");
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        } else
            System.out.println("Your entry is: " + note3 + "! Note must be between 0 - 100 points.");
    }

    void addBulkVivaVoce(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.vivaVoce = note1;
        } else
            System.out.println("Your entry is: " + note1 + "! Note must be between 0 - 100 points.");
        if (note2 >= 0 && note2 <= 100) {
            this.course2.vivaVoce = note2;
        } else
            System.out.println("Your entry is: " + note2 + "! Note must be between 0 - 100 points.");
        if (note3 >= 0 && note3 <= 100) {
            this.course3.vivaVoce = note3;
        } else
            System.out.println("Your entry is: " + note3 + "! Note must be between 0 - 100 points.");
    }

    double calculateAverage() {
        this.average =
                (((this.course1.note * 0.8) + (this.course1.vivaVoce * 0.2)) +
                        ((this.course2.note * 0.8) + (this.course2.vivaVoce * 0.2)) +
                        ((this.course3.note * 0.8) + (this.course3.vivaVoce * 0.2))) / 3.0;
        return this.average;
    }

    boolean checkPass() {
        return calculateAverage() >= 55;
    }

    public void isPass() {
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Missind data, check your data and try again.");
        } else {
            this.isPass = checkPass();
            printNotes();
            System.out.println("Average: " + this.average);
            if (this.isPass) {
                System.out.println("Passed!");
            } else {
                System.out.println("Failed!");
            }
        }
    }

    void printNotes() {
        System.out.println(this.course1.name + ": " + course1.note);
        System.out.println(this.course2.name + ": " + course2.note);
        System.out.println(this.course3.name + ": " + course3.note);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course1=" + course1 +
                ", course2=" + course2 +
                ", course3=" + course3 +
                ", name='" + name + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", classes=" + classes +
                ", average=" + average +
                ", isPass=" + isPass +
                '}';
    }
}

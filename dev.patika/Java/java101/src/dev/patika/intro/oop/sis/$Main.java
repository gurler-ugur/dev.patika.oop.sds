package dev.patika.intro.oop.sis;

public class $Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ahmet Yilmaz", "MTH");
        Teacher teacher2 = new Teacher("Ayse Altin", "PHY");
        Teacher teacher3 = new Teacher("Ali Yildiz", "CHE");
        Teacher teacher4 = new Teacher("Faik Tutun", "MTH");


        Course courseA = new Course("Mathematics", "001", "MTH", teacher1);
        Course courseB = new Course("Physics", "002", "PHY", teacher2);
        Course courseC = new Course("Chemistry", "003", "CHE", teacher3);

        courseA.assignTeacher(teacher1);
        courseB.assignTeacher(teacher2);
        courseC.assignTeacher(teacher3);

        Student student1 = new Student("Cemre Ilk", "20001", courseA, courseB, courseC);
        student1.addBulkExamNote(70, 80, 90);
        student1.addBulkVivaVoce(50, 50, 50);
        student1.isPass();

        Student student2 = new Student("Emre Uzun", "20002", courseA, courseB, courseC);
        student2.addBulkExamNote(35, 40, 60);
        student2.isPass();

        Student student3 = new Student("Ilkay Buyuk", "20003", courseA, courseB, courseC);
        student3.addBulkExamNote(90, 60, 45);
        student3.isPass();




    }
}

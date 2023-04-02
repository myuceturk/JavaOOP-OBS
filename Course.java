package OOP;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int pg; // gradeperformance grade
    Teacher teacherCourse;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.pg = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacherCourse = teacher;
            System.out.println("İşlem Başarılı.");
        } else {
            System.out.println(teacher.name + " Bu Dersi Veremez.");
        }
    }
}

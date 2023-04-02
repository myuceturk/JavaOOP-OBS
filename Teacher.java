package OOP;

public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String phone, String branch) {
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    void printTeacherInfo() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.phone);
        System.out.println("Branşı: " + this.branch);
    }
}

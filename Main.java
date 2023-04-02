package OOP;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali Yıldırım", "555", "KMY");
        Teacher t2 = new Teacher("Veli Koçak", "666", "FZK");
        Teacher t3 = new Teacher("Ayşe Özgür", "777", "MAT");

        Course matematik = new Course("Matematik", "0001", "MAT");
        matematik.addTeacher(t3);
        Course fizik = new Course("Fizik", "0002", "FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "0003", "KMY");
        kimya.addTeacher(t1);

        Student ogr1 = new Student("Mecit Yücetürk", "225", 8, matematik, kimya, fizik);
        ogr1.addBulkExamNote(70, 67, 77);
        ogr1.addBulkPgNote(100, 80, 70);
        ogr1.isPass();

        Student ogr2 = new Student("Mehmet Temur", "885", 5, matematik, kimya, fizik);
        ogr2.addBulkExamNote(35, 50, 44);
        ogr2.addBulkPgNote(70, 40, 50);
        ogr2.isPass();
        
    }
}

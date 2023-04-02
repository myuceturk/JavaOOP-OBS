package OOP;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course kimya;
    Course fizik;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course kimya, Course fizik) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.kimya = kimya;
        this.fizik = fizik;
        calcAvarage();
        this.isPass = false;
    }

    void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizik.pg * 0.2)) + ((this.kimya.note * 0.8) + (this.kimya.pg * 0.2)) + ((this.mat.note * 0.8) + (this.mat.pg * 0.2))) / 3;
    }

    void addBulkExamNote(int mat, int kimya, int fizik) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
    }

    void addBulkPgNote(int pg_mat, int pg_kimya, int pg_fizik) {
        if (pg_mat >= 0 && pg_mat <= 100) {
            this.mat.pg = pg_mat;
        }
        if (pg_kimya >= 0 && pg_kimya <= 100) {
            this.kimya.pg = pg_kimya;
        }
        if (pg_fizik >= 0 && pg_fizik <= 100) {
            this.fizik.pg = pg_fizik;
        }
    }

    void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar Girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            if (isCheckPass()) {
                System.out.println("Sınıfı Geçti");
            } else {
                System.out.println("Sınıfta Kaldı");
            }
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Ortalama : " + this.avarage);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

}

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);

        Staff s1 = new Staff("Aidos","Medey", "IQHSB",1.5);
        System.out.println(s1);

        Student st = new Student("Bolat","Jetis","IS", 12,2.5);
        System.out.println(st);
    }
}

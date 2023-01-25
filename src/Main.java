import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Maciej Chmielewski";
        student1.studentNumber = 26813;
        System.out.println("Student 1 imię: " + student1.name);
        System.out.println("Student 1 numer: " + student1.studentNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("imię i nazwisko studenta:");
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        System.out.println("numer studenta:");
        int studentNumber = scanner.nextInt();
        System.out.println("Chcesz ukryć imię i nazwisko?? (y/n)");
        if (scanner.next().equals("y")) {

            SecretStudent secretStudent = new SecretStudent(name, surname, studentNumber);
            System.out.println("Imię Studenta: " + secretStudent.getName());
            System.out.println("Nazwisko Studenta: " + secretStudent.getSurname());
            System.out.println("Numer Studenta: " + secretStudent.getStudentNumber());
            System.out.println("Podaj nowe imię i nazwisko sekretnego studenta:");
            secretStudent.setName(scanner.nextLine());
            System.out.println("Nowe imię: " + secretStudent.getName());
            System.out.println("Nowe nazwisko: " + secretStudent.getSurname());
            System.out.println("Nowy numer: " + secretStudent.getStudentNumber());

        } else {
            System.out.println("Student name: " + name);
            System.out.println("Student number: " + studentNumber);
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        student student = new student();
        System.out.println("podaj imie:");
        student.imie = scanner.next();
        System.out.println("podaj nazwisko:");
        student.nazwisko = scanner.next();
        System.out.println("podaj grupe:");
        student.grupa = scanner.nextInt();
        System.out.println("podaj kierunek:");
        student.kierunek = scanner.next();
        System.out.println("imie: " + student.imie);
        System.out.println("nazwisko: "  + student.nazwisko);
        System.out.println("grupa: " + student.grupa);
        System.out.println("kierunek: " + student.kierunek);
    }
}
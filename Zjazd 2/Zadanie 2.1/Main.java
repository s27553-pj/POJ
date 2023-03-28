public class Main {
    public static void main(String[] args) {
        student student = new student();
        student.imie = "Katarzyna";
        student.nazwisko = "Kasperek";
        student.grupa = 25;
        student.kierunek = "Informatyka";

        System.out.println("imie: " + student.imie);
        System.out.println("nazwisko: " + student.nazwisko);
        System.out.println("grupa: " + student.grupa);
        System.out.println("kierunek: " + student.kierunek);
    }
}
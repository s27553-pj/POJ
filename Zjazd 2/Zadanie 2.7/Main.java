import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int promien, wysokosc;
        double pojemnosc;
        double pi=Math.PI;
        Scanner scanner =   new Scanner(System.in);
        System.out.println("Podaj promien walca");
        promien=scanner.nextInt();
        System.out.println("Podaj wysokosc walca");
        wysokosc=scanner.nextInt();
        pojemnosc=pi*promien*promien*wysokosc;
        pojemnosc*=100;
        pojemnosc=Math.round(pojemnosc);
        pojemnosc/=100;
        System.out.println("Pojemnosc walca wynosi: "+pojemnosc);
    }
}
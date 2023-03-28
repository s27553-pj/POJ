import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        porownanie porownanie = new porownanie();
        System.out.println("Podaj pierwszy wyraz");
        porownanie.str1= scanner.next();
        System.out.println("Podaj drugi wyraz");
        porownanie.str2 = scanner.next();
        if(porownanie.str1.equals(porownanie.str2))
        {
            System.out.println("wyrazy sa identczne");
        }
        else
        {
            System.out.println("wyrazy sa inne");
        }
    }
}
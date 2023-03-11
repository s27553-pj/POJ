import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        zadanie_01();
        zadanie_02();
        zadanie_03();
        zadanie_04();
        zadanie_05();
        zadanie_06();
        zadanie_07();
        zadanie_08();
        zadanie_09();
        zadanie_10();
        zadanie_13();
        zadanie_14();

    }


    public static void zadanie_01() {
        int a, b, pole;
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz dlugosc boku a");
        a = scanner.nextInt();
        System.out.println("wprowadz dlugosc boku b");
        b = scanner.nextInt();
        pole = a * b;
        System.out.println("pole prostokata o bokach a i b wynosi:" + pole);
    }

    public static void zadanie_02() {
        double pi = Math.PI;
        double wynik;
        pi = Math.sqrt(pi);
        pi *= 100;
        wynik = Math.round(pi);
        wynik /= 100;
        System.out.println("zaokraglenie do dwoch miejsc po przecinku:" + wynik);
    }

    public static void zadanie_03() {
        String tekst, napis1, napis2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        tekst = scanner.nextLine(); //wczytuje cala linie tekstu
        String[] czesc = tekst.split(" ");
        napis1 = czesc[0];
        napis2 = czesc[1];
        System.out.println("%" + napis2 + " " + napis1 + "%");


    }

    public static void zadanie_04() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz dlugosc boku a");
        a = scanner.nextInt();
        System.out.println("wprowadz dlugosc boku b");
        b = scanner.nextInt();
        System.out.println("wprowadz dlugosc boku c");
        c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("TAK");
        } else {
            System.out.println("BLAD");
        }
    }

    public static void zadanie_05() {
        int month;
        System.out.println("Podaj liczbe aby sprawdzic jaki to miesac i ile ma dni");
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Styczen: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpien: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien: 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzien: 31 dni");
                break;
            default:
                System.out.println("BLAD");
        }
    }

    public static void zamien(int[] tab, int i, int j) {
        int pom = tab[i];
        tab[i] = tab[j];
        tab[j] = pom;
    }

    public static void zadanie_06() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        a = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        b = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe");
        c = scanner.nextInt();
        int[] tab = {a, b, c};
        int[] tab2 = {a, b, c};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    zamien(tab, j, j + 1);
                }
            }
        }
        System.out.println("sortowanie rosnace");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (tab[j] < tab[j + 1]) {
                    zamien(tab, j, j + 1);
                }
            }
        }
        System.out.println("sortowanie malejace");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void zadanie_07() {
        int n, m;
        int skalarny = 0;
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Podaj pierwsza liczbe");
        n = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        m = scanner.nextInt();
        if (n == m) {
            int[] tab = new int[n];
            int[] tab2 = new int[m];
            for (int i = 0; i < n; i++) {
                tab[i] = (generator.nextInt(10));
            }
            for (int j = 0; j < m; j++) {
                tab2[j] = (generator.nextInt(10));
            }
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
            }
            for (int j = 0; j < tab2.length; j++) {
                System.out.println(tab2[j]);
            }
            for (int i = 0; i < n; i++) {
                skalarny = skalarny + (tab[i] * tab2[i]);
            }
            System.out.println("iloczyn skalarny wynosi: " + skalarny);
        } else {
            System.out.println("BLAD");
        }
    }

    public static void zadanie_08() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Podaj liczbe");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.print("BLAD");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            for (int i = n; i > 0; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print("*");

                }
                System.out.println();
            }
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    public static void zadanie_09() {
        Scanner scanner = new Scanner(System.in);
        char[] tab = new char[100];
        int i = 0;
        System.out.println("Wprowadź znaki:");
        while (scanner.hasNext()) {
            char c = scanner.next().charAt(0);
            if (c == '\n' || c == '\r') {
                continue;
            }
            if (c == '\u0004') //znak konca pliku
            {
                break;
            }
            tab[i] = c;
            i++;
            if (i >= 100) {
                break;
            }
        }
        boolean czypalindrom=true;
        for(int j=0;j <i/2;j++)
        {
            if(tab[j]!=tab[i-j-1])
            {
                czypalindrom=false;
                break;
            }
        }
        if(czypalindrom)
        {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static void zadanie_10()
    {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("podaj liczbe wierszy:");
        a= scanner.nextInt();
        System.out.println("podaj liczbe kolumn:");
        b=scanner.nextInt();
        if(a<=0 || b<=0)
        {
            System.out.println("BLAD");
            return;
        }
        int[][] macierz = new int[a][b];
        System.out.println("podaj liczby do macierzy:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                macierz[i][j]=scanner.nextInt();
            }
        }
        int[][] przetransponowana =new int[a][b];
        for(int j=0;j<b;j++)
        {
            for(int i=0;i<a;i++)
            {
                przetransponowana[j][i]=macierz[i][j];
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.println(przetransponowana[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int najwiekszy_element(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        } else {
            int max = najwiekszy_element(tab, n - 1);
            return tab[n - 1] > max ? tab[n - 1] : max;
        }
    }
    public static void zadanie_13()
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        int najwiekszy;
        System.out.println("podaj liczbe elementow:");
        n= scanner.nextInt();
        int[] tab = new int[n];
        System.out.println("podaj elementy tablicy:");
        for(int i=0;i<n;i++)
        {
            tab[i]= scanner.nextInt();
        }
        najwiekszy = najwiekszy_element(tab,n);
        System.out.println("najwiekszy element to: " + najwiekszy);

    }
    public static void zadanie_14()
    {
        System.out.println(" pobieram JDK, w terminalu przechodze do folderu w ktorym znajduje sie moj plik; nastepnie kompiluje program poleceniem javac main.java, nastepnie uruchamiam za pomoca polecenia java main");
    }
}




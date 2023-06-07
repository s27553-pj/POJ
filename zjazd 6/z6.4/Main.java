import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> miesiace = new HashMap();
        miesiace.put(1,"Styczen");
        miesiace.put(2,"Luty");
        miesiace.put(3,"Marzec");
        miesiace.put(4,"Kwiecien");
        miesiace.put(5,"Maj");
        miesiace.put(6,"Czeriwec");
        miesiace.put(7,"Lipiec");
        miesiace.put(8,"Sierpien");
        miesiace.put(9,"Wrzesien");
        miesiace.put(10,"Pazdziernik");
        miesiace.put(11,"Listopad");
        miesiace.put(12,"Grudzien");
        System.out.println("Podaj liczbe miesiaca");
        int zgadywana = scan.nextInt();
        System.out.println("wybrales:" + zgadywana);
        if(zgadywana >=1 && zgadywana <=12)
        {
            String nazwamiesiaca = miesiace.get(zgadywana);
            System.out.println("to jest: " + nazwamiesiaca);
        }else{
            System.out.println("podano nieprawidlowy numer miesiaca");
        }

    }
}
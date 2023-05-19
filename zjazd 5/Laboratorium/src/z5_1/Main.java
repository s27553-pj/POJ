package z5_1;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        Instant start = Instant.now();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        Instant end = Instant.now();
        Duration czas = Duration.between(start,end);
        long dlugosc = czas.toMillis();
        for (int i=0;i<lista.size();i++) {
            System.out.println("indeks: " +i+ "wartosc: "+ lista.get(i));
        }
        System.out.println("czas wykonania wynosi: "+ dlugosc + "milisekund" );

    }

}

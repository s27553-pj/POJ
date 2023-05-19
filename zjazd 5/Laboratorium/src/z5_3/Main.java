package z5_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> kawy = new ArrayList<String>();
        kawy.add("espresso");
        kawy.add("latte");
        kawy.add("cappuccino");
        kawy.add("mocha");
        kawy.add("auLait");
        kawy.add("machiatto");
        System.out.println("zwyczajnie");
        System.out.println(kawy);
        System.out.println("za pomocą iteratora");
        Iterator<String> k = kawy.iterator();
        while (k.hasNext()) {
            System.out.println(k.next());
        }
        System.out.println("Za pomocą foreach");
        for(String x: kawy)
        {
            System.out.println(x.toUpperCase(Locale.ROOT));
        }
        System.out.println("za pomocą for");
        for(int i=0;i<kawy.size();i++)
        {
            String lista = kawy.get(i);
            String litery = lista.substring(0,4);
            System.out.println(litery);
        }
    }
}

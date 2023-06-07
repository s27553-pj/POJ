import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //a
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Orange");
        tree1.add("Pink");
        tree1.add("Black");
        tree1.add("White");
        //b
        System.out.println("elementy drzewa nr 1");
        for (String element : tree1) {
            System.out.println(element);
        }
        //c
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Red");
        tree2.add("Green");
        tree2.add("Blue");
        System.out.println("elementy drzewa nr 2");
        for (String element : tree2) {
            System.out.println(element);
        }
        tree1.addAll(tree2);
        System.out.println("elementy drzewa nr 1");
        for (String element : tree1) {
            System.out.println(element);
        }
        //d
        Iterator<String> odwrotny = tree1.descendingIterator();
        System.out.println("elementy drzewa nr 1 w odwrotnej kolejnosci");
        while (odwrotny.hasNext()) {
            System.out.println(odwrotny.next());
        }
        //e
        System.out.println("pierwszy element " + tree1.first());
        System.out.println("ostatni element " + tree1.last());
        //f
        TreeSet<String> tree3 = (TreeSet<String>) tree1.clone();
        System.out.println("zawartosc sklonowanego drzewa");
        for (String element : tree3) {
            System.out.println(element);
        }
        //g
        System.out.println("liczba elementow tree1:" + tree1.size());
        //h
        for (String kolor : tree1) {
            System.out.println("Czy element " + kolor + " w drzewie tree1 jest taki sam jak w tree2?");
            System.out.println(tree2.contains(kolor) ? "Tak" : "Nie");

        }
    }
}
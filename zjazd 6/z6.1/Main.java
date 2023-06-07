import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList lista = new LinkedList();
        lista.add("Red");
        lista.add("Green");
        lista.add("Black");
        lista.add("Pink");
        lista.add("Orange");
        System.out.println("pierwotna wersja: ");
        System.out.println(lista + " ");
        System.out.println("usuniety element: "+lista.removeFirst());
        System.out.println("usuniety element:"+lista.removeLast());
        System.out.println(lista + " ");
    }
}
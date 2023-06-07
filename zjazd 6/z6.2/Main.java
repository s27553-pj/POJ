import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> secik =new HashSet<>();
        secik.add("Red");
        secik.add("Orange");
        secik.add("Blue");
        secik.add("Pink");
        System.out.println("zawartość hashset:");
        for(String element : secik){
            System.out.println(element);
        }
        System.out.println("zawartość tablicy:");
        String[] tablica = secik.toArray(new String[0]);
        for(String element : tablica){
            System.out.println(element);
        }
    }
}
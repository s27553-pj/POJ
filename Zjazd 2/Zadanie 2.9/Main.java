import java.io.IOException;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Witaj w grze!");
        System.out.println("Pomyslalem litere z przedzialu od A do Z");
        Random l = new Random();
        char wylosowana = (char)(l.nextInt(26)+97);
      //  System.out.println("wylosowana litera to:" + wylosowana);
        System.out.println("zgadnij co pomyslalem!");
        int klawisz = System.in.read();
        if (klawisz >= 'a' && klawisz <= 'z') {

            if (klawisz == wylosowana) {
                System.out.println("Dobrze!");
            } else if (klawisz > wylosowana) {
                System.out.println("Zle!");
                System.out.println("Trafiles zbyt wysoko!");
            } else if (klawisz < wylosowana) {
                System.out.println("Zle!");
                System.out.println("Trafiles zbyt nisko");
            }
        } else {
            System.out.println("Zle, wisnij klawisz z zakresu od a do z");
        }

    }
}
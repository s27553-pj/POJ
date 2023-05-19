package z5_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Ksiazka{
    String tytul;
    String autor;
    int liczbaStron;
   public Ksiazka(String tytul, String autor, int liczbaStron)
    {
        this.tytul=tytul;
        this.autor=autor;
        this.liczbaStron=liczbaStron;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
class Ebook extends Ksiazka{
    int rozmiar;
    String format;
    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
}
class Ksiazkapapierowa extends Ksiazka{
    int rokWydania;
    public Ksiazkapapierowa(String tytul, String autor, int liczbaStron, int rokWydania)
    {
        super(tytul,autor,liczbaStron);
        this.rokWydania=rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Ksiazka> ksiazki =new ArrayList<>();
        ksiazki.add((new Ksiazka("Lalka","Boleslaw Prus", 500)));
        ksiazki.add(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz",400));
        ksiazki.add(new Ebook("Dziady cz. III","Adam Mickiewicz",400,300,"pdf"));
        ksiazki.add(new Ksiazkapapierowa("Wesele","Stanislaw Wyspianski", 300,1901));
        Collections.sort(ksiazki, Comparator.comparing(Ksiazka::getTytul));
        for(Ksiazka ksiazka : ksiazki)
        {
            System.out.println(ksiazka.getTytul());
        }
    }

}

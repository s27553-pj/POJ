import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

interface IZamowienie {
    String getNazwa();
    String getRozmiar();
    String getIlosc();
}
class Zamowienie implements IZamowienie{
    private String nazwa;
    private String rozmiar;
    private String ilosc;

    public Zamowienie(String nazwa, String rozmiar, String ilosc) {
        this.nazwa = nazwa;
        this.rozmiar = rozmiar;
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public String getIlosc() {
        return ilosc;
    }
}
interface IPizza {
    String getNazwa();
    double getCenad();
    double getCenam();
    double getCenas();
}
class Pizza implements IPizza {
    private String nazwa;
    private String skladniki;
    private int ostrosc;
    private double cenam;
    private double cenas;
    private double cenad;
    public Pizza(String nazwa, String skladniki,int ostrosc,double cenam, double cenas,double cenad)
    {
        this.nazwa=nazwa;
        this.skladniki=skladniki;
        this.ostrosc=ostrosc;
        this.cenam=cenam;
        this.cenas=cenas;
        this.cenad=cenad;

    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCenad() {
        return cenad;
    }

    public double getCenam() {
        return cenam;
    }

    public double getCenas() {
        return cenas;
    }
}

class Formularz extends JFrame implements ActionListener {
    //inicjalizacja zmiennych
    private Container c;
    private JLabel poczatek;
    private JComboBox pizza;
    private ArrayList<Zamowienie> listazamowienien = new ArrayList<>();
    private ArrayList<Pizza> zamowieniep = new ArrayList<>();
    private JLabel rozmiar;
    private JRadioButton mala;
    private JRadioButton srednia;
    private JRadioButton duza;
    private ButtonGroup wielkoscpizzy;
    private JLabel wybierzilosc;
    private JComboBox ilosc;
    private JLabel dostawa;
    private JRadioButton dom;
    private JRadioButton lokal;
    private ButtonGroup dost;
    private JLabel ul;
    private JTextField adres;
    private JButton sub;
    private JLabel wyswietl;
    private JLabel komunikat;
    private JLabel odbiorwlasny;
    private double sumacen;
    private JButton dodajkolejna;
    private double cenadostawy = 9;
    private String rodzaje[]
            = {
            "Wybierz rodzaj", "Wegetariańska", "Capriciosa", "Pepperoni"
    };
    private String iloscp[]
            = {
            "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10"
    };

    public Formularz() {
        budowaRamki();
    }

    private void budowaRamki() {
        //tworzenie przyciskow i pol w formularzu
        setTitle("Pizzeria");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);

        poczatek = new JLabel("Wybierz swoją pizzę");
        poczatek.setFont(new Font("Arial", Font.PLAIN, 30));
        poczatek.setSize(300, 30);
        poczatek.setLocation(300, 30);
        c.add(poczatek);

        pizza = new JComboBox(rodzaje);
        pizza.setFont(new Font("Arial", Font.PLAIN, 20));
        pizza.setLocation(200, 70);
        pizza.setSize(200, 50);
        c.add(pizza);
        pizza.addActionListener(this);

        rozmiar = new JLabel("Wybierz wielkosc pizzy:");
        rozmiar.setFont(new Font("Arial", Font.PLAIN, 20));
        rozmiar.setLocation(200, 120);
        rozmiar.setSize(300, 30);
        c.add(rozmiar);

        mala = new JRadioButton("mała");
        mala.setFont(new Font("Arial", Font.PLAIN, 20));
        mala.setLocation(200, 160);
        mala.setSize(80, 20);
        c.add(mala);
        mala.addActionListener(this);

        srednia = new JRadioButton("średnia");
        srednia.setFont(new Font("Arial", Font.PLAIN, 20));
        srednia.setLocation(290, 160);
        srednia.setSize(100, 20);
        c.add(srednia);
        srednia.addActionListener(this);

        duza = new JRadioButton("duża");
        duza.setFont(new Font("Arial", Font.PLAIN, 20));
        duza.setLocation(400, 160);
        duza.setSize(80, 20);
        c.add(duza);
        duza.addActionListener(this);


        wielkoscpizzy = new ButtonGroup();
        wielkoscpizzy.add(mala);
        wielkoscpizzy.add(srednia);
        wielkoscpizzy.add(duza);

        wybierzilosc = new JLabel("Wybierz ilość:");
        wybierzilosc.setFont(new Font("Arial", Font.PLAIN, 20));
        wybierzilosc.setLocation(200, 190);
        wybierzilosc.setSize(300, 30);
        c.add(wybierzilosc);

        ilosc = new JComboBox(iloscp);
        ilosc.setFont(new Font("Arial", Font.PLAIN, 20));
        ilosc.setLocation(350, 180);
        ilosc.setSize(70, 50);
        c.add(ilosc);

        dostawa = new JLabel("Wybierz sposób dostawy:");
        dostawa.setFont(new Font("Arial", Font.PLAIN, 20));
        dostawa.setLocation(200, 230);
        dostawa.setSize(300, 30);
        c.add(dostawa);
        dostawa.setVisible(false);

        dom = new JRadioButton("adres");
        dom.setFont(new Font("Arial", Font.PLAIN, 20));
        dom.setSize(100, 30);
        dom.setLocation(430, 230);
        c.add(dom);
        dom.addActionListener(this);
        dom.setVisible(false);

        lokal = new JRadioButton("lokal");
        lokal.setFont(new Font("Arial", Font.PLAIN, 20));
        lokal.setSize(100, 30);
        lokal.setLocation(520, 230);
        c.add(lokal);
        lokal.addActionListener(this);
        lokal.setVisible(false);

        dost = new ButtonGroup();
        dost.add(dom);
        dost.add(lokal);

        setVisible(true);

        odbiorwlasny = new JLabel();
        odbiorwlasny.setFont(new Font("Arial", Font.PLAIN, 20));
        odbiorwlasny.setSize(600, 100);
        odbiorwlasny.setLocation(200, 430);
        c.add(odbiorwlasny);
        odbiorwlasny.setVisible(false);

        ul = new JLabel("Podaj adres dostawy:");
        ul.setFont(new Font("Arial", Font.PLAIN, 20));
        ul.setSize(300, 30);
        ul.setLocation(200, 270);
        c.add(ul);
        ul.setVisible(false);

        adres = new JTextField();
        adres.setFont(new Font("Arial", Font.PLAIN, 20));
        adres.setSize(300, 70);
        adres.setLocation(200, 300);
        c.add(adres);
        adres.setVisible(false);
        adres.addActionListener(this);

        sub = new JButton("Zamów");
        sub.setFont(new Font("Arial", Font.PLAIN, 20));
        sub.setSize(100, 20);
        sub.setLocation(200, 400);
        c.add(sub);
        sub.setVisible(false);
        sub.addActionListener(this);

        wyswietl = new JLabel();
        wyswietl.setFont(new Font("Arial", Font.PLAIN, 20));
        wyswietl.setSize(600, 100);
        wyswietl.setLocation(200, 430);
        c.add(wyswietl);
        wyswietl.setVisible(false);

        komunikat = new JLabel();
        komunikat.setFont(new Font("Arial", Font.PLAIN, 20));
        komunikat.setSize(300, 30);
        komunikat.setLocation(480, 155);
        c.add(komunikat);
        komunikat.setVisible(false);

        dodajkolejna = new JButton("Dodaj do koszyka");
        dodajkolejna.setFont(new Font("Arial", Font.PLAIN, 20));
        dodajkolejna.setSize(200, 30);
        dodajkolejna.setLocation(430, 190);
        c.add(dodajkolejna);
        dodajkolejna.setVisible(false);
        dodajkolejna.addActionListener(this);
    }

    private void zlozZamowienie() {
        {
        //przypisywanie danych z formularza do zmiennych
            String jaka = (String) pizza.getSelectedItem();
            String rozmiarWybrany = mala.isSelected() ? "mała" : srednia.isSelected() ? "średnia" : "duża";
            String i = (String) ilosc.getSelectedItem();
            String metodaDostawy = "";
            String a =adres.getText();
            //warunki do utworzenia zamowienia
            if (!jaka.equals("Wybierz rodzaj")) {
                Zamowienie zamowienie = new Zamowienie(jaka, rozmiarWybrany, i);
                listazamowienien.add(zamowienie);
            }
            if (dom.isSelected()) {
                if (adres.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(komunikat, "Podaj adres!");
                    wyswietl.setVisible(false);
                } else {
                    metodaDostawy = "z dostawą";
                    sumacen += cenadostawy;
                }
            } else if (lokal.isSelected()) {
                metodaDostawy = "odbiór własny";
                cenadostawy = 0.0;
            }

            if (!metodaDostawy.isEmpty()) {
                // Tworzenie reprezentacji tekstowej zamówienia
                StringBuilder sb = new StringBuilder();
                sb.append("<html>Twoje zamówienia to:<br>");

                for (Zamowienie zamowieniep : listazamowienien) {
                    sb.append(zamowieniep.getNazwa()).append(", rozmiar: ")
                            .append(zamowieniep.getRozmiar()).append(", ilość: ")
                            .append(zamowieniep.getIlosc()).append("<br>");
                }

                sb.append("Do zapłaty: ").append(sumacen).append(" zł ");
                if(dom.isSelected()){
                    sb.append("na adres: ");
                }
                sb.append(a).append("</html>");
                JOptionPane.showMessageDialog(komunikat, sb.toString());

            }
        }
    }

    private void czyscPola() {
        //reset pol formularza aby mozna bylo dodac kolejna pizze
        pizza.setSelectedIndex(0);
        wielkoscpizzy.clearSelection();
        ilosc.setSelectedIndex(0);
    }

    private void dodajPizza(String nazwa, String sklad, int indeks, double cenaM, double cenaS, double cenaD, String jaka, int i, String rozmiarWybrany) {
        // tworzenie obiektu typu Pizza
        Pizza pizza = new Pizza(nazwa, sklad, indeks, cenaM, cenaS, cenaD);
        //dodanie pizzy do listy zamowien
        listazamowienien.add(new Zamowienie(pizza.getNazwa(), rozmiarWybrany, Integer.toString(i)));
        // obliczenie ceny do zapłaty
        if (mala.isSelected()) {
            sumacen += Double.parseDouble((String) ilosc.getSelectedItem()) * pizza.getCenam();
        } else if (srednia.isSelected()) {
            sumacen += Double.parseDouble((String) ilosc.getSelectedItem()) * pizza.getCenas();
        } else if (duza.isSelected()) {
            sumacen += Double.parseDouble((String) ilosc.getSelectedItem()) * pizza.getCenad();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(!listazamowienien.isEmpty())
        {
            dostawa.setVisible(true);
            dom.setVisible(true);
            lokal.setVisible(true);
        }
        if (e.getSource() == dom) {
            ul.setVisible(true);
            adres.setVisible(true);
            sub.setVisible(true);
        }
        else if(e.getSource()==lokal) {
            odbiorwlasny.setVisible(true);
            sub.setVisible(true);
            sub.setLocation(200,280);
        }
        String jaka = (String) pizza.getSelectedItem();
        String rozmiarWybrany = mala.isSelected() ? "mała" : srednia.isSelected() ? "średnia" : "duża";
        String i = (String) ilosc.getSelectedItem();
        if(!jaka.equals("Wybierz rodzaj")&&(mala.isSelected() || srednia.isSelected() || duza.isSelected()))
        {
            dodajkolejna.setVisible(true);
        }
        else {
            dodajkolejna.setVisible(false);
        }
        if(e.getSource()==dodajkolejna)
        {
            if (jaka.equals("Wegetariańska")) {
                //tworzenie dostpenych rodzajow pizz
                dodajPizza("Wegetariańska", "szpinak,pomidor,sos,ser", 0, 25.0, 30.0, 35.0, jaka, Integer.parseInt(i), rozmiarWybrany);
            } else if (jaka.equals("Capriciosa")) {
                dodajPizza("Capriciosa", "pieczarki,szynka,sos,ser", 1, 28.0, 33.0, 38.0, jaka, Integer.parseInt(i), rozmiarWybrany);
            } else if (jaka.equals("Pepperoni")) {
                dodajPizza("Pepperoni", "salami,papryka,sos,ser", 2, 30.0, 35.0, 40.0, jaka,Integer.parseInt(i) , rozmiarWybrany);
            }
            czyscPola();
            //wyswietlenie alertu
            JOptionPane.showMessageDialog(null,"Dodano do zamówienia!");
        }
        if (e.getSource() == sub) {
            zlozZamowienie();
        }

        }
}
public class Main {
    public static void main(String[] args) throws Exception{
        Formularz f = new Formularz();
        System.out.println();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("operatory inkrementacji i dekrementacji");
        System.out.println("podaj x");
        Scanner scanner = new Scanner(System.in);
        inkrementacja_dekrementacja inde = new inkrementacja_dekrementacja();
        inde.x = scanner.nextInt();
        System.out.println("podaj y");
        inde.y = scanner.nextInt();
        System.out.println("x = " + inde.x);
        System.out.println("y = " + inde.y);
        System.out.println("++x = " + (++inde.x));
        System.out.println("y++ = " + (inde.y++));
        System.out.println("x = " + inde.x);
        System.out.println("y = " + inde.y);
        System.out.println("operatory arytmetyczne");
        arytmetyczne art = new arytmetyczne();
        System.out.println("Podaj w");
        art.w = scanner.nextFloat();
        System.out.println("Podaj z");
        art.z=scanner.nextFloat();
        System.out.println("w = " +art.w);
        System.out.println("z = " +art.z);
        System.out.println("w + z = " +(art.w + art.z));
        System.out.println("w - z= " +(art.w - art.z));
        System.out.println("w * z = " +(art.w * art.z));
        System.out.println("w / z = " +(art.w / art.z));
        System.out.println("w % z = " +(art.w % art.z));
        System.out.println("operatory relacyjne");
        relacyjne rel = new relacyjne();
        System.out.println("podaj m");
        rel.m = scanner.nextInt();
        System.out.println("podaj n");
        rel.n = scanner.nextInt();
        System.out.println("podaj o");
        rel.o = scanner.nextInt();
        if(rel.m < rel.n )
        {
            System.out.println("m jest mniejsze niz n ");
        }
        else
        {
            System.out.println("n jest mniejsze niz m ");
        }

        if(rel.m < rel.o )
        {
           System.out.println( "m jest mniejsze niz o");
        }
        else
        {
            System.out.println("m jest wieksze niz o");
        }

        if(rel.n <= rel.o )
        {
            System.out.println("n jest mniejsze badz rowne  o");
        }
        else
        {
            System.out.println("n jest wieksze badz rowne o");
        }

        if(rel.m >= rel.n )
        {
            System.out.println("m  jest wieksze badz rowne n");
        }
        else
        {
            System.out.println("m jest mniejsze badz rowne n ");
        }

        if(rel.n == rel.o )
        {
            System.out.println("n jest rowne o");
        }
        else
        {
            System.out.println("n nie jest rowne o");
        }

        if(rel.m != rel.o )
        {
            System.out.println("m nie jest rowne o");
        }
        else
        {
            System.out.println("m jest rowne o");
        }
    }
}
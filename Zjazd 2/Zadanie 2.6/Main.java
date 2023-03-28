import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] tablica = new int[3][3];
        Random l = new Random();
        for(int i=0;i<tablica.length; i++)
        {
            for(int j=0;j<tablica[i].length;j++)
            {
                tablica[i][j] =l.nextInt(10)+1;
                System.out.print(tablica[i][j]+ ",");
            }
            System.out.println();
        }
        System.out.println("po zamianie");
        int[][] odwrocona = new int[3][3];
        for(int i=0;i<tablica.length;i++)
        {
            for(int j=0;j<tablica.length;j++)
            {
                odwrocona[i][j]=tablica[j][i];
                System.out.print(odwrocona[i][j]+ ",");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
    boolean p=true;
    boolean q=true;
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n","P","Q","AND","OR","XOR","NOT");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",p,q,(p&&q),(p||q),(p^q),!p);
    q=false;
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",p,q,(p&&q),(p||q),(p^q),!p);
    p=false;
    q=true;
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",p,q,(p&&q),(p||q),(p^q),!p);
    q=false;
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",p,q,(p&&q),(p||q),(p^q),!p);

    }
}
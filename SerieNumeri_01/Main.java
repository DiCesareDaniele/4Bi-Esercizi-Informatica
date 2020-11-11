import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inseriti = 1;
        System.out.println("Inserisci numero");
        int a = s.nextInt();
        System.out.println("Inserisci numero");
        int b = s.nextInt();
        while(a < b) {
            a = b;
            System.out.println("Inserisci numero");
            b = s.nextInt();
            inseriti++;
        }
        System.out.println("Inseriti = " + inseriti);
    }

}
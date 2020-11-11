import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci soldiiii");
        double soldi = s.nextDouble();
        int giorni = 0;
        int pastina = 0;
        int panino = 0;

        while(true) {
            System.out.println("Soldi = " + soldi);
            System.out.println("Vuoi panino(1) 1.5euro o pastina(0) 1euro (qualsiasi numero per saltare)");
            int scelta = s.nextInt();
            if(scelta == 1) {
                if(soldi >= 1.5) {
                    panino++;
                    soldi -= 1.5;
                } else {
                    break;
                }
            } else if(scelta == 0) {
                if(soldi >= 1) {
                    pastina++;
                    soldi -= 1;
                } else {
                    break;
                }
            }
        }
        giorni = pastina + panino;
        System.out.println("Pastina");
        System.out.println(pastina);
        System.out.println("Panino");
        System.out.println(panino);
        System.out.println("Giorni");
        System.out.println(giorni);
    }

}
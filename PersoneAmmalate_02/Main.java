public class Main {

    public static void main(String[] args) {
        int ammalati = 10_000;
        int perc = 10;
        int giorni = 1 ;
        while(ammalati > 100) {
            ammalati -= (int)(ammalati * perc / 100.0);
            giorni++;
        }
        System.out.println("Giorni necessari = " + giorni);
    }

}
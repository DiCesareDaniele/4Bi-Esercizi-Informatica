public class Main {

    public static void main(String[] args) {
        double tasso = 1.2;
        int persone = 10_000;
        int giorni = 0;
        while((int)Math.pow(tasso, giorni) <= persone / 2) {
            giorni++;
        }
        System.out.println("Giorni necessari = " + giorni);
    }

}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sten saks papir 1.0");

        Haand a = Haand.SAKS;
        Haand b = Haand.PAPIR;
        Haand c = Haand.STEN;

        //Her starter spillet
        StenSaksPapir runde1 = new StenSaksPapir();
        System.out.println(runde1.slaa(a, b));

        //løkke
        for (int i = 0; i < 3; i++) {
            
        //Computer generere en hånd
        Haand computerHaand = null;

        int haandInt =(int) (Math.random()*3+1);
        //Korte nørklet kode computerHaand = Haand.values()[haandInt];
        if(haandInt == 1) {computerHaand = Haand.STEN;}
        if(haandInt == 2) {computerHaand = Haand.SAKS;}
        if (haandInt == 3) {computerHaand = Haand.PAPIR;}
        System.out.println("Computer slår " + computerHaand);

        //Indlæse spillerens hånd
        Scanner scanner = new Scanner(System.in);
        Haand spillerenshaand = null;
        String spillerenString = scanner.next();
        if(spillerenString.equals("sten")) {spillerenshaand = Haand.STEN;}
        if(spillerenString.equals("saks")) {spillerenshaand = Haand.SAKS;}
        if(spillerenString.equals("papir")) {spillerenshaand = Haand.PAPIR;}
        System.out.println("Spiller Slår " + spillerenshaand);

        //Sammenligne med slaa() metode
        int resultat = runde1.slaa(computerHaand, spillerenshaand);

        //Udråbe en vinder
        System.out.println("Resultatet er " +resultat);

        //TODO vis resultatet mere meningsfuldt
        if(resultat == 1)
            System.out.println("Computeren vinder");
        if(resultat == 2)
            System.out.println("Spilleren vinder");
        if(resultat == 0)
            System.out.println("uafgjort");
        if(resultat == -1)
            System.out.println("fejl");
    }

    }
}

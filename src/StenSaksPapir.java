public class StenSaksPapir {

    /**
     * Hvis den første hånd vinder, returneres en
     * Hvis den anden hånd vinder, returneres to
     * hvis uafgjort returneres nul
     * Hvis der er en fejl så returnerer den minus en
     **/
    int slaa(Haand a, Haand b) {

        int resultat = -1;
        //TODO refaktorer, så det bliver kortere med f.eks.
        // if (a == Haand.STEN && b == Haand.STEN {resultat = 0;}
        // if (a == Haand.STEN && b == Haand.SKAS) {resultat = 1;}

        //første hånd sten
        if (a == Haand.STEN) {
            //anden hånd være sten
            if (b == Haand.STEN) {resultat = 0;}
            //anden hånd være saks
            if (b == Haand.SAKS) {resultat = 1;}
            //anden hånd være papir
            if (b == Haand.PAPIR) {resultat = 2;}
        }
        //første hånd saks
        if (a == Haand.SAKS) {
            //anden hånd være sten
            if (b == Haand.STEN) {resultat = 2;}
            //anden hånd være saks
            if (b == Haand.SAKS) {resultat = 0;}
            //anden hånd være papir
            if (b == Haand.PAPIR) {resultat = 1;}
        }
        //første hånd papir
        if (a == Haand.PAPIR) {
            //anden hånd være sten
            if (b == Haand.STEN) {resultat = 1;}
            //anden hånd være saks
            if (b == Haand.SAKS) {resultat = 2;}
            //anden hånd være papir
            if (b == Haand.PAPIR) {resultat = 0;}
        }

            return resultat;
        }
        //TODO flereKampe() {}
}
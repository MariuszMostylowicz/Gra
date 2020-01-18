package SDAZajecia3i4;

import java.util.Arrays;

/*
public class GraKolkoIKrzyzyk {




    public static void main(String[] args) {

        GraKolkoIKrzyzyk x = new GraKolkoIKrzyzyk();
        Pole[][] plansza = x.stwórzPlanszę();
        Pole[][] plansza2 = x.stwórzPustąPlanszę();
        x.drukuj(plansza);
        System.out.println("Czy 3x w rzędzie? " + x.trzyWRzędzie(plansza, Pole.KRZYŻYK));
        System.out.println("Czy 3x w kolumnie " + x.trzyWKolumnie(plansza, Pole.KRZYŻYK));
        System.out.println("Czy 3x w skosie? " + x.trzyWSkosie(plansza, Pole.KRZYŻYK));
        System.out.println("Czy wygral?" + x.wygrał(plansza, Pole.KRZYŻYK));


    }

    public Pole[][] stwórzPustąPlanszę() {
        Pole[][] plansza = new Pole[][]{
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE}
        };
        return plansza;
    }

    public Pole[][] stwórzPlanszę() {
        Pole[][] plansza3 = new Pole[][]{
                {Pole.PUSTE, Pole.KÓŁKO, Pole.KRZYŻYK},
                {Pole.PUSTE, Pole.KRZYŻYK, Pole.PUSTE},
                {Pole.KRZYŻYK, Pole.KRZYŻYK, Pole.KRZYŻYK}
        };
        return plansza3;
    }

    public void drukuj(Pole[][] plansza) {
        for (Pole[] rząd : plansza) {
            System.out.println("|" +
                    rząd[0].getZnak() + "|" +
                    rząd[1].getZnak() + "|" +
                    rząd[2].getZnak() + "|" );

            //System.out.println(Arrays.toString(rząd).);    <-To do enumów a nigdy do tablic. Bierze jako tekst zawartosc enuma
        }

    }

    public boolean jestPełna(Pole[][] plansza) {
        for (Pole[] rząd : plansza) {
            for (Pole pole : rząd) {
                if (pole == Pole.PUSTE) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean trzyWRzędzie(Pole[][] plansza, Pole znak) {
        for (Pole[] rząd : plansza) {
            if (
                    rząd[0] == znak &&
                    rząd[1] == znak &&
                    rząd[2] == znak
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean trzyWKolumnie(Pole[][] plansza, Pole znak) {
        for (int k = 0; k < 3; k++) {
            int licznik = 0;
            for (int w = 0; w < 3; w++) {
                if (plansza[w][k] == znak) {
                    licznik++;
                    if (licznik == 3) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public boolean trzyWSkosie(Pole[][] plansza, Pole znak) {

        return (plansza[0][0] == znak &&
                plansza[1][1] == znak &&
                plansza[2][2] == znak)
                ||
                (plansza[0][2] == znak &&
                plansza[1][1] == znak &&
                plansza[2][0] == znak);


    }

    public boolean wygrał(Pole[][] plansza, Pole znak) {
        return trzyWKolumnie(plansza, znak) ||
                trzyWRzędzie(plansza, znak) ||
                trzyWSkosie(plansza, znak);
    }


}*/

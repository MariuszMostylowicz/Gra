package SDAZajecia3i4;

public class Gra {
    private Plansza plansza = new Plansza();
    private Gracz graczX;
    private Gracz graczO;

    public Gra(boolean graczXKomputer, boolean graczOKomputer) {
        graczX = graczXKomputer ? new GraczKomputerowy() : new GraczCzłowiek();
        graczO = graczOKomputer ? new GraczKomputerowy() : new GraczCzłowiek();
    }

    public void uruchom() throws Exception {
        Plansza plansza = new Plansza();

        System.out.println("Kółko i Krzyżyk");
        System.out.println("Start");
        System.out.println(plansza);
        while (true) {
            System.out.println("Kolej gracza X");
            ruch(plansza, graczX, Pole.KRZYŻYK);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KRZYŻYK)) {
                System.out.println("Gracz X wygrał");
                break;

            }
            System.out.println("Kolej gracza O");
            ruch(plansza, graczO, Pole.KÓŁKO);
            if (plansza.wygrał(Pole.KÓŁKO)) {
                System.out.println("Gracz O wygrał");
                break;
            }
        }

    }

    private void ruch(Plansza plansza, Gracz gracz, Pole znak) {
        boolean udałoSię = false;
        for (int próba = 0; próba < 3; próba++) {
            try {
                Współrzędne współrzędne = gracz.następnyRuch(plansza.obecnyStan());
                udałoSię = plansza.wykonajRuch(współrzędne, znak);
                break;
            } catch (Exception e) {
                System.out.println("Ruch niepoprawny. Spróbuj jeszcze raz");
            }
        }
        if (!udałoSię) {
            throw new RuntimeException(
                    String.format("Gracz %c nie umie grać w prostą grę", znak.getZnak())
            );
        }
    }
}
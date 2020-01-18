package SDAZajecia3i4;

public class GraczKomputerowy implements Gracz {

    @Override
    public Współrzędne następnyRuch(Pole[][] plansza) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (plansza[x][y] == Pole.PUSTE) {
                    return new Współrzędne(x, y);
                }
            }
        }
        return null;
    }


}

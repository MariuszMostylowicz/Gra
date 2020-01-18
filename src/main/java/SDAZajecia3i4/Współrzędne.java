package SDAZajecia3i4;

public class Współrzędne {
    private int x;
    private int y;

    public Współrzędne(int x, int y) {
        if(x > 2 || x < 0 || y > 2 || y < 0){
            throw new RuntimeException("Niepoprawne współrzędne");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Współrzędne){
            Współrzędne inneWspółrzędne = (Współrzędne) obj;
            return inneWspółrzędne.x == x &&
                    inneWspółrzędne.y == y;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        //return "(" + x + "," + y + ")";
        return String.format("(%d, %d)", x, y);

              /*  "współrzędne " +
                "(x, y) (" + x +", " + y + ")";
*/
    }

    public static void main(String[] args) {
        Współrzędne w1 = new Współrzędne(122,22);
        Współrzędne w2 = new Współrzędne(1,1);

        System.out.println(w1.equals(w2));
        System.out.println(w1);
        System.out.println(w1.toString());

    }
}

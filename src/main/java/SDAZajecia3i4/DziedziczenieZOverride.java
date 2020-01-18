package SDAZajecia3i4;

public class DziedziczenieZOverride {

    public class Zwierze {
        public void dzwiek(){
            System.out.println("Rawr");
        }
    }
    public class Kogut extends Zwierze{
        @Override
        public void dzwiek() {
            System.out.println("Kukuryku");
        }
    }
    public class Mysz extends Zwierze{
        @Override
        public void dzwiek() {
            super.dzwiek();
        }
    }

   /* public static void main(String[] args) {
        Kogut kogut = new kogut();
        kogut.dzwiek();
    }*/
}

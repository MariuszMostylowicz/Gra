package SDAZajecia3i4;

import java.util.Scanner;

public class GraczCzłowiek  implements Gracz{



        private Scanner scanner = new Scanner(System.in);
    @Override
        public Współrzędne następnyRuch (Pole[][]plansza) throws  Exception {
        System.out.println("Podaj swój następny ruch:");
        Współrzędne współrzędne;
        while(true) {
            try {

                String[] input = scanner.nextLine().split(" ");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                współrzędne = new Współrzędne(x, y);
                break;
            } catch (NumberFormatException nfe){
                System.out.println("Nie podałeś poprawnej liczby");
                System.out.println("Spróbuj jeszcze raz");

            }
            catch (Exception e) {
                String message = e.getMessage();
                System.out.printf("Wystąpił wyjątek: %s%n", message);
                System.out.println("Spróbuj jeszcze raz");
            }
        }
            return współrzędne ;
        }
    private void drukuj(Pole[][] plansza) {
        for (Pole[] rząd : plansza) {
            System.out.println("|" +
                    rząd[0].getZnak() + "|" +
                    rząd[1].getZnak() + "|" +
                    rząd[2].getZnak() + "|" );


        }

    }

   /* public static void main(String[] args) {
        Współrzędne ruch = new GraczCzłowiek().następnyRuch(null);
        System.out.printf("%d %d%n", ruch.getX(), ruch.getY());
        }*/
    }


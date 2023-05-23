import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kilo?: ");
        armut = input.nextDouble();

        System.out.print("Elma kilo?: ");
        elma = input.nextDouble();

        System.out.print("Domates kilo?: ");
        domates = input.nextDouble();

        System.out.print("Muz kilo?: ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kilo?: ");
        patlican = input.nextDouble();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.print("Toplam tutar: " + toplam);







    }
}
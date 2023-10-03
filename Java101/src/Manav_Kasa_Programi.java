import java.util.Scanner;
public class Manav_Kasa_Programi {
    public static void main (String[]args) {
        double armut=2.14,elma=3.67,domat=1.11,muz=0.95,balcan=5.00,toplam;
        double kgarmut,kgelma,kgdomat,kgmuz,kgbalcan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldınız ? : ");
        kgarmut = inp.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız ? : ");
        kgelma = inp.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız ? : ");
        kgdomat = inp.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız ? : ");
        kgmuz = inp.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız ? : ");
        kgbalcan = inp.nextDouble();

        toplam = ((armut*kgarmut)+(elma*kgelma)+(domat*kgdomat)+(muz*kgmuz)+(balcan*kgbalcan));
        System.out.println("Toplam Tutar : " + toplam + " TL");

    }
}

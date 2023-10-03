import java.util.Scanner;
public class KDV_Tutari_Hesaplayan_Program {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18, kdvOran2=0.08, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ürün fiyatını giriniz : ");
        tutar = inp.nextDouble();

        kdvTutar = tutar >1000 ? tutar * kdvOran2 : tutar * kdvOran1;
        kdvliTutar = kdvTutar + tutar;
        kdvOran1 = tutar>1000 ? kdvOran2 : kdvOran1;

        System.out.println("Ürün Fiyatı : " + tutar + " TL");
        System.out.println("KDV Oranı : " + kdvOran1 + " %");
        System.out.println("KDV Tutarı : " + kdvTutar + " TL");
        System.out.println("KDV'li Tutar : " + kdvliTutar + " TL");


    }
}

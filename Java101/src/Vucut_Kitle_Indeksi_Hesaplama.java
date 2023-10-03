import java.util.Scanner;
public class Vucut_Kitle_Indeksi_Hesaplama {
    public static void main (String[]args){
        double boy,kilo,vki;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Cm Cinsinde Giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Kg Cinsinde Giriniz : ");
        kilo = inp.nextDouble();

        vki = (kilo / (boy * boy))*10000;

        System.out.print("Vücut Kitle İndeksiniz : " + vki + " kg/m2");

    }
}

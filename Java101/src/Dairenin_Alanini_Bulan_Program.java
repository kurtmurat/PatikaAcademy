import java.util.Scanner;
public class Dairenin_Alanini_Bulan_Program {
    public static void main (String[]args){
        int r;
        double pi=3.14, alan,cevre,daireDilimi,aci;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz : ");
        r = girdi.nextInt();
        alan = (pi*r*r);
        System.out.println("Dairenin Alanı : " + alan );
        cevre = (2*pi*r);
        System.out.println("Dairenin Çevresi : " + cevre );

        System.out.print("Dairenin Merkez Açısını Giriniz : ");
        aci = girdi.nextDouble();
        aci = (pi*(r*r)*aci)/360;
        System.out.println("Merkez Açısını Girdiğiniz Dairenin Alanı : " + aci);

    }
}

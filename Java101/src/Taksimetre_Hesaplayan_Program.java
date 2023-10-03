import java.util.Scanner;
public class Taksimetre_Hesaplayan_Program {
    public static void main (String[]args) {

        double kmUcreti=2.20, acilis=10, min=20,km,tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen km'yi giriniz : ");
        km = inp.nextInt();

        tutar = (acilis+(km * kmUcreti));
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Toplam Tutar : " + tutar + " TL");

    }
}

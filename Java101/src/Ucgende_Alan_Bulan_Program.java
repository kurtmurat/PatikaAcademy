import java.util.Scanner;
public class Ucgende_Alan_Bulan_Program {
    public static void main (String[] args) {
        int a,b,c;
        double u,alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = inp.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b = inp.nextInt();

        System.out.print("3. Kenarı Giriniz : ");
        c = inp.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı : " + alan + " cm2");

    }
}

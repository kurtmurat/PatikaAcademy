import java.util.Scanner;
public class Kombinasyon_Hesaplayan_Program {
    public static void main(String[]args){
        int n,r,nfak = 1, rfak = 1,nrfak = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz (n) : ");
        n = input.nextInt();
        System.out.print("Seçim sayısını giriniz (r) : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            nfak = nfak * i;
        }
        for (int i = 1; i <= r; i++){
            rfak = rfak * i;
        }
        for (int i = 1; i <= n - r; i++){
            nrfak = nrfak * i;
        }
        int sonuc = nfak / (rfak * nrfak);
        System.out.println("C(" + n + "," + r + ") = " + sonuc);

    }
}

import java.util.Scanner;
public class Tek_ve_Cift_Sayilarin_Toplamini_Bulan_Program {
    public static void main(String[]args){
        int n, total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n = inp.nextInt();
            if (n %4 == 0){
                total += n;
            }
        } while (n %2 == 0);
        System.out.println("Toplam : " + total);
    }
}

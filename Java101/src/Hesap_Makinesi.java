import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[]args){
        int n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Girilen Sayıların Toplamı : " + (n1 + n2));
            break;
            case 2:
                System.out.println("Girilen Sayıların Çıkarımı : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Girilen Sayıların Çarpımı : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Girilen Sayıların Bölümü : "
                        + ((n2 == 0) ? "Bir Sayı Sıfıra Bölünemez ! " : (n1 / n2)));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız !");
        }
    }
}
import java.util.Scanner;
public class Bir_Sayinin_Basamak_Sayilari_Toplami {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int total = 0;

        while (number != 0){
            total += (number %10);
            number /= 10;
        }
        System.out.println("Sayının basamak değerlerinin toplamı : " + total);
    }
}

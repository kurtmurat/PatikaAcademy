import java.util.Scanner;
public class Girilen_Sayiya_Kadar_Olan_Cift_Sayilar {
    public static void main (String[]args){
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = inp.nextInt();

        int i = 1;
        while (i <= k){
            if (i %2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

import java.util.Scanner;
public class Uslu_Sayi_Hesaplayan_Program {
    public static void main(String[]args){
        int n,k,i, total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı yazınız : ");
        n = inp.nextInt();
        System.out.print("Üs olacak sayıyı yazınız : ");
        k = inp.nextInt();

        for ( i = 1; i <= k; i++ ){
            total *= n;
        }
        System.out.println("Sonuç : " +total);
    }
}

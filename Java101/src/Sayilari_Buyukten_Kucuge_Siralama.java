import java.util.Scanner;
public class Sayilari_Buyukten_Kucuge_Siralama {
    public static void main(String []args){
     int a,b,c;

     Scanner inp = new Scanner(System.in);
        System.out.print("a sayısını giriniz : ");
        a = inp.nextInt();
        System.out.print("b sayısını giriniz : ");
        b = inp.nextInt();
        System.out.print("c sayısını giriniz : ");
        c = inp.nextInt();

        if ((a > b) && (a > c)){
             if (b > c){
                System.out.print("a > b > c");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c){
                System.out.println("b > a > c");
            }
        } else if ((c > a) && (c > b)) {
            if (b > a){
                System.out.println("c > b > a");
            }
        }
    }
}

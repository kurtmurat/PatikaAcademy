import java.util.Scanner;
public class Sinif_Gecme_Durumu {
    public static void main (String[]args){
        int mat,fiz,tur,kim,muz;
        double ortalama;
        int toplamNot = 0,toplamDers = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();
        if ((mat >= 0) && (mat <=100)){
            toplamNot += mat;
            toplamDers++;
        }
        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = inp.nextInt();
        if ((fiz >=0 ) && (fiz <= 100)){
            toplamNot += fiz;
            toplamDers++;
        }
        System.out.print("Türkçe Notunuzu Giriniz : ");
        tur = inp.nextInt();
        if ((tur >= 0) && (tur <= 100)){
            toplamNot += tur;
            toplamDers++;
        }
        System.out.print("Kimya Notunuzu Giriniz : ");
        kim = inp.nextInt();
        if ((kim >= 0) && (kim <= 100)){
            toplamNot += kim;
            toplamDers++;
        }
        System.out.print("Müzik Notunuzu Giriniz : ");
        muz = inp.nextInt();
        if ((muz >= 0) && (muz <= 100)){
            toplamNot += muz;
            toplamDers++;
        }
        ortalama = (toplamNot/toplamDers);

        if (ortalama <= 55){
            System.out.println("Sınıfta Kaldınız");
        }else {
            System.out.println("Tebrikler !");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}

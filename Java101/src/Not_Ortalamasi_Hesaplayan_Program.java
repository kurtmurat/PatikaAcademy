import java.util.Scanner;
public class Not_Ortalamasi_Hesaplayan_Program {
    public static void main(String[] args) {

        int mat,fiz,kim,tur,tar,muz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        tur = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tar = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muz = inp.nextInt();

        int toplam = (mat+fiz+kim+tur+tar+muz);
        double sonuc = toplam / 6 ;
        System.out.println("Not Ortalamanız : " + sonuc);


        boolean durum = sonuc >= 60;
        System.out.print(durum ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.");

    }
}


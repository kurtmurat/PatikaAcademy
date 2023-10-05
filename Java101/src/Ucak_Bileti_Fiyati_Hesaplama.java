import java.util.Scanner;
public class Ucak_Bileti_Fiyati_Hesaplama {
    public static void main (String[]args){
        int age,type;
        double km,perKm=0.10,price = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Hoşgeldiniz, sizin için en uygun bileti bulabilmem için bir kaç soru soracağım...");
        System.out.print("Yaşınız : ");
        age = inp.nextInt();
        System.out.print("Kaç Km gideceksiniz : ");
        km = inp.nextDouble();
        System.out.println("Uçuş tipinizi seçiniz... \n1-Tek Yön\n2-Çift Yön");
        type = inp.nextInt();

        switch (type) {
            case 1:
                if (age < 12){
                    price = (km*perKm*0.5);
                }  if ((age >= 12) && (age <= 24)) {
                    price = (km*perKm*0.9);
                }  if ((age > 24) && (age <= 65)){
                    price = (km*perKm);
                }  if (age > 65) {
                    price = (km*perKm*0.7);
                }   break;
            case 2:
                if (age < 12){
                    price = 2*(km*perKm*0.5)*0.8;
                }  if ((age >= 12) && (age <= 24)) {
                    price = 2*(km*perKm*0.9)*0.8;
                }  if ((age > 24) && (age <= 65)){
                    price = 2*(km*perKm)*0.8;
                }  if (age > 65) {
                    price = 2*(km*perKm*0.7)*0.8;
            }   break;
            default:
                System.out.println("Yanlış Seçim Yaptınız !!");
        }
        System.out.println("Toplam Tutar : " +price +" TL");
    }
}

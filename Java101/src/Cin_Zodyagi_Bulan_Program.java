import java.util.Scanner;
public class Cin_Zodyagi_Bulan_Program {
    public static void main (String[]args){
        int birthYear;
        String sign = null,m="Maymun",h="Horoz",k="Köpek",d="Domuz",f="Fare",o="Öküz";
        String k2="Kaplan",t="Tavşan",e="Ejderha",y="Yılan",a="At",k3="Koyun";

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        birthYear = inp.nextInt();

        if (birthYear %12 == 0){
            sign = m;
        }
        if (birthYear %12 == 1){
            sign = h;
        }
        if (birthYear %12 == 2){
            sign = k;
        }
        if (birthYear %12 == 3){
            sign = d;
        }
        if (birthYear %12 == 4){
            sign = f;
        }
        if (birthYear %12 == 5){
            sign = o;
        }
        if (birthYear %12 == 6){
            sign = k2;
        }
        if (birthYear %12 == 7){
            sign = t;
        }
        if (birthYear %12 == 8){
            sign = e;
        }
        if (birthYear %12 == 9){
            sign = y;
        }
        if (birthYear %12 == 10){
            sign = a;
        }
        if (birthYear %12 ==11){
            sign = k3;
        }
        System.out.print("Çin Zodyağı Burcunuz : " + sign);
    }
}

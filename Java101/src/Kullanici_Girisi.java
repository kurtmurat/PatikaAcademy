import java.util.Scanner;
public class Kullanici_Girisi {
    public static void main (String[]args){
        String username, password,newPassword;
        int select;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username = inp.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yaptınız ! ");
        } else {
            System.out.println("Bilgileriniz Yanlış ! ");
            System.out.println("Şifrenizi Sıfırlamak İster misiniz ?\n1-Evet\n2-Hayır ");
            System.out.print("Seçiminiz : ");
            select = inp.nextInt();

            switch (select){
                case 1:
                    System.out.print("Yeni Şifrenizi Yazınız : ");
                    newPassword = inp.next();
                    if(newPassword.equals(password)){
                        System.out.print("Yeni Şifreniz Eskisi ile Aynı Olamaz !");
                        break;
                    }else {
                        System.out.print("Şifre Oluşturuldu.");
                    }break;
                case 2:
                    System.out.println("Keyfiniz Bilir...");
            }
        }
    }
}

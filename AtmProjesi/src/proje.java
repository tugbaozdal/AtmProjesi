import java.util.Scanner;

public class proje {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int hak=3;//kullanıcı şifre ve kullanıcı adını yanlış girmesi durumunda 3 hakkı var
        int bakiye=1500;//kullanıcın bankasındaki para

        while (hak>0){
            String userName,password;
            System.out.print("lütfen kullanıcı adı giriniz: ");
            userName= inp.nextLine();
            System.out.print("şifrenizi giriniz: ");
            password=inp.nextLine();
            int secim;
            if (userName.equals("tugbaozdal")&&password.equals("1234")){
                System.out.println("Merhaba TUBANK'a hoşgeldiniz");
                do { System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
                    int paraYatirma=1;
                    int paraCekme=2;
                    int bakiyeSorgu=3;
                    int cikis=4;

                    System.out.println("Para yatırmak için 1'i \n Para çekmek için 2'yi \n Bakiye sorulamak için 3'ü \n Çıkış yapmak için 4'ü tuşlayınız. " );
                    secim= inp.nextInt();
                    if (secim==paraYatirma) {
                        System.out.println("Merhaba! Ne kadar kadar para yatırmak istersiniz, tuşlayınız.");
                        paraYatirma = inp.nextInt();
                        System.out.println("hesabınıza " + paraYatirma + "tl yatırılmıştır.");
                        System.out.println("güncek bakiye: "+(bakiye+paraYatirma));
                    }
                     else if (secim==paraCekme){
                        System.out.println("Merhaba! Ne kadar para çekmek istersiniz?");
                        paraCekme= inp.nextInt();
                        if (bakiye<paraCekme){
                            System.out.println("bakiye yetersiz");}
                        else {
                        System.out.println("hesabınızdan "+paraCekme+" tl çekilmiştir, lütfen paranızı alınız ");
                        System.out.println("güncel bakiye: "+ (bakiye-paraCekme));}
                    }
                    else if (secim==bakiyeSorgu){
                        System.out.println("Merhaba! kalan bakiyeniz: "+bakiye);
                    }
                } while (secim!=4);
                System.out.println("çıkışınız yapıldı. Tekrar görüşmek üzere");
                 break;
            }
            else{
                hak--;
                System.out.println("giriş başarısız, tekrar deneyiniz.");
                System.out.println("kalan hak: "+hak);
                if (hak==0){
                    System.out.println("hesabınız bloke olmuştur. Bankayla görüşünüz.");
                }
            }
        }

    }
}


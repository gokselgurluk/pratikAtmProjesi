
import  java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String userName,password ;
        int  right = 3, balance=1500 ,select,price;  //right = kullanıcı hatali giriş deneme hakkı
                                                     //balance = bakiye tutarı
        Scanner userInput = new Scanner(System.in);  // select =liste secim degiskeni
                                                     //price = kullanıcıdan alınacak tutar girdisini tutma
        while (right > 0 ){  //kullanıcı deneme hakkının kontrolu

                    System.out.print("Kullanıcı Adınız ?: ");

            userName=userInput.nextLine();

                    System.out.print("Parolanız ?: ");

            password=userInput.nextLine();                          //Kullanıcı adi şifre girdi ve degeri tutma

            if(userName.equals("patika") && password.equals("dev123")){
                    System.out.println("Bankamıza Hoş geldiniz");
                do{                                                 //Girdi deger kontrolu ve koşul kontrolü
                    System.out.println("1-Para Yatırma\n"
                            +"2-Para Çekme\n"
                            +"3-Bakiye Sorgula\n"
                            +"4-Çıkış");
                    System.out.print("Yapmak istediginiz işlem ?: ");
                        select= userInput.nextInt();                    //kullanıcıya işlem liste bilgisi sunma ve işlem numara girdisini tutma
                    switch (select){
                         case 1:
                            System.out.print("Tutar Giriniz: ");
                                price=userInput.nextInt();
                                balance += price;
                            System.out.println("***İşlem Başaralı***");
                        case 2:
                            System.out.print("Tutar Giriniz: ");
                                price=userInput.nextInt();
                                    if (price>balance){                 //girilen tutar bakiyeden buyukmu kucukmu kontrolu
                                        System.out.println("***Bakiye Yetersiz***");
                                    }
                                    else{
                                        balance -= price;
                                        System.out.print("***İşlem Başaralı***");
                                    }
                                    break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        }                                                   //girdi degerine göre switch case yapısı ile kontrol etme
                }while (select != 4);
                    System.out.println("Hoşcakalın");                       //while koşul sorgusu ile çıkış girdisi kullanıcıdan girilene kadar dönguyü devam ettirme
                    break;
            }
            else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı Tekrar Deneyiniz !");
                    if(right==0){
                    System.out.println("Hesabınız Bloke Oldu");
                    }
                    else {
                        System.out.println("Kalan hakkınız !: "+right);         //girdi bilgileri hatalı oldugunda yapılacak işlemler
                }
            }
        }
    }
}

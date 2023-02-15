import java.util.Scanner;
/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 */

public class Chinese_Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğum yılınızı giriniz:");
        int year = input.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Maymun");
                break;
            case 1:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Horoz");
                break;
            case 2:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Köpek");
                break;
            case 3:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Domuz");
                break;
            case 4:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Fare");
                break;
            case 5:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Öküz");
                break;
            case 6:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Kaplan");
                break;
            case 7:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Tavşan");
                break;
            case 8:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Ejderha");
                break;
            case 9:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Yılan");
                break;
            case 10:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: At");
                break;
            case 11:
                System.out.println("Çin Astrolojisine göre sizi tanımlayan hayvan: Koyun");
                break;



        }

    }
}


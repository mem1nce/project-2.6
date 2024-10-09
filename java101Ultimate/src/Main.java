import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipini al
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        // Mesafe başına ücret
        double birimUcret = 0.10;

        // Girilen değerlerin doğruluğunu kontrol et
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            // Toplam fiyat hesaplama
            double toplamFiyat = mesafe * birimUcret;

            // Yaş indirimleri
            if (yas < 12) {
                toplamFiyat *= 0.5;  // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9;  // %10 indirim
            } else if (yas > 65) {
                toplamFiyat *= 0.7;  // %30 indirim
            }

            // Yolculuk tipi indirim kontrolü
            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8;  // %20 indirim
                toplamFiyat *= 2;    // Gidiş-Dönüş olduğu için toplam fiyat iki katı
            }

            // Sonuçları ekrana yazdır
            System.out.println("Toplam bilet fiyatı: " + toplamFiyat + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}

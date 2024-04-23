import java.util.Scanner;

public class W2_q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ürün alacaksınız? ");
        int urunSayisi = scanner.nextInt();

        String[] urunAdi = new String[urunSayisi];
        double[] urunFiyati = new double[urunSayisi];
        int[] miktar = new int[urunSayisi];

        for (int i = 0; i < urunSayisi; i++) {
            System.out.println("Ürün " + (i + 1) + " bilgilerini girin:");
            System.out.print("Adı: ");
            urunAdi[i] = scanner.next();
            System.out.print("Fiyatı: ");
            urunFiyati[i] = scanner.nextDouble();
            System.out.print("Miktarı: ");
            miktar[i] = scanner.nextInt();
        }

        // Alınan ürün bilgilerini ekrana yazdırma
        System.out.println("Alınan ürünler:");
        for (int i = 0; i < urunSayisi; i++) {
            System.out.println("Ürün adı: " + urunAdi[i]);
            System.out.println("Fiyatı: " + urunFiyati[i]);
            System.out.println("Miktarı: " + miktar[i]);
            System.out.println();
        }

    }
}

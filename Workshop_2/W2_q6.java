import java.util.ArrayList;
import java.util.Scanner;

public class W2_q6 {
    static class Gorev {
        String ad;
        boolean tamamlandiMi;

        public Gorev(String ad) {
            this.ad = ad;
            this.tamamlandiMi = false;
        }

        public void gorevTamamlandi() {
            this.tamamlandiMi = true;
        }
    }
    public static void gorevEkle(ArrayList<Gorev> gorevler, String ad) {
        gorevler.add(new Gorev(ad));
        System.out.println(ad + " adlı görev eklendi.");
    }

    public static void gorevTamamla(ArrayList<Gorev> gorevler, String ad) {
        for (Gorev gorev : gorevler) {
            if (gorev.ad.equalsIgnoreCase(ad)) {
                gorev.gorevTamamlandi();
                System.out.println(ad + " adlı görev tamamlandı.");
                return;
            }
        }
        System.out.println("Böyle bir görev bulunamadı.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gorev> gorevler = new ArrayList<>();

        while (true) {
            System.out.println("1. Görev ekle");
            System.out.println("2. Görev tamamla");
            System.out.println("3. Çıkış");
            System.out.println("Yapılacak işlemi seçin:");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.print("Eklemek istediğiniz görevin adını girin: ");
                String ad = scanner.next();
                gorevEkle(gorevler, ad);
            } else if (secim == 2) {
                System.out.print("Tamamlanan görevin adını girin: ");
                String ad = scanner.next();
                gorevTamamla(gorevler, ad);
            } else if (secim == 3) {
                break;
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }
        System.out.println("Kalan görevler:");
        for (Gorev gorev : gorevler) {
            if (!gorev.tamamlandiMi) {
                System.out.println(gorev.ad);
            }
        }
    }
}

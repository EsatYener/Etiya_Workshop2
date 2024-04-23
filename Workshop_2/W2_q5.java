import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class W2_q5 {
    static class Ogrenci {
        String ad;
        double not;

        public Ogrenci(String ad, double not) {
            this.ad = ad;
            this.not = not;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        // Öğrenci adı ve not bilgilerini kullanıcıdan alma
        while (true) {
            System.out.print("Öğrenci adını girin (Çıkmak için 'q' ya da 'Q' girin): ");
            String ad = scanner.next();
            if (ad.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("Notu girin: ");
            double not = scanner.nextDouble();

            ogrenciler.add(new Ogrenci(ad, not));
        }

        // Belirli bir not aralığındaki öğrencileri listeden silme
        System.out.print("Silinecek not limitini girin: ");
        double ustSinir = scanner.nextDouble();

        Iterator<Ogrenci> iterator = ogrenciler.iterator();

        while (iterator.hasNext()) {
            Ogrenci ogrenci = iterator.next();
            if ( ogrenci.not <= ustSinir) {
                iterator.remove();
            }
        }

        // Kalan öğrencileri ekrana yazdırma
        System.out.println("Kalan öğrenciler:");
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("Öğrenci adı: " + ogrenci.ad + ", Notu: " + ogrenci.not);
        }
    }
}

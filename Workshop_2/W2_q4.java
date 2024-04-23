import java.util.ArrayList;
import java.util.Scanner;

public class W3_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        String username = scanner.next();
        System.out.print("Email adresinizi girin: ");
        String email = scanner.next();
        System.out.print("Adınızı girin: ");
        String firstname = scanner.next();
        System.out.print("Soyadınızı girin: ");
        String lastname = scanner.next();
        System.out.print("Şifrenizi girin: ");
        String password = scanner.next();

        ArrayList<String> bilgiler = new ArrayList<>();
        bilgiler.add(username);
        bilgiler.add(email);
        bilgiler.add(firstname);
        bilgiler.add(lastname);
        bilgiler.add(password);

        // Kullanıcı bilgilerini ekrana yazdırma
        System.out.println("Kullanıcı bilgileri:");
        System.out.println("Kullanıcı adı: " + bilgiler.get(0));
        System.out.println("Email: " + bilgiler.get(1));
        System.out.println("Ad: " + bilgiler.get(2));
        System.out.println("Soyad: " + bilgiler.get(3));
        System.out.println("Şifre: " + bilgiler.get(4));
    }
}

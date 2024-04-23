

public class W2_q1 {

    public static void main(String[] args) {
        String[] urunAdi = {"Süt", "Yogurt", "Peynir"};
        double[] urunFiyati = {10.5, 20.0, 15.75};
        int[] satisMiktari = {20, 30, 15};
        double[] result = new double[3];
        double toplamGelir = 0;
        for(int i = 0; i< 3; i++){
            toplamGelir += urunFiyati[i] * satisMiktari[i];
            result[i] = toplamGelir;
            toplamGelir = 0;
        }
        for(int i = 0; i< 3; i++){
            System.out.println(urunAdi[i] + " ürününün toplam satis miktarı: " + result[i]);
        }
    }

}

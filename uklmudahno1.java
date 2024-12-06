import java.util.Scanner;

public class uklmudahno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();
        
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();
        
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = scanner.nextDouble();
        
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = scanner.nextDouble();
        
   
        double volume = panjang * lebar * tinggi;
        
       
        double[] biayaPerKg = {4250, 6000};
        double biayaPerKgPengiriman;
        
        if (jarak <= 10) {
            biayaPerKgPengiriman = biayaPerKg[0];
        } else {
            biayaPerKgPengiriman = biayaPerKg[1];
        }
        
        double biayaPengiriman = berat * biayaPerKgPengiriman;
        
        if (volume > 100) {
            biayaPengiriman += 50000;
        }
        
        System.out.println("Biaya pengiriman total: Rp " + biayaPengiriman);
        
        scanner.close();
    }
}

import java.util.Scanner;

public class uklsulitno1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

     
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0!");
            return; 
        }

        double[] nilaiSiswa = new double[jumlahSiswa];

        double totalNilai = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = scanner.nextDouble();

           
            if (nilaiSiswa[i] < 0 || nilaiSiswa[i] > 100) {
                System.out.println("Nilai harus antara 0 hingga 100!");
                i--; 
                continue;
            }

            totalNilai += nilaiSiswa[i];
        }

        double rataRata = totalNilai / jumlahSiswa;
        for (int i = 0; i < jumlahSiswa; i++){
            System.out.println(nilaiSiswa [i] + " ");
        }
        System.out.println("=== Rekapitulasi Nilai ===");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
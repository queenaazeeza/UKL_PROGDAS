import java.util.Scanner;
public class uklsedangno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan sebuah bilangan bulat positif: ");
        int n = scanner.nextInt();  
        
        int faktorial = 1;  

        if (n == 0) {
            faktorial = 1;  
        } else {
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    faktorial = faktorial * i;
                }
            } else {
                System.out.println(" harus bilangan bulat positif.");
                return; 
            }
        }
        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
    }
    }

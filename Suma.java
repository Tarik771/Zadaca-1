import java.util.Scanner;
 
public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Unesite 5 brojeva:");
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Unesite broj #" + (i + 1) + ": ");
            int broj = scanner.nextInt();
            suma += broj;
        }
       
        System.out.println("Suma unesenih brojeva je: " + suma);
       
        scanner.close();
    }
}
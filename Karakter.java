import java.util.Scanner;
 
public class Karakter {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Unesite string: ");
        String unos = scanner.nextLine();
       
        int brojKaraktera = unos.length();
       
        System.out.println("Broj karaktera u unesenom stringu je: " + brojKaraktera);
       
        scanner.close();
    }
}
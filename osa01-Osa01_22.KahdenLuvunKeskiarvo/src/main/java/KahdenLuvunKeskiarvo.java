
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int ensi = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int toinen = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötettyjen lukujen keskiarvo on " + Double.valueOf(ensi+toinen)/2);

    }
}

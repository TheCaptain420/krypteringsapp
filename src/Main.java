import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("|--------------------------------|");
        System.out.println("|                                |");
        System.out.println("|      Velkommen til krypter     |");
        System.out.println("|  Indtast din besked du ønsker  |");
        System.out.println("|            Krypteret.          |");
        System.out.println("|                                |");
        System.out.println("|     Tast 1 for Kryptering      |");
        System.out.println("|     Tast 2 for dekryptering    |");
        System.out.println("|--------------------------------|");
        Scanner scanner = new Scanner(System.in);
        System.out.print("$");
        String besked = scanner.nextLine();


        Stringkrypt stringkrypt = new Stringkrypt();
        Stringkrypt beskeddekrypt = new Stringkrypt();

if (besked.contains("1")){
    System.out.print("Indsæt din besked her: ");
    String beskedkrypt = scanner.nextLine();
    stringkrypt.krypterny(beskedkrypt);
}
if (besked.contains("2")){
    System.out.print("Indsæt din besked her: ");
    String beskedkrypt = scanner.nextLine();
    beskeddekrypt.dekrypterny(beskedkrypt);
        }
    }

}

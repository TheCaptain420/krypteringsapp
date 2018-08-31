import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("|--------------------------------|");
        System.out.println("|                                |");
        System.out.println("|      Velkommen til krypter     |");
        System.out.println("|  Indtast din besked du ønsker  |");
        System.out.println("|            Krypteret.          |");
        System.out.println("|                                |");
        System.out.println("|--------------------------------|");
        Scanner scanner = new Scanner(System.in);
        System.out.print("$");
        String besked = scanner.nextLine();

        System.out.println(besked);



    }

}

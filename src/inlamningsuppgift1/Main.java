



package inlamningsuppgift1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int antalbokstaver = 0;
        int antalrader = 0;

        System.out.println("Skriv in din rad eller använd ordet Stop för att avsluta.");

        while(true){
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")){
                break;
            }
            antalbokstaver += line.length();
            antalrader++;

        }

        scanner.close();

        System.out.println("Antal tecken är; "+antalbokstaver);
        System.out.println("Antal rader är"+antalrader);




    }
}


package del2fortsättning;



import java.util.Scanner;

// Class som kommer att hantera all inmatning och utskrift
public class TextRead {
    private TextCheck check;
    private Scanner scanner;

    public TextRead(){

        check = new TextCheck();
        scanner = new Scanner(System.in);

    }

    public void start(){

        System.out.println("Hejsan och välkommen! Vänligen skriv in valfritt antal rader. ");
        while(true){
            String input =  scanner.next();

            if(input.equalsIgnoreCase("stop")){
                break;
            }

            check.addLine(input);

        }

        System.out.println("Programmet har avslutats och här är ditt resultat");
        System.out.println("Antalet rader är: "+check.getAntalRader());
        System.out.println("Antalet tecken är: "+ check.getAntalBokstaver());

    }

}

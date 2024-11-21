package del2fortsättning;

public class TextCheck {

    private int antalRader;
    private int antalBokstaver;

    public TextCheck(){

        antalRader = 0;
        antalBokstaver = 0;

    }

    public void addLine(String line){

        antalRader++;
        antalBokstaver+= line.length();

    }

    public int getAntalRader(){
        return antalRader;
    }
    public int getAntalBokstaver(){

        return antalBokstaver;
    }
}

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Pasient {

    private String navn;
    private ArrayList<Integer> mutasjoner=new ArrayList<>();
    public Pasient(String n,String filnavn){
        navn=n;
        LesFil(filnavn); //Hjelpemetode for å lese pasientens fil og legge alle mutasjonene i pasient-objekt Arraylist av mutasjoner
        
    }

    private void LesFil(String filnavn){
        Scanner sc=null;
        try {
            sc=new Scanner(new File(filnavn));
            while(sc.hasNextLine()){
                int mutasjon=sc.nextInt();
                mutasjoner.add(mutasjon);
            }

        } catch (FileNotFoundException e) {
            System.out.println("fant ikke filen");
            System.exit(1);
        }
        sc.close();
    }

    public ArrayList<Integer> HentMutasjoner(){
        return mutasjoner;
    }

}

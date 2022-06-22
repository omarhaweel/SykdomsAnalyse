import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class SykdomsKatalog {
    
    private HashMap<String,Sykdom> sykdommer=new HashMap<>();

    public SykdomsKatalog(String filnavn){
        LesFraFil(filnavn);

    }

    private void LesFraFil(String filnavn){//Hjelpemetode for fil-Innlesningen. 
        Scanner sc=null;
        try {
            sc=new Scanner(new File(filnavn));
            while(sc.hasNextLine()){
                String linje=sc.nextLine();
                String[] delt=linje.trim().split(",");
                String navn=delt[1];
                int mutasjon=Integer.parseInt(delt[0]);
                // sjekk om sykdommen ikke eksisterer allerede i sykdommer HAshMap
                if (!sykdommer.containsKey(navn)){
                    Sykdom sykdom=new Sykdom(navn);
                    sykdommer.put(navn, sykdom);

                }
                sykdommer.get(navn).LeggTilPosisjon(mutasjon);

            }

        } catch (FileNotFoundException e) {
            System.out.println("kan ikke lese filen,filen finnes ikke");
            System.exit(1);

        }

    }
    public String toString(){
        String string="SykdomsKatalog :\n";
        for (String navn:sykdommer.keySet()){
            string+=" * " + navn + "\n";

        }
        return string;
    }

    public void SjekkMutasjon(int mutasjon){
        for (String navn:sykdommer.keySet()){
            Sykdom sykdom=sykdommer.get(navn);
            if(sykdom.ErAssosiert(mutasjon)){
                System.out.println(sykdom.HentNavn());


            }
        }
    }
}


import java.util.ArrayList;

class Sykdom{

    String navn; // navn på sykdommen vi referer til
    ArrayList<Integer> posisjoner=new ArrayList<Integer>(); // liste av posisjoner (muterte)
    
    public Sykdom(String n){
        navn=n;
    
    }

    public void LeggTilPosisjon(int pos){
        posisjoner.add(pos); // legger til en posisjon i liste av posisjoner.

    }

    public boolean ErAssosiert(int pos){
       
        return posisjoner.contains(pos);
    }

    public String HentNavn(){
        return navn; // returnerer navnet på selveste sykdommen.
    }




}
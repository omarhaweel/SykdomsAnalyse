public class Analyse {
    public static void main(String[] args) {
        Pasient pasient=new Pasient("Mikey", "Pasient1Mutasjoner.txt");
        SykdomsKatalog sk=new SykdomsKatalog("sykdommer_test.txt");
        for (int i:pasient.HentMutasjoner()){
            sk.SjekkMutasjon(i); // sjekk om pasienten har tilbøyelighet for en sykdom
            // dette skjer ved å sammenligne mutasjonene pasienten har mot de som er registrert i Sykdomskatalog
            // for eks om pasient har mutasjon i posisjon 4 og hvis 4 er assosiert med pest i sykdomskatalog
            // så gir det oppslag hos pasienten som har mutasjonen i den posisjonen
            
        }

    }
}

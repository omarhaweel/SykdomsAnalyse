public class TestSykdom {
    public static void main(String[] args) {
        Sykdom s=new Sykdom("diabetes");
        s.LeggTilPosisjon(4);
        s.LeggTilPosisjon(3);

        System.out.println(s.HentNavn());
        System.out.println(s.ErAssosiert(4));

        for (Integer i:s.posisjoner){
            System.out.println(i);
        }
    }
    
}

package lt.meirita.telefonas_inheritance;

public class Telefonas {

    private final String abonimentoNr;
    private String skambutis;


    public Telefonas(String abonimentoNr) {
        this.abonimentoNr = abonimentoNr;
    }

    public void skambink(String telNr){
        System.out.println(
                "Abonimentas [%s] skambina i %s".formatted(abonimentoNr, telNr)
        );
    }

    public String getAbonimentoNr() {
        return abonimentoNr;
    }

    public String getSkambutis() {
        return skambutis;
    }

    public void setSkambutis(String skambutis) {
        this.skambutis = skambutis;
    }

    @Override
    public String toString() {
        return "Telefonas{" +
                "abonimentoNr='" + abonimentoNr + '\'' +
                ", skambutis='" + skambutis + '\'' +
                '}';
    }
}

package lt.meirita.telefonas_interface;


public class Mobilus implements Telefonas {

    private final String abinmentoNr;
    private final String simNr;
    private String skambutis;
    private String sms;
    private int nuotraukuSk;

    public Mobilus(String abonimentoNr, String simNr) {
        this.abinmentoNr = abonimentoNr;
        this.simNr = simNr;
        nuotraukuSk=0;

    }

    public void siuskZinute(String mobNr,String zinute){
        System.out.println(
                """
                        Sms to: %s
                        Message: 
                        %s
                        """.formatted(mobNr, zinute)
        );
    }

    public void fotografuok(){
        nuotraukuSk ++;
    }



    public String getSimNr() {
        return simNr;
    }

    public String getSms() {
        return sms;
    }

    public int getNuotraukuSk() {
        return nuotraukuSk;
    }

    @Override
    public void skambink(String telNr) {

    }

    public String getAbinmentoNr() {
        return abinmentoNr;
    }

    public String getSkambutis() {
        return skambutis;
    }

    public void setSkambutis(String skambutis) {
        this.skambutis = skambutis;
    }

    @Override
    public String toString() {
        return  "Mobilus{nr: %s, simNr: %s, skambutis: %s, nuotraukuSk: %s }".formatted(
                this.abinmentoNr,
                this.simNr,
                this.skambutis,
                this.nuotraukuSk
        );
    }
}

package lt.meirita.telefonas_abstract;


public class Mobilus extends Telefonas {

    private final String simNr;
    private String sms;
    private int nuotraukuSk;

    public Mobilus(String abonimentoNr, String simNr) {
        super(abonimentoNr);
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

    @Override
    public String toString() {
        return  "Mobilus{nr: %s, simNr: %s, skambutis: %s, nuotraukuSk: %s }".formatted(
                super.getAbonimentoNr(),
                this.simNr,
                super.getSkambutis(),
                this.nuotraukuSk
        );
    }
}

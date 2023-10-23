package lt.meirita.telefonas_abstract;

import java.math.BigDecimal;

public class Taksofonas extends Telefonas {

    private BigDecimal skambucioKaina = BigDecimal.valueOf(0.27);
    private BigDecimal likutis = BigDecimal.ZERO;

    public Taksofonas(Double pinigelis) {
        super("[Taksofonas]");
//        this.likutis= this.likutis.add(BigDecimal.valueOf(pinigelis));
        this.likutis = BigDecimal.valueOf(pinigelis);
    }

    @Override
    public void skambink(String telNr) {
        if(likutis.compareTo(skambucioKaina)>-1) {
            System.out.println(
                "Abonimentas [%s] skambina i %s".formatted(super.getAbonimentoNr(), telNr)
        );
            this.likutis = this.likutis.subtract(skambucioKaina);

        }else {
            System.out.println("Likucio nepakanka");
            System.out.println("Prasom papildyti likuti");

        }

    }

    public void papildykLikuti(Double pinigelis){
        this.likutis = this.likutis.add(BigDecimal.valueOf(pinigelis));
    }

    public BigDecimal getSkambucioKaina() {
        return skambucioKaina;
    }

    public BigDecimal getLikutis() {
        return likutis;
    }

    @Override
    public String toString() {
        return "Taksofonas{likutis: %s}".formatted(this.likutis);
    }
}

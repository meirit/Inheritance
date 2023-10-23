package lt.meirita.plotu.skaiciuokle;

public class Trikampis extends Figura {


    public Trikampis(int krastine1, int krastine2) {
        super(krastine1, krastine2);
    }

    @Override
    void skaiciuokPlota() {
        super.skaiciuokPlota();
                super.setPlotas(super.getPlotas() /2);
    }
}

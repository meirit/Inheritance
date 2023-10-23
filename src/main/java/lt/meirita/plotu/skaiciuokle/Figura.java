package lt.meirita.plotu.skaiciuokle;

public class Figura {
    private int plotas;
    private int krastine1;
    private int krastine2;

    public Figura(int krastine1, int krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

    void skaiciuokPlota(){
        plotas = krastine1 * krastine2;
    };

    public int getPlotas() {
        return plotas;
    }

    public void setPlotas(int plotas) {
        this.plotas = plotas;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "Jūsų figuros plotas yra: " + plotas + "kv.cm"+
                '}';
    }
}

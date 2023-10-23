package lt.meirita.demo_inheritance;

public class ClassD extends ClassB{

    public String varD_A;
    public ClassD(String varB_A, String varA_A) {
        super(varB_A, varA_A);
        this.varD_A= varD_A;
    }
    public void doRecursion(int i) {
        if (i < 10) {
            try {
                System.out.println(i);
                i++;
                Thread.sleep(500);
                doRecursion(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

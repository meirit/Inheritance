package lt.meirita.demo_inheritance;

public class ClassB extends ClassA {
    public String varB_A;
    public String varA_A;

    public ClassB(String varB_A, String varA_A) {
        this.varB_A = varB_A;
        this.varA_A = varA_A;
    }

    public void doB_A() {
        super.doA_A();

    }


    @Override
    public void doA_A() {
        super.doA_A();
        this.varB_A = "";
        String varA_A= "";
        super.varA_A ="";
        this.varA_A ="";
    }
}

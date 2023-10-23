package lt.meirita.demo_inheritance;

public class MainDemo {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB("dasa", "sksks");
        ClassC classC = new ClassC();
        ClassD classD = new ClassD("shshs", "sks");

       classA.varA_A = "kint_classAA";
       classB.varB_A = "aaaa";
       classA.varA_B = "kint_classAB";
       classB.varA_A = "kint_childAA";


     classA.doA_A();
     classA.doA_B();
     classB.doB_A();

     classB.varA_A ="Kind_Child_classAA";

     classC.varA_A = "hello";

     classD.doA_B();;
     classD.doA_A();

     classC.toString();
     classC.equals(classB);
     classC.hashCode();
     classC.getClass();

     classA.toString();
     ClassA.vardA_C = "";
     ClassA classA1 = classA;

        System.out.println();
        classD.doRecursion(0);


    }
}

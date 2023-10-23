package lt.meirita.telefonas_interface;

public interface Telefonas {

    public abstract void skambink(String telNr);

    default  void doSomething (String someVariable){}

}

package lt.meirita.telefonas_interface;



import java.util.ArrayList;
import java.util.List;

public class MainTelefonasInheritance {
    public static void main(String[] args) {
//        Telefonas telefonas01 = new Telefonas("8-5-1231234");

        Mobilus mobilus01 = new Mobilus("8-555-111122", "123455");
        Mobilus mobilus02 = new Mobilus("8-555-1441122", "1237855");

        Taksofonas taksofonas01 = new Taksofonas(0.8);
        Taksofonas taksofonas02 = new Taksofonas(0.9);


//        telefonas01.setSkambutis("Dzin-dzilin, dzin-dzilin");
//        System.out.println(telefonas01);
//        telefonas01.skambink("8-656-00123");

        System.out.println();
        mobilus01.setSkambutis("Groja Jazz muzika");
        System.out.println(mobilus01);
        mobilus01.skambink("869926178");

        mobilus01.siuskZinute("6751349", "Hello world");
        mobilus01.fotografuok();
        mobilus01.fotografuok();
        mobilus01.fotografuok();

        System.out.println(mobilus01);

        System.out.println(taksofonas01);
        taksofonas01.skambink("Mama");

        taksofonas01.skambink("675875");
        taksofonas01.skambink("675411");
        taksofonas01.skambink("961181881");

        taksofonas01.papildykLikuti(0.5);
        System.out.println(taksofonas01);
        taksofonas01.skambink("67541331");
        taksofonas01.skambink("9611831881");
        System.out.println(taksofonas01);

        System.out.println();

        List<Object> telefonuSarasas = new ArrayList<>();

        Telefonas telefonas01 = new Mobilus("627277227", "72626622");
        Telefonas telefonas02 = new Taksofonas(2.9);

        telefonuSarasas.add(mobilus01);
        telefonuSarasas.add(mobilus02);
        telefonuSarasas.add(taksofonas01);
        telefonuSarasas.add(taksofonas02);
        telefonuSarasas.add(telefonas01);
        telefonuSarasas.add(telefonas02);
        telefonuSarasas.add('A');
        telefonuSarasas.add("ddd");
        telefonuSarasas.add(2345);

        ((Mobilus)telefonuSarasas.get(0)).skambink("45666");

        Mobilus mobilusTest = (Mobilus) telefonas01;
        mobilusTest.siuskZinute("9871552", "Sveiki");

        ((Mobilus)telefonas01).siuskZinute("71616611", "labas");
        ((Taksofonas)telefonas02).papildykLikuti(2.3);

        atpazinkTip(telefonas01);
        atpazinkTip(telefonas02);




    }

    private static void atpazinkTip(Telefonas telefonas) {

        if (telefonas instanceof Mobilus) {

            ((Mobilus) telefonas).siuskZinute("71616611", "labas");
        } else if (telefonas instanceof Taksofonas) {

        }
        ((Taksofonas) telefonas).papildykLikuti(2.3);


    }
}

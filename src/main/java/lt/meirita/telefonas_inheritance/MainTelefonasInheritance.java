package lt.meirita.telefonas_inheritance;

public class MainTelefonasInheritance {
    public static void main(String[] args) {
        Telefonas telefonas01 = new Telefonas("8-5-1231234");

        Mobilus mobilus01 = new Mobilus("8-555-111122", "123455");

        Taksofonas taksofonas01 = new Taksofonas(0.8);


        telefonas01.setSkambutis("Dzin-dzilin, dzin-dzilin");
        System.out.println(telefonas01);
        telefonas01.skambink("8-656-00123");

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




    }
}

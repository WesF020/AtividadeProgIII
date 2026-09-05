package singleton;

public class singletonTeste {
    public static void main(String [] args) {

        Configuration c1 = Configuration.getInstance();
        Configuration c2 = Configuration.getInstance();

        System.out.println(c1 == c2);           // essa parte deve retornar true. e está retornando o que se espera.
        System.out.println("\n");

        c1.setTema("Claro");                    // após trocar o tema de uma das configurações, ela afeta a outra.
        System.out.println(c2.getTema());       // aqui também retorna o tema como claro e não escuro.

    }

}

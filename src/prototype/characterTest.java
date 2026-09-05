package prototype;

public class characterTest {
    public static void main (String [] args) {
        GameCharacter guerreiro = new GameCharacter("Guerreiro", 240, 40, 50);

        GameCharacter guerreiro2 = guerreiro.clone();
        guerreiro2.setCategory("mago");
        guerreiro2.setMana(200);

        guerreiro.showCharacterInfo();
        guerreiro2.showCharacterInfo();

        System.out.println(guerreiro == guerreiro2);        // deve dar falso, e dará falso. o prototype "faz o oposto" do singleton.

    }
}

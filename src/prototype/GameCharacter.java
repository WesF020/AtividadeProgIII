package prototype;

public class GameCharacter implements Cloneable {
    private String category;
    private double money;
    private double strength;
    private double mana;

    public GameCharacter(String category, double money, double strength, double mana){
        this.category = category;
        this.money = money;
        this.strength = strength;
        this.mana = mana;
    }

    public String getCategory() {return category;}
    public double getMoney() {return money;}
    public double getStrength() {return strength;}
    public double getMana() {return mana;}

    public void setCategory(String category) {
        if (category != null) {
            this.category = category;
        } else throw new IllegalArgumentException("Erro! Insira um valor válido para tipo de personagem");
    }
    public void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        } else throw new IllegalArgumentException("Erro! O valor não pode estar abaixo de 0.");
    }
    public void setStrength(double strength) {
        if (strength > 0){
            this.strength = strength;
        } else throw new IllegalArgumentException("Erro! o valor da força deve estar acima de 0.");
    }
    public void setMana(double mana) {
        if (mana > 0) {
            this.mana = mana;
        } else throw new IllegalArgumentException("Erro! O valor da mana deve estar acima de 0.");
    }


    public void showCharacterInfo(){
        System.out.println("\n========INFO DO PERSONAGEM========");
        System.out.println("Categoria: " + getCategory());
        System.out.println("Dinheiro: " + getMoney());
        System.out.println("Força: " + getStrength());
        System.out.println("Mana: "+ getMana());
        System.out.println("=====================================\n");
    }

    @Override
    public GameCharacter clone(){
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


}
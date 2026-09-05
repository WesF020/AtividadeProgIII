package model;

public class Playstation extends Product {
    private String playstationEdition;      // Ex: Fat, Slim, Pro
    private int playstationStorage;
    private String playstationSeries;       // Ex: PS1, PS2, PS3, PS4, PS5

    public Playstation(String name, double price, int amount,
            String playstationEdition, int playstationStorage, String playstationSeries){
        super(name, price, amount);
        this.playstationEdition = playstationEdition;
        this.playstationStorage = playstationStorage;
        this.playstationSeries = playstationSeries;
    }

    public String getPlaystationEdition() {return playstationEdition;}
    public int getPlaystationStorage() {return playstationStorage;}
    public String getPlaystationSeries() {return playstationSeries;}

    public void setPlaystationEdition(String playstationEdition) {
        if (playstationEdition != null) {
            this.playstationEdition = playstationEdition;
        } else {
            throw new IllegalArgumentException("Erro! A Edição do Playstation não pode ser nula. ");
        }
    }
    public void setPlaystationStorage(int playstationStorage) {
        if (playstationStorage > 0){
            this.playstationStorage = playstationStorage;
        } else {
            throw new IllegalArgumentException("Erro! O valor do espaço do hard disk deve ser maior que 0.");
        }
    }
    public void setPlaystationSeries(String playstationSeries) {
        if (playstationSeries != null) {
            this.playstationSeries = playstationSeries;
        } else {
            throw new IllegalArgumentException("Erro! O modelo de série do Playstation não pode ser nulo");
        }
    }
}

package model;

public class PlaystationPortable extends Product {
    private double pspSize;
    private double pspStorage;
    private String pspColor;

    public PlaystationPortable(String name, double price, int amount, double pspSize,
                               double pspStorage, String pspColor) {
        super(name, price, amount);
        this.pspSize = pspSize;
        this.pspStorage = pspStorage;
        this.pspColor = pspColor;
    }

    public double getPspSize() {return pspSize;}
    public double getPspStorage() {return pspStorage;}
    public String getPspColor() {return pspColor;}

    public void setPspSize(double pspSize) {
        if (pspSize > 16.9) {
            this.pspSize = pspSize;
        } else {
            throw new IllegalArgumentException("O tamanho deve ser maior que 16.9cm.");
        }
    }
    public void setPspStorage(double pspStorage) {
        if (pspStorage > 0) {
            this.pspStorage = pspStorage;
        } throw new IllegalArgumentException("O valor da memória deve ser maior que 0gb. ");
    }
    public void setPspColor(String pspColor) {
        if (pspColor != null) {
            this.pspColor = pspColor;
        } else {
            throw new IllegalArgumentException("O nome da cor do PSP não pode ser nulo.");
        }
    }
}

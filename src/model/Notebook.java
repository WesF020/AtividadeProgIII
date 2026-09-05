package model;

public class Notebook extends Product {
    private double monitorSize;
    private String brandName;
    private String chassisColor;

    public Notebook (String name, double price, int amount, double monitorSize, String brandName, String chassisColor){
        super(name, price, amount);
        this.monitorSize = monitorSize;
        this.brandName = brandName;
        this.chassisColor = chassisColor;
    }

    public double getMonitorSize() {return monitorSize;}
    public String getBrandName() {return brandName;}
    public String getChassisColor() {return chassisColor;}

    public void setMonitorSize(int monitorSize) {
        if (monitorSize > 13.9) {
            this.monitorSize = monitorSize;
        } else {
            throw new IllegalArgumentException("Erro! O tamanho do monitor não pode ser abaixo de 13.9 polegadas.");
        }
    }
    public void setBrandName(String brandName) {
        if (brandName != null){
            this.brandName = brandName;
        } else {
            throw new IllegalArgumentException("Erro! O nome da marca não pode ser nulo.");
        }
    }
    public void setChassisColor(String chassisColor) {
        if (chassisColor != null) {
            this.chassisColor = chassisColor;
        } else {
            throw new IllegalArgumentException("Erro! A cor do chassis não pode ser nula.");
        }
    }
}

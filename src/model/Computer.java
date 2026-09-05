package model;

public class Computer extends Product {
    private String systemUnitName;
    private String powerSupplyName;

    public Computer (String name, double price, int amount, String systemUnitName, String powerSupplyName) {
        super(name, price, amount);
        this.systemUnitName = systemUnitName;
        this.powerSupplyName = powerSupplyName;
    }

    public String getSystemUnitName() {return systemUnitName;}
    public String getPowerSupplyName() {return powerSupplyName;}

    public void setSystemUnitName(String systemUnitName) {
        if (systemUnitName != null) {
            this.systemUnitName = systemUnitName;
        } else {
            throw new IllegalArgumentException("Erro! O nome do Gabinete não pode ser nulo. ");
        }
    }
    public void setPowerSupplyName(String powerSupplyName) {
        if (powerSupplyName != null) {
            this.powerSupplyName = powerSupplyName;
        } else {
            throw new IllegalArgumentException("Erro! O nome da fonte de energia não pode ser nulo.");
        }
    }
}
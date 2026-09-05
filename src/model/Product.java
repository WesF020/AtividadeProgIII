package model;

public abstract class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getAmount() {return amount;}

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Erro! O nome não pode estar nulo.");
        }
    }
    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        } else {
            throw new IllegalArgumentException("Erro! O preço não pode estar abaixo de 0.");
        }
    }
    public void setAmount(int amount) {
        if (amount > 0){
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Erro! Não pode cadastrar uma quantidade abaixo de 0.");
        }
    }
}




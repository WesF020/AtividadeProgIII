package abstractFactory;

import model.Computer;

public class ComputerNotaFiscal implements INotaFiscal {
    private final Computer computer;

    public ComputerNotaFiscal(Computer computer){
        this.computer = computer;
    }

    @Override
    public void exibirNotaFiscal(){
        System.out.println("\n==== NOTA FISCAL ====");
        System.out.println("Name: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Amount: " + computer.getAmount());
        System.out.println("System Unit: " + computer.getSystemUnitName());
        System.out.println("Power Supply: " + computer.getPowerSupplyName());
        System.out.println("============================");
    }
}

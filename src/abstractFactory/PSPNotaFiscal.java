package abstractFactory;

import model.PlaystationPortable;

public class PSPNotaFiscal implements INotaFiscal {
    private final PlaystationPortable playstationPortable;

    public PSPNotaFiscal(PlaystationPortable playstationPortable){
        this.playstationPortable = playstationPortable;
    }

    @Override
    public void exibirNotaFiscal() {
        System.out.println("\n==== NOTA FISCAL ====");
        System.out.println("Name: "  + playstationPortable.getName());
        System.out.println("Price: " + playstationPortable.getPrice());
        System.out.println("Amount: " + playstationPortable.getAmount());
        System.out.println("Product Size: " + playstationPortable.getPspSize());
        System.out.println("Storage: " + playstationPortable.getPspStorage());
        System.out.println("Color: " + playstationPortable.getPspColor());
        System.out.println("============================");
    }
}

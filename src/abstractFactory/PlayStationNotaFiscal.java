package abstractFactory;

import model.Playstation;

public class PlayStationNotaFiscal implements INotaFiscal {
    private final Playstation playstation;

    public PlayStationNotaFiscal(Playstation playstation){
        this.playstation = playstation;
    }

    @Override
    public void exibirNotaFiscal() {
        System.out.println("\n==== NOTA FISCAL ====");
        System.out.println("Name: " + playstation.getName());
        System.out.println("Price: " + playstation.getPrice());
        System.out.println("Amount: " + playstation.getAmount());
        System.out.println("PlayStation Edition: " + playstation.getPlaystationEdition());
        System.out.println("Storage: " + playstation.getPlaystationStorage());
        System.out.println("PlayStation Series: " + playstation.getPlaystationSeries());
        System.out.println("============================");
    }
}

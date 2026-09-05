import factory.ComputerFactory;
import factory.PlaystationFactory;
import factory.ProductStore;
import model.*;
import abstractFactory.*;

public class Client {
    public static void main(String[] args) {
        ProductStore computerStore = new ComputerFactory();

        Computer computer = (Computer) computerStore.getProduct("computador");
        INotaFiscal notaComputer = new ComputerNotaFiscal(computer);
        notaComputer.exibirNotaFiscal();

        Notebook notebook = (Notebook) computerStore.getProduct("notebook");
        INotaFiscal notaNotebook = new NotebookNotaFiscal(notebook);
        notaNotebook.exibirNotaFiscal();

        ProductStore playstationStore = new PlaystationFactory();

        Playstation playstation = (Playstation) playstationStore.getProduct("playstation");
        INotaFiscal notaPlaystation = new PlayStationNotaFiscal(playstation);
        notaPlaystation.exibirNotaFiscal();

        PlaystationPortable psp = (PlaystationPortable) playstationStore.getProduct("playstationportable");
        INotaFiscal notaPsp = new PSPNotaFiscal(psp);
        notaPsp.exibirNotaFiscal();
    }
}
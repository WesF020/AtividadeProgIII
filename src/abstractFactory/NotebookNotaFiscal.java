package abstractFactory;

import model.Notebook;

public class NotebookNotaFiscal implements INotaFiscal {
    private final Notebook notebook;

    public NotebookNotaFiscal(Notebook notebook){
        this.notebook = notebook;
    }

    @Override
    public void exibirNotaFiscal() {
            System.out.println("\n==== NOTA FISCAL ====");
            System.out.println("Name: " + notebook.getName());
            System.out.println("Price: " + notebook.getPrice());
            System.out.println("Amount: " + notebook.getAmount());
            System.out.println("Monitor Size: " + notebook.getMonitorSize());
            System.out.println("Brand Name: " + notebook.getBrandName());
            System.out.println("Chassis Color: " + notebook.getChassisColor());
            System.out.println("============================");
    }
}

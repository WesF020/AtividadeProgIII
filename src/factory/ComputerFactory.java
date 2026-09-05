package factory;

import model.*;

public class ComputerFactory extends ProductStore {
    @Override
    protected Product createProduct(String type) {
        if (type.equals("computador")){
            return new Computer("BluePC Rush", 4000, 1, "Redragon Superion", "Fonte Corsair");
        } else if (type.equals("notebook")){
            return new Notebook("Acer Aspire Go 15", 4500, 1, 16, "Acer", "Gray");
        } else return null;

    }

}

package factory;

import model.Playstation;
import model.PlaystationPortable;
import model.Product;

public class PlaystationFactory extends ProductStore {
    @Override
    protected Product createProduct(String type) {
        if (type.equals("playstation")){
            return new Playstation("PlayStation", 4566, 1, "Slim", 1000, "PS5");
        } else if (type.equals("playstationportable")){
            return new PlaystationPortable("PSP", 800, 1, 17, 300, "White");
        } else return null;

    }

}

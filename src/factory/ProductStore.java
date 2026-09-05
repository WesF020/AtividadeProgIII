package factory;

import model.Product;

public abstract class ProductStore {
    protected abstract Product createProduct(String type);

    public Product getProduct(String type){
        Product product = createProduct(type);
        product.getName();
        product.getPrice();
        product.getAmount();
        return product;

    }
}

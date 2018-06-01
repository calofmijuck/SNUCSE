/**
 * Created by tcs정원일 on 2017-11-09.
 */
abstract public class Product {
    protected String productName;
    protected double price;
    protected String descrip;

    public Product(String name, double price){
        productName = name;
        this.price = price;
    }

    abstract public String getDescription();   //return description of product

    abstract public String uniqueOperations();
    //concatenates strings returned by all methods that only exists in this class, not in the other classes.

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

}

/**
 * Created by tcs정원일 on 2017-11-09.
 */
public class FoodProduct extends Product {

    String freshness;
    FoodProduct(String name, double dnum){
        super(name, dnum);
    }
    public String getDescription(){
        return this.descrip;  //return description of product
    }

    public String uniqueOperations(){
        //concatenates strings returned by all methods that only exists in this class, not in the other classes.
        return this.getFreshness();
    }

    public String getFreshness(){
        //just return a String - "This [productName] is [freshness]!"
        //e.g.) This tomato is terrible!
        return "This " + this.productName + " is " + this.freshness;
    }
}

/**
 * Created by tcs정원일 on 2017-11-09.
 */
public class DeviceProduct extends Product {

    String operation;

    DeviceProduct(String name, double price){
        super(name, price);
    }

    public String getDescription(){
        return this.descrip; //return description of product
    }

    public String uniqueOperations(){

    //concatenates strings returned by all methods that only exists in this class, not in the other classes.
        //Concatenating order is the same as the order of methods in thie file.
        //demo -> operation
        return demo();
    }

    private String demo(){
    //return a String in this format
        //[productName] is working to [operation].
        //e.g.) Computer is working to run_java_program.
        return this.productName + " is working to " + operation;
    }

    private String operation(){
        return "Operation Name: " + operation; //just return "Operation Name: [operation]"
    }

}

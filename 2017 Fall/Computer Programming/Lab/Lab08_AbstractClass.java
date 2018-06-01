import java.io.File;
import java.util.Scanner;

public class Lab08_AbstractClass {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File(args[0]));
        int num_prod = sc.nextInt();
        sc.nextLine();
        Product[] res = new Product[num_prod];
        for(int i = 0; i < num_prod; i++){
            String prod_name = sc.next();
            double prod_price = sc.nextDouble();
            String prod_descrip = sc.next();
            String prod_op;
            if(prod_descrip.startsWith("Device:")){
                DeviceProduct device = new DeviceProduct(prod_name, prod_price);
                prod_op = sc.next();
                device.descrip = prod_descrip;
                device.operation = prod_op;
                res[i] = device;
            }
            else{
                FoodProduct food = new FoodProduct(prod_name, prod_price);
                prod_op = sc.next();
                food.descrip = prod_descrip;
                food.freshness = prod_op;
                res[i] = food;
            }
        }
        for(int i = 0; i < num_prod; i++){
            System.out.println(res[i].getProductName() + " " + res[i].getPrice() + " " + res[i].getDescription() + " " + res[i].uniqueOperations());
        }

    }
}

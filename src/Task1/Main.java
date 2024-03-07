package Task1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String location = "C:\\Users\\Dell\\Desktop\\popaqConnectApplication\\TaskOnChapter15\\src\\Task1\\Product.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(location) ){
            List<Product> listOfProduct = new ArrayList<>();
            listOfProduct.add(new Product("1","Sugar",100,5));
            listOfProduct.add(new Product("2","salt",150,10));
            listOfProduct.add(new Product("3","malt",200,15));
            listOfProduct.add(new Product("4","abcdefghijklmn",200,15));
            String data = "id       name        price       quantity" + "\n";
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);
            for(Product eachProduct: listOfProduct){
                String pro = String.format("%s          %s        %d          %d\n",
                        eachProduct.getId(), eachProduct.getName(), eachProduct.getPrice(), eachProduct.getQuantity());
                fileOutputStream.write(pro.getBytes());

            }




        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }


    }


}
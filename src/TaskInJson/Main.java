package TaskInJson;

import Task1.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String location = "C:\\Users\\Dell\\Desktop\\popaqConnectApplication\\TaskOnChapter15\\src\\TaskInJson\\JsonFIle";
        ObjectMapper mapper = new ObjectMapper();
        try(PrintStream printStream = new PrintStream(location)){
            List<Task1.Product> listOfProduct = new ArrayList<>();
            listOfProduct.add(new Task1.Product("1","Sugar",100,5));
            listOfProduct.add(new Task1.Product("2","salt",150,10));
            listOfProduct.add(new Product("3","malt",200,15));
            String json = mapper.writeValueAsString(listOfProduct);
            printStream.println(json);
        }catch (JsonProcessingException | FileNotFoundException exception){
            System.err.println(exception.getMessage());
        }

    }

}

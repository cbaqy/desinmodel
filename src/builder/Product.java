package builder;

import java.util.ArrayList;

public class Product {
    ArrayList<String> parts=new ArrayList<String>();

    public void addParts(String part) {
       parts.add(part);
    }

    public void show(){
        System.out.println("Create product");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }

}

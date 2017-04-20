package builder;

import java.util.ArrayList;

/**
 * Created by xuan on 4/20/17.
 */
public class Product {
    private ArrayList<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}

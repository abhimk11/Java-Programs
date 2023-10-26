package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private int weight;

    public Product(String name,int weight){
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {

        Product door = new Product("Wooden door",35);
        Product floorPanel = new Product("Floor Panel",25);
        Product window = new Product("Glass Window",10);

        Collection<Product> products = new ArrayList<>();
        products.add(floorPanel);
        products.add(window);
        products.add(door);

        List<String> nam= products.stream().sorted(Comparator.comparingInt(Product::getWeight)).map(e->e.getName()).collect(Collectors.toList());
        System.out.println(nam);

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()){
            Product product = iterator.next();
            if (product.getWeight()>20){
                iterator.remove();
            }
        }

        System.out.println(products);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ABHI");
        map.put(2,"MK");

        if (map.containsKey(2)){
            map.remove(3);
        }
        System.out.println(map);
    }

}

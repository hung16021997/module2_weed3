package javacollectionframework.luyentap.src;

import java.util.*;

public class ProductManager extends Product {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productArrayList = new ArrayList<Product>();
    public static void add(String code,String name,int price) {
        Product newProduct = new Product(code,name,price);
        productArrayList.add(newProduct);
    }
    public static void showProductList() {
        for (Product item :
                productArrayList) {
            System.out.printf("Code: %3s; Name: %10s; Price: %7d \n",item.getCode(),item.getName(),item.getPrice());
        }
    }
    public static void editProduct(String code,String name,int price) {
        Product newProduct = new Product(code,name,price);
        if (isContain(code)) {
            int index = productArrayList.indexOf(getProductByCode(code));
            productArrayList.remove(index);
            productArrayList.add(index,newProduct);
        } else {
            throw new RuntimeException("Không có sản phẩm");
        }
    }
    static boolean isContain(String code) {
        for (Product item : productArrayList) {
            if (item.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
    static Product getProductByCode(String code) {
        for (Product element : productArrayList) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        throw new RuntimeException("Valid code");
    }
    static void searchByName(String name){
        String result ="";
        for(Product element:productArrayList){
            if(element.getName().equals(name)){
                System.out.print("Product founded: ");
                result += "Code:"+element.getCode()+"; Name: "+element.getName()+"; Price: "+element.getPrice();
                break;
            }
        }
        if(result != "") System.out.println(result);
        else System.out.println("Product not found");
    }
    static void remove(String code){
        int count =0;
        for(Product element:productArrayList){
            if(element.getCode().equals(code)){
                count++;
                productArrayList.remove(element);
                break;
            }
        }
        if(count ==0) System.out.println("Product not found");
        else System.out.println("Product have deleted");
    }
    static void sortIncreasing(){
        Map<Integer,Product> lists = new TreeMap<Integer,Product>();
        for (Product element:productArrayList) {
            lists.put(element.getPrice(),element);
        }
        Set<Integer> keys = lists.keySet();
        for (Integer key: keys){
            System.out.println("Price: " + key + ": Name: " + lists.get(key).getName()+"; Code: "+lists.get(key).getCode());
        }
    }
    static void sortDecreasing(){
        TreeMap<Integer,Product> lists = new TreeMap<Integer, Product>();
        for (Product element:productArrayList) {
            lists.put(element.getPrice(),element);
        }
        NavigableMap revertMap = lists.descendingMap();
        Set<Integer> keys = revertMap.keySet();
        for (Integer key: keys){
            System.out.println("Price: " + key + ": Name: " + lists.get(key).getName()+"; Code: "+lists.get(key).getCode());
        }
    }
}

package javacollectionframework.luyentap.src;

public class Test extends ProductManager {
    public static void main(String[] args) {
        add("001","Bánh quy",35000);
        add("002","Bánh kem",40000);
        add("003","Bánh trứng",50000);
        add("004","Bánh gạo",25000);
        add("005","Bánh chocopice",60000);
        showProductList();
        searchByName("Bánh trứng");
        remove("004");
        System.out.println("IncreasingSort");
        sortIncreasing();
        System.out.println("DecreasingSort");
        sortDecreasing();
    }
}

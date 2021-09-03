public class Motorcycle {
    private int price;
    private String model;
    private double capacity;
    private int productionYear;
    private char size;

    public Motorcycle (int price, String model, double capacity, int productionYear, char size){
        this.price = price;
        this.model = model;
        this.capacity = capacity;
        this.productionYear = productionYear;
        this.size = size;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

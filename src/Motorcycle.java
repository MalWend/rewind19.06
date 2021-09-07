public class Motorcycle {
    private double price;
    private String model;
    private double capacity;
    private int productionYear;
    private char size;

    public Motorcycle(double price, String model, double capacity, int productionYear, char size) {
        this.price = price;
        this.model = model;
        this.capacity = capacity;
        this.productionYear = productionYear;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void printInformation() {
        System.out.println("Rozmiar motoru: " + this.size);
        System.out.println("Cena motoru: " + this.price);
        System.out.println("Pojemność: " + this.capacity);
        System.out.println("Model: " + this.model);
        System.out.println("Rok produkcji: " + this.productionYear);
    }

    public boolean checkIfBMW() {
        if (this.model == "BMW") {
            this.price = this.price + 5000;
            return true;
        } else {
            return false;
        }
    }
    public void checkValueRange(){
        if(this.price> 10000 & this.price < 20000){
            System.out.println("Cena jest w przedziale 10000 do 20000");
                    }
        else{
            System.out.println("Cena nie jest w przedziale 10000 do 20000");
        }
    }
    public double changeToDollar(double dollarCurrency){
        return  this.price = this.price*dollarCurrency;
    }
}


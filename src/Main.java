public class Main {
    public static void main(String[] args) {

        Motorcycle Alpha = new Motorcycle(1234, "Beta", 1.0, 2005,'m');
        Alpha.getPrice();
        Alpha.setPrice(2000);
        Alpha.getPrice();

        Alpha.printInformation();
        Alpha.checkIfBMW();
        Alpha.setModel("BMW");
        Alpha.checkValueRange();
        Alpha.setPrice(19999);
        Alpha.checkValueRange();
    }


}

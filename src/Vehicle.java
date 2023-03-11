public class Vehicle {
    public String modelName;
    public int whealsCount;

    public Vehicle(String modelName, int whealsCount) {
        this.modelName = modelName;
        this.whealsCount = whealsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

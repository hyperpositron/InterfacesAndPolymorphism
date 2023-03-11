public class Car extends Vehicle {
//    public String modelName;
//    public int whealsCount;
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }
    public void checkEngine() {
        System.out.println("Проверяем Двигатель");
    }
    public Car(String name, int wheal) {
        super(name, wheal);
    }

}

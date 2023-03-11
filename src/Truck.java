public class Truck extends Car {
//    public String modelName;
//    public int wheelsCount;
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public Truck (String name, int wheal) {
        super(name, wheal);
    }
}

public class Truck extends Car {
    public void check()  {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

    public Truck (String name, int wheal) {
        super(name, wheal);
    }
}

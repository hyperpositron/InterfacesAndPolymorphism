public class Car extends Vehicle implements Checkable{

    public void check() {
        System.out.println("Проверяем Двигатель");
    }
    public Car(String name, int wheal) {
        super(name, wheal);
    }

}

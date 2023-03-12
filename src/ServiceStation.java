public class ServiceStation {
    private void checkVehicle(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
        public void check (Bicycle bicycle){
            checkVehicle(bicycle);
        }
        public void check (Car car){
            checkVehicle(car);
            car.check();

        }
        public void check (Truck truck){
            checkVehicle(truck);
            truck.check();
        }
    }



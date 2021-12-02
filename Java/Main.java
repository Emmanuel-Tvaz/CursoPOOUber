class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("TPYHt123", new Account("Emmanuel Torres", "EMM123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("TPYHtA3", new Account("Eloisa Cruz", "ELO123"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}
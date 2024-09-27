public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        Bicycle bike = new Bicycle();
        bike.go();
        myCar.go();
        System.out.println(myCar.speed);

        System.out.println(myCar.gears);
        System.out.println(bike.wheels);
    }
}

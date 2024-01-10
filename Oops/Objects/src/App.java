
public class App {
    public static void main(String[] args){
        objectPassing();
    }

    static void objectPassing(){
        Garage myGarage = new Garage();
        Car[] myCollection = new Car[3];

        Car myFirstCar = new Car("Porsche");
        Car mySecondCar = new Car("Lamborghini");
        Car myThirdCar = new Car("Bugatti");

        myCollection[0] = myFirstCar;
        myCollection[1] = mySecondCar;
        myCollection[2] = myThirdCar;

        myGarage.Park(myCollection[0]);
    }

    static void arrayOfObjects(){
        Human[] friends = new Human[2];
        
        Human shivam = new Human("Shivam",19,70,"Black");
        Human dhruv = new Human("Dhruv",19,55,"white");

        friends[0] = shivam;
        friends[1] = dhruv;

        System.out.println(friends[0].name);
        System.out.println(friends[1].name);
        System.out.println();
    }

    static void spiderMan(){
        Tobey tobey = new Tobey();
        tobey.speak();
    }

    static void humanFunc(){
        Human human = new Human("Gepard",20,70,"White");
        System.out.println(human.name);
        human.eat();
        human.drink();
    }   

    static void carFunc(){
        Car myCar = new Car();
        System.out.println(myCar.color);
        System.out.println(myCar.name);
        myCar.drive();
        myCar.stop();
    }
}

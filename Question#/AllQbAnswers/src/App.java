public class App {
    public static void main(String[] args) throws Exception {
        superHeros();
    }

    public static void superHeros(){

        Hero hero = new Hero("Sasha");
        Hero heroAnother = new Hero("Dhruv");
        System.out.println("The superheros");
        System.out.println(hero.getSuperHeroName());
        System.out.println(heroAnother.getSuperHeroName());
    }

    public static void constructorsExample () {
        Constructors firstStudent = new Constructors("Dhruv", "Parmar");
        Constructors secondStudent = new Constructors("Sasha", "Oleksandra");

        final String firstStudentName = firstStudent.getFullName();
        final String secondStudentName = secondStudent.getFullName();

        System.out.println(firstStudentName + " loves " + secondStudentName);
    }

}

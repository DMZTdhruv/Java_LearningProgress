import package1.A;

public class App extends A {
    public static void main(String[] args)  {
        App app = new App();
        System.out.println(app.getClass());     
        System.out.println("Hello, World!");
    }
}

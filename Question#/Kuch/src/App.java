class Animal {
    public String type = "Animal";
    public void typeOfIdk() {
        System.out.println("haha " + type);
    }
};



public class App extends Animal {


    public void invokeSuperClassMethod() {
        super.typeOfIdk();
        System.out.println(super.type);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        app.invokeSuperClassMethod();
        
    }
}

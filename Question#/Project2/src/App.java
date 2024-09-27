public class App {
    public static void main(String[] args) throws Exception {

    }

    public void idk(){
        Greetings greeting = new Greetings() {
            @Override
            public void welcome () {
                System.out.println("Yo bro");
            }
        };

        Greetings greeting2 = new Greetings();

        greeting.welcome();
        greeting2.welcome();
    }


}


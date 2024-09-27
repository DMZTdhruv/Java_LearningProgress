public class App {
    public static void main(String[] args) {
        Car porshe = new Car();
        System.out.println("\n\nPorsche enginners knew exactly what there objective was");
        porshe.setMake("Porsche");
        porshe.setModel("911gt3rs");
        porshe.setYear(2020);

        System.out.println(porshe.getMake());
        System.out.println(porshe.getModel());
        System.out.println(porshe.getYear());
    }
}

public class Hero extends Human{
    Hero(String name){
      super(name);
    }

    public String getSuperHeroName() {
      return getHumanName();
    }
}

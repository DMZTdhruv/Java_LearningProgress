package utility;

public class Password {
  
  private String randomCharacter[] = {"Q","W","E","R","T","Y","A","S","D","F","G","H","J","K","L","M","N","B","V","C","X","Z"};
  private int randomNumber[] = {1,2,3,4,5,6,7,8,9,10};
  private String randomSymbols[] = {"!","@","#","$","%","^","&","*","(",")"};

  public String getRandomChar() {
    int random = (int)(Math.random() * randomCharacter.length);
    return randomCharacter[random];
  }

  public int getRandomNumber() {
    int random = (int)(Math.random() * randomNumber.length);
    return randomNumber[random];
  }

  public String getRandomSymbols() {
    int random = (int)(Math.random() * randomSymbols.length);
    return randomSymbols[random];
  }

}

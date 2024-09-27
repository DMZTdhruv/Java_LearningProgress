package CarClasses;

public class Car {
  public String modelName;
  public Number marketPrice;
  private Number real_price; 
  private Number totalPrice;

  public Car(String modelName, Number marketPrice){
    this.modelName = modelName;
    this.marketPrice = marketPrice;
    this.real_price = marketPrice.intValue() - (marketPrice.intValue() / 10);
    this.totalPrice = (int) (marketPrice.intValue() + (marketPrice.intValue() * 0.30));
  }

  public void carDetails(){
    System.out.println(this.modelName);
    System.out.println("marketPrice: " + marketPrice);
    System.out.println("real_price: " + real_price);
    System.out.println("totalPrice with gst: " + totalPrice) ;
  }
  
}

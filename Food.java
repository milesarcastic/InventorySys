package inventorytry;

public class Food{
  String foodName;
  int foodPrice, foodQuantity, foodCode, qty;

  public Food(int foodCode, String foodName, int foodPrice, int foodQuantity)
  {
    this.foodCode = foodCode;
    this.foodName = foodName;
    this.foodQuantity = foodQuantity;
    this.foodPrice = foodPrice;
  }
    public void setFoodCode(int foodCode){
      this.foodCode = foodCode;
    }
    public void setFoodName(String foodName){
      this.foodName = foodName;
    }
    public void setFoodQuantity(int foodQuantity){
      this.foodQuantity = foodQuantity;
    }
    public void setFoodPrice(int foodPrice){
      this.foodPrice = foodPrice;
    }

    public int getFoodCode(){
      return foodCode;
    }
    public String getFoodName(){
      return foodName;
    }
    public int getFoodQuantity(){
      return foodQuantity;
    }
    public void setDeductQuantity(int qty)
    {
        this.qty = qty;
    }
    public int getDeductQuantity(){
      return foodQuantity-=qty;
    }
    public int getFoodPrice(){
      return foodPrice;
    }

}
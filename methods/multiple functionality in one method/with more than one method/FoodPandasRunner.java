class FoodPandasRunner{
public static void main(String output[]){
  String foodItem = "Pumpkin Seeds";
  int quantity = 56;
  double price=FoodPandas.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
   double quantityprice=FoodPandas.takeOrder(foodItem,quantity);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+quantityprice);
   else
   System.out.println("  ");
 }

}
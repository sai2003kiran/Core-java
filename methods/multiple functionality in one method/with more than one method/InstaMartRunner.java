class InstaMartRunner{
public static void main(String output[]){
  String foodItem = "Waffle Mix";
  int quantity = 76;
  double price=InstaMart.takeOrder(foodItem);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+price);
   else
   System.out.println("  ");
   double quantityprice=InstaMart.takeOrder(foodItem,quantity);
   if(price!=0.0)
   System.out.println(foodItem+" as comtaining rupees "+quantityprice);
   else
   System.out.println("  ");
 }

}
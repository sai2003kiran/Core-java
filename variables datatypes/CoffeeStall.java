class CoffeeStall{
static String name = "babaji's tea stall";
 public static void main(String coffee[]){
 CoffeeStall.correct();
 }
 public static void correct(){
 System.out.println("the name before re-initialization :"+name);
 // while using re-init we use samevariable = "refrences";
 name = "Babu's tea stall";
 System.out.println("the name after re-initialization :"+name);
 }
}
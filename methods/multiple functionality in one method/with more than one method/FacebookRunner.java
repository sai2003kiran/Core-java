class FacebookRunner{
 public static void main (String login[]){
 long phoneNumber = 10l;
 String email ="baba@gmail.com";
 String password="12345";
 String loginEmail=Facebook.signUp(email,password);
 System.out.println(loginEmail);
 String loginphoneNumber=Facebook.signUp(phoneNumber,password);
 System.out.println(loginphoneNumber);
 }
}
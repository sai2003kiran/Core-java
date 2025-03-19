class LinkedIn{
 public static String UserProfile(String fristName,String middleName, String lastName, String dob,String email,String password){
 String details = null;
 boolean validation = verification(fristName,middleName,lastName,dob,email,password);
 if(validation==true){
  details="UserProfile is Updated";
 }else{
 details="UserProfile is UnSuccessful";
 }
 return details;
 }
 
 public static boolean verification(String fristName,String middleName, String lastName, String dob,String email,String password){
 boolean isFristName = false;
 boolean isLastName = false;
 boolean isMiddleName = false;
 boolean isDob = false;
 boolean isEmail = false;
 boolean isPassword = false;
 boolean isCrossCheck = false;
 if (fristName!=null && !fristName.isEmpty() && fristName.length()>=3){
  isFristName=true;
 }else{
  isFristName=false;
  System.out.println("Incorrect fristName");
 }
 
 if (middleName!=null && !middleName.isEmpty() && middleName.length()>=3){
  isMiddleName=true;
 }else{
  isMiddleName=false;
  System.out.println("Incorrect middleName");
 }
 
 if (lastName!=null && !lastName.isEmpty() && lastName.length()>=1){
  isLastName=true;
 }else{
  isLastName=false;
  System.out.println("Incorrect lastName");
 }
 
 if(dob!=null &&!dob.isEmpty() && dob.length()>=8 && dob.length()<=10){
   isDob=true;
 }else{
  isDob=false;
  System.out.println("Incorrect Dob");
 }
 
  
 if(email!=null && !email.isEmpty() && email.length()>=13){
   isEmail=true;
 }else{
  isEmail=false;
  System.out.println("Incorrect email");
 }
 
 if(password!=null && !password.isEmpty() &&password.length()>=8 && password.length()<=10){
   isPassword=true;
 }else{
  isPassword=false;
  System.out.println("Incorrect password");
 }
 
 if(isFristName==true && isMiddleName==true && isLastName==true && isDob==true && isEmail==true && isPassword==true){
  isCrossCheck=true;
 }else{
 isCrossCheck=false;
 System.out.println("verification failed");
 }
 
 return isCrossCheck;
 }
 
}
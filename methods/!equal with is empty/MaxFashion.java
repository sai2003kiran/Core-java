class MaxFashion{
 
 public static String signup(String fristName,String lastName,String dob,String email,String gender,String phoneNumber){
  String details = null;
  boolean validation = verificationOfDetails(fristName,lastName,dob,gender,email,phoneNumber);
  if(validation==true){
    System.out.println("the signup is Successful");
	System.out.println("Thank you have a good Day");
  }else{
      System.out.println("the signup is UnSuccessful...please try again");
  }
  return details;
 }
 
 public static boolean verificationOfDetails(String fristName,String lastName,String dob,String email,String gender,String phoneNumber){
  boolean isUservalid = false;
  boolean isFristName = false;
  boolean isLastName = false;
  boolean isPhoneNumber = false;
  boolean isEmail = false; 
  boolean isDob = false;
  boolean isGender = false; 

  if(fristName!=null && fristName.length()>=3 && fristName.isEmpty()){
  isFristName=true;
  }else{
  isFristName=false;
  System.out.println("invalid fristName..Please try again");
  }
  
  if(lastName!=null && lastName.length()>=1 && lastName.isEmpty()){
  isLastName=true;
  }else{
  isLastName=false;
  System.out.println("invalid lastName..Please try again");
  }  
  
  if(phoneNumber!=null && phoneNumber.isEmpty() && phoneNumber.length()>0 && phoneNumber.length()== 10){
  isPhoneNumber=true;
  }else{
  isPhoneNumber=false;
  System.out.println("invalid phoneNumber..Please try again");
  }
  
  if(dob!=null && !dob.isEmpty()){
  isDob=true;
  }else{
  isDob=false;  
  System.out.println("invalid Dob..Please try again");
  }
  
  if(gender!=null && !gender.isEmpty()){
  isGender=true;
  }else{
  isGender=false;
  System.out.println("invalid Gender..Please try again");
  }
  
  if(email!=null && !email.isEmpty()){
  isEmail=true;
  }else{
  isEmail=false;
  System.out.println("invalid Email..Please try again");
  }
  
  if(isFristName==true && isLastName==true && isPhoneNumber==true && isDob==true && isGender ==true && isEmail== true){
   isUservalid=true;
  }
  return isUservalid;
 }
}
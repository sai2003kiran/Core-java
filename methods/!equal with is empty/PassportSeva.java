class PassportSeva{
 public static String UserRegister(String passportoffice,String fullName,String surName,String dob,String emailId,String loginId,String password,String conformPassword,String captcha,String hintQues,String hintAns){
 String details = null;
 boolean isverification=registerValidation(passportoffice,fullName,surName,dob,emailId,loginId,password,conformPassword,captcha,hintQues,hintAns);
 if (isverification==true){
   details="UserRegister is Successful";
 }else{
    details="UserRegister is UnSuccessful";
 }
 return details;
 }
 
 public static boolean registerValidation(String passportoffice,String fullName,String surName,String dob,String emailId,String loginId,String password,String conformPassword,String captcha,String hintQues,String hintAns){
  boolean isValid = false;
  boolean isPassportoffice = false;
  boolean isFullName = false;
  boolean isSurName = false;
  boolean isDob = false;
  boolean isEmailId = false;
  boolean isLoginId = false;
  boolean isPassword = false;
  boolean isConformPassword = false;
  boolean isCaptcha = false;
  boolean isHintQues = false;
  boolean isHintAns = false;
  String message =null;
  
  if(passportoffice!=null && passportoffice.isEmpty() && passportoffice.length()>=3 && passportoffice.length()<=45){
   //re-initiazation
   isPassportoffice = true;
  }else{
  isPassportoffice = false;
  System.out.println("incorrect passportoffice address");
  System.out.println("please mention the correct passportoffice address");
  }
  
  
  if(fullName!=null && fullName.isEmpty() && fullName.length()>=3 && fullName.length()<=45){
   isFullName = true;
  }else{
   isFullName = false;
   System.out.println("incorrect fullName input...please try again correctly");
  }
  
  if(surName!=null && surName.isEmpty() && surName.length()>=1 && surName.length()<=45){
   isSurName = true;
  }else{
   isSurName = false;
   System.out.println("incorrect surName input...please try again correctly");
  }
  
  if(dob!=null && !dob.isEmpty()){
   isDob = true;
  }else{
   isDob = false;
   System.out.println("incorrect dob input...please try again correctly");
  }
  
  if(emailId!=null && !emailId.isEmpty()){
   isEmailId = true;
  }else{
   isEmailId = false;
   System.out.println("incorrect dob input...please try again correctly");
  }
  
  if(loginId!=null && !loginId.isEmpty() && loginId==emailId){
	   System.out.println("entered the loginId is same as emailId");
	   isLoginId=true;
  }else if(loginId!=emailId){
       System.out.println("entered the loginId is different as emailId");
	   isLoginId=true;
  }else{
	  isLoginId = false;
      System.out.println("incorrect dob input...please try again correctly");
  }
  
  if(password!=null && !password.isEmpty() && password.length()>=8 && password.length()<=10){
   isPassword=true;
  }else{
   isPassword=false;
   System.out.println("incorrect password input...please try again correctly");
  }
  
  if(conformPassword==password){
    isConformPassword=true;
  }else{
    isConformPassword=false;   
	System.out.println("incorrect conformpassword input...please try again correctly");	
  }
  
  if(captcha=="YRd32Ef" && !captcha.isEmpty()){
    isCaptcha=true;
  }else{
    isCaptcha=false;   
	System.out.println("incorrect captcha input...please try again correctly");	
  }
  
  if(hintQues=="what is favorate clour" && !hintQues.isEmpty()){
	  isHintQues=true;
  }else{
	  isHintQues=false;
   	System.out.println("incorrect Question input...please try again correctly");	
  }
  
  if(hintAns!=null && hintAns.length()>=3 &&!hintAns.isEmpty()){
	  isHintAns=true;
  }else{
	  isHintAns=false;
	  	System.out.println("incorrect colour input...please try again correctly");	
  }
  
  if(isPassportoffice==true && isFullName==true && isSurName==true && isDob==true && isEmailId==true && isLoginId==true && isPassword==true && isConformPassword==true && isCaptcha==true && isHintQues==true && isHintAns==true){
   isValid=true;
  }else{
   isValid=false;
   System.out.println("Validation failed");
  }
  
  return isValid;
 }
 
}

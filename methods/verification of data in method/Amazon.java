class Amazon{
 public static String signup(String fullName, String surName, String phoneNumber, String dob,String gender){
  String details = null;
  boolean isvalidation=verify(fullName,surName,phoneNumber,dob,gender);
  if(isvalidation==true){
  details="user signup Successful";
  }else{
  details="user signup UnSuccessful";
  }
  return details;
 }
 
 public static boolean verify(String fullName, String surName, String phoneNumber, String dob,String gender){
  boolean isInfo = false;
  boolean isFullName = false;
  boolean isSurName =false;
  boolean isPhoneNumber = false;
  boolean isDob = false;
  boolean isGender = false;
  
  if(fullName!=null && fullName.length()>=3){
   isFullName=true;  
  }else{
   isFullName=false;
   System.out.println("incorrect fullName");
  }
  
  if(surName!=null && surName.length()>=1){
   isSurName=true;  
  }else{
   isSurName=false;
   System.out.println("incorrect SurName");
  }
  
  if(phoneNumber!=null && phoneNumber.length()==10){
   isPhoneNumber=true;  
  }else{
   isPhoneNumber=false;
   System.out.println("incorrect phoneNumber");
  }
  
  if(dob!=null){
  isDob=true;
  }else{
  isDob=false;
   System.out.println("incorrect Dob");
  }
  
  if(gender!=null){
  isGender=true;
  }else{
  isGender=false;
   System.out.println("incorrect Gender");
  }
  
  if(isFullName==true && isSurName==true && isPhoneNumber==true && isDob==true && isGender==true){
  isInfo=true;
  }else{
  isInfo=false;
  System.out.println("verify failed");
  }
  
  return isInfo;
 }
 
}
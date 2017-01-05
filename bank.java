class Bank{
void fillForm(){
System.out.println("Form: 1.Id 2.Address");
}
void submitProof(String id,String address){
System.out.println("Proof: id="+id+" address="+address);
}
long giveAccount(){
return 54572;
}
String depositAmt(double amount){
System.out.println("Amount deposited is "+amount);
return "deposited";
}
}

class Customer{
public static void main(String args[]){
Bank bofa=new Bank();
bofa.fillForm();
bofa.submitProof("a7321k","Baresford ave,Milpitas,CA");
System.out.println("Given account num is: "+bofa.giveAccount());
System.out.println("Amount "+bofa.depositAmt(1500));
}
}
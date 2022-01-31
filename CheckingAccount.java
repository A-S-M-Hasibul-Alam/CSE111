public class CheckingAccount extends Account{
  CheckingAccount(String n, double d){
    super(n);
    setBalance(d);
  }
  public void printAccountInfo(){
    System.out.println("======================================="+"\n"+"Name : "+getName()+"\n"+"Account Number : "+getAccountNumber()+"\n"+"Balance : "+getBalance());
    if(getBalance()<500){
      System.out.println("Your balance is less than the minimum amount");
    }
    System.out.print("======================================="+"\n");
  }
  public String deposit(double n){
    if(n>0){
      double q = getBalance()+n;
      setBalance(q);
      return "deposit successfull";
    }
    else{
      return "Please enter amount greater than Zero";
    }
  }
  public String withdraw(double w){
    if(w>getBalance()){
      return "You do not have enough funds";
    }
    else{
      if(w==0){
        return "Please enter amount greater than Zero";
      }
      else{
        double e = getBalance()-w;
        setBalance(e);
        return "Withdraw successfull";
      }
    }
  }
}
  
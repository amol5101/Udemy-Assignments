package OOP.Inheritance;

class account{
    // properties
    private String accNo;
    private String name;
    protected long balance = 0;
    private String address;
    private String phNo;

    // getter and setter methods
    String getAccNo() {return accNo;}
    String getName(){return name;}
    long getBalance(){return balance;}
    String getAddress(){return address;}
    String getPhNo(){return phNo;}

    void setAddress(String addrs){
        address = addrs;
    }
    void setPhNo(String no){
        phNo = no;
    }

    // constructors
    account(String accNo, String name, String address, String phNo){
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
    }

    // methods
    String closeAcc(){
        return "Your account is closed";
    }
}

class savingAccount extends account{
    // methods
    String deposite(int x){
        balance += x;
        return x+" Rs successfully deposited.\nAvailable balance is " + balance;
    }
    String withdraw(int x){

        return "The withdrawal of Rs. " + x + " is successfully completed.\nAvailable balance is " + balance;
    }
//    String fixedDeposit(int amt, int duration){
//        return "FD of Rs. " + amt + " is done for " + duration + " years.";
//    }
//    String liquidate(){
//        return "Your FD is liquidated";
//    }
}

class loanAccount extends account{
    // methods
    String payEmi(int amt){
        balance -= amt;
        return "Your EMI of " + amt + " is successfully paid.\nYour remaining loan amount is " + balance;
    }
}

public class bankAccount {
    public static void main(String[] args){

    }
}

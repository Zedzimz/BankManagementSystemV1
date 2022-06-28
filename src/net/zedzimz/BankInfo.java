package net.zedzimz;

public class BankInfo {

    // Have list of customers, their checking account numbers, and maximum overdraw limit

    public String customerName =;
    public String checkingAccountNumber;
    public int maxOverdraw;

    public BankInfo(String customerName, String checkingAccountNumber, int maxOverdraw) {
        this.customerName = customerName;
        this.checkingAccountNumber = checkingAccountNumber;
        this.maxOverdraw = maxOverdraw;


    }

}

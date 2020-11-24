package classstructureintegrate;


public class BankAccount {
    private String accountNumber, owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Értesítés jóváírásról: " + owner + " ügyfelünk " + accountNumber + " számú bankszámlájának új egyenlege " + balance + " Ft.");

    }

    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Értesítés terhelésről: " + owner + " ügyfelünk " + accountNumber + " számú bankszámlájának új egyenlege " + balance + " Ft.");

    }

    //A getInfo() metódus a számla adatait az alábbi formában adja vissza Stringként:
    //Tóth Kálmán (10073217-12000098-67341590): 103400 Ft

    public String getInfo(){

        return owner + " (" + accountNumber + "): " + balance + " Ft";

    }

    public void transfer(BankAccount to, int amount){
        System.out.println("Az átutalás előtti számlainformációk:");
        String beforeTransferInfoFrom = this.getInfo();
        String beforeTransferInfoTo= to.getInfo();
        System.out.println(beforeTransferInfoFrom);
        System.out.println(beforeTransferInfoTo);
        this.withdraw(amount);
        to.deposit(amount);
        System.out.println(amount + " Ft összeget" + " átutaltunk a " + this.getAccountNumber() + " számlaszámról a " + to.getAccountNumber() + " számlaszámra.");
        System.out.println("Az átutalás utáni számlainformációk:");
        String afterTransferInfoFrom = this.getInfo();
        String afterTransferInfoTo = to.getInfo();
        System.out.println(afterTransferInfoFrom);
        System.out.println(afterTransferInfoTo);


    }




}

class Account{
    int accountNo;
    int balance;

    Account(){
        this.accountNo = 0;
        this.balance = 0;
    };

    void deposit(Account obj, int amount){
        obj.balance+=amount;
    }

    void withdraw(Account obj, int amount){
        obj.balance-=amount;
    }
}

class TransactionDeposit extends Thread {
    Account obj;
    int amount;
    TransactionDeposit(Account obj, int amount) {
        this.obj = obj;
        this.amount = amount;
    }
    @Override
    public synchronized void start() {
        this.obj.balance+=amount;
        System.out.println("The amount deposited now balance: "+obj.balance);
        super.start();
    }
}

class TransactionWithdraw extends Thread {
    Account obj;
    int amount;
    TransactionWithdraw(Account obj, int amount) {
        this.obj = obj;
        this.amount = amount;
    }
    @Override
    public synchronized void start() {
        this.obj.balance-=amount;
        System.out.println("The amount withdrawn now balance: "+obj.balance);
        super.start();
    }
}

class Transact {
    public static void main(String[] args) {
        Account abc = new Account();
        abc.accountNo = 1;
        abc.balance = 500;
        TransactionDeposit t1;
        TransactionWithdraw t2;
        t1 = new TransactionDeposit(abc, 200);
        t2 = new TransactionWithdraw(abc, 300);
        t1.start();
        t2.start();
    }
}
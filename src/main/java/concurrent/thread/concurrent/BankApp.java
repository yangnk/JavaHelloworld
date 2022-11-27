package concurrent.thread.concurrent;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-23 16:45
 **/
public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        for (int i = 0; i < 5; i++) {
            new Thread(new BankAppThread(bank)).start();
        }
        try {
            Thread.sleep(10000);
            System.out.println("=====当前金额：" + bank.queryMoney());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}

class BankAppThread implements Runnable {
    Bank bank;

    public BankAppThread(Bank bank) {
        this.bank = bank;

    }

    @Override
    public void run() {
//            super.run();
        bank.getMoney(1);
        bank.setMoney(1);
        bank.queryMoney();
    }
}

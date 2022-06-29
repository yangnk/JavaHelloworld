package concurrent.thread.concurrent;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-23 16:20
 **/
public class Bank {
    private int money;

    //取钱
    synchronized int getMoney(int getMoney) {
        money -= getMoney;
        System.out.println("当前线程：" + Thread.currentThread().getName());
        System.out.println("取钱后金额：" + money);
        return money;
    }
    //存钱
    synchronized void setMoney(int setMoney) {
        money += setMoney;
        System.out.println("当前线程：" + Thread.currentThread().getName());
        System.out.println("存钱后金额：" + money);
    }

    //查询余额
    int queryMoney() {
        System.out.println("账户金额：" + this.money);
        return money;
    }
}

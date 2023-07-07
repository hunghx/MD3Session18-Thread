package ra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
    private static Account  account = new Account();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new AddAPennyyTask());
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){ // kiẻm tra tất cả các luồng đã thực thi xong chưa
        }
        System.out.println("số dư tài khaonr sau 1000 lần nạp tiền : "+account.getBalance());
    }
   static class AddAPennyyTask implements Runnable{
        @Override
        public void run() {
            account.deposit(2);
        }
    }
}


class Account{
    private int balance = 0;
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance = balance+amount;
    }
}

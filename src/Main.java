public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        // tạo các luồng
        // cách 1 : kế thừa Thread.
        Thread mt1 = new MyThread();
        mt1.start();
        mt1.join();
        // cách 2 : sử dụng implements RUnnable
        Runnable r = new MyRunnable();
        Thread mt2 = new Thread(r);
        mt2.start();
        System.out.println(mt2.isAlive());

        // join : trao quyền thưcj thi cho luồng 1, và  tất cả các luôngf phải chờ nó hoàn thành thì mới tiếp tục

    }
}
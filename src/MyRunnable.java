public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // code logic
        for (int i = 0; i < 100; i=i+2) {
            System.out.println(i);
            // ngủ đông
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package honolulu;

class Sleep {
    public static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
        }
    }
}

class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("thread count: " + i);
            Sleep.sleep(1000);
        }
    }
}

public class SyncThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread Count: " + i);
            Sleep.sleep(1000);
        }
    }
}
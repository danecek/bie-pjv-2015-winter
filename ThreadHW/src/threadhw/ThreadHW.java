package threadhw;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHW extends Thread {

    public ThreadHW(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadHW.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadHW t1 = new ThreadHW("first");
        t1.setPriority(MIN_PRIORITY);
        t1.start();        
        ThreadHW t2 = new ThreadHW("second");
        t2.setPriority(MAX_PRIORITY);
        t2.start();
    }

}

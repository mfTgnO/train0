package skill.common.concurrency;

public class ThreadDemo2 extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo2(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    @Override
    public synchronized void start() {
        synchronized (PD) {
            PD.printCount();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    @Override
    public void run() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

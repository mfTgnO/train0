package skill.common.concurrency.interthreadcommunication;

public class T2 implements Runnable {
    Chat m;
    String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    public T2(Chat m) {
        this.m = m;
        new Thread(this, "Answer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}

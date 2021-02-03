package homeworks.threads;

import lombok.SneakyThrows;

public class Class2 extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        System.out.println("started working");
        Thread.sleep(4000);
        System.out.println("Done");
    }
}

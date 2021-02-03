package homeworks.threads;

import lombok.SneakyThrows;

public class Class1 extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Started execution");
        for (int i = 0; i < 5; i++) {
        Thread.sleep(3000);
            System.out.println("Still working");
        }
        System.out.println("Stopped");
    }
}

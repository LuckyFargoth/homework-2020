package homeworks.threads;


import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Printer implements Runnable {
    private final String message;
    private final int mills;
    private final int iterations;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < iterations; i++) {
            Thread.sleep(mills);
            System.out.println(message);
        }
    }
}

package homeworks.threads;

import lombok.SneakyThrows;

public class ThreadsHomework {
    @SneakyThrows
    public static void main(String[] args) {

//        Thread thread = new Class1();
//        thread.start();

       Runnable runnable = new Printer("I need a cookie", 5000, 3);
//        Thread threadA = new Thread(runnable);
//        threadA.start();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Class1();
        Thread thread3 = new Class2();


        thread1.setDaemon(true);
        thread1.start();


        thread2.start();
        thread2.join();

        thread3.start();






    }
}

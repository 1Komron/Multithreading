package example.process_va_thread;

public class MultiThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Thread ishga tushdi: " + name);

            try {
                Thread.sleep(5000); // 5 soniya kutish. Thread qandaydir ish bajarayotgandek ko'rsatish uchun.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread tugadi: " + name);
        };

        // 3 ta thread yaratamiz
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        // Ishga tushirish
        t1.start();
        t2.start();
        t3.start();
    }
}

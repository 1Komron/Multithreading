package example.process_va_thread;

public class ThreadBuilderExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Thread ishga tushdi: " + Thread.currentThread().getName());

            try {
                Thread.sleep(5000); // 5 soniya kutish. Thread qandaydir ish bajarayotgandek ko'rsatish uchun.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread tugadi: " + Thread.currentThread().getName());
        }; // Runnable interfeysini amalga oshiruvchi lambda ifodasi. Thread ishlashi uchun vazifa Runable orqali beriladi.

        Thread thread = new Thread(task); // Thread obyekti yaratish. Bu jarayonda yangi Stack yaratilmaydi.
        thread.start(); // Threadni ishga tushirish. Bu jarayonda yangi Stack yaratiladi.

        //Runnbale interfeysi orqali bergilan vazifa tugagach, Thread avtomatik ravishda tugaydi.
    }
}

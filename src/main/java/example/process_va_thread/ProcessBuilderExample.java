package example.process_va_thread;

public class ProcessBuilderExample {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder(); // ProcessBuilder obyekti yaratish
        processBuilder.command("firefox"); // Firefox dasturini ishga tushirish uchun buyruq

        try {
            Process process = processBuilder.start(); // Processni ishga tushirish
            System.out.println("Firefox dasturi ishga tushdi. PID: " + process.pid()); //PID -> Process ID

            Thread.sleep(10000); // Firefox dasturi 10 soniya ishlashini kutamiz

            process.destroy(); // Firefox dasturini to'xtatish
            System.out.println("Firefox dasturi to'xtatildi.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
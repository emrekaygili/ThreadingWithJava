//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KronometreThreading thread1 = new KronometreThreading("Thread1");
        KronometreThreading thread2 = new KronometreThreading("Thread2");
        KronometreThreading thread3 = new KronometreThreading("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
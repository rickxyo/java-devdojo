package academy.devdojo.javadevdojo.javacore.ZZFthreads.test;

class ThreadExemple extends Thread{
    private final char c;

    public ThreadExemple(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable{
    private final char c;

    public ThreadExampleRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// Daemon x User
public class ThreadTest1 {
    // pode ser um objeto ou um processo / linha de execução
    // toda as vezes que iniciamos o projeto, a thread main é executada
    public static void main(String[] args) {
//        ThreadExemple t1 = new ThreadExemple('A');
//        ThreadExemple t2 = new ThreadExemple('B');
//        ThreadExemple t3 = new ThreadExemple('C');
//        ThreadExemple t4 = new ThreadExemple('D');
        Thread t1 = new Thread(new ThreadExemple('A'), "T1");
        Thread t2 = new Thread(new ThreadExemple('B'), "T2");
        Thread t3 = new Thread(new ThreadExemple('C'), "T3");
        Thread t4 = new Thread(new ThreadExemple('D'), "T4");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

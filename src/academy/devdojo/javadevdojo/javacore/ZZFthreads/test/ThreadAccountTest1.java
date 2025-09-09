package academy.devdojo.javadevdojo.javacore.ZZFthreads.test;

import academy.devdojo.javadevdojo.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest1 implements Runnable{
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest1 threadAccountTest1 = new ThreadAccountTest1();
        Thread t1 = new Thread(threadAccountTest1, "Hestia");
        Thread t2 = new Thread(threadAccountTest1, "Bell Cranel");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0)
                System.out.println("Faz o L");
        }

    }

    private void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }


}

package academy.devdojo.javadevdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest1 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("pedro"));
        System.out.println(tq.offer("pedro"));
        System.out.println(tq.offer("pedro", 10, TimeUnit.SECONDS));
        System.out.println(tq.remainingCapacity());
        tq.put("DevDojo");

        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());

    }

}

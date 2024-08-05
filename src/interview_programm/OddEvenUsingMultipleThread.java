package interview_programm;

public class OddEvenUsingMultipleThread {
    private static final Object lock = new Object();
    private static int COUNT = 1;
    private static int LIMIT = 100;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printOddNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenNumber();
            }
        });
        t1.start();
        t2.start();
    }

    private static void printEvenNumber() {
        synchronized (lock) {
            while (COUNT <= LIMIT) {
                if (COUNT % 2 == 0) {
                    System.out.println("Even " + COUNT);
                    COUNT++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

        }

    }

    private static void printOddNumber() {
        synchronized (lock) {
            while (COUNT <= LIMIT) {
                if (COUNT % 2 == 1) {
                    System.out.println("Odd " + COUNT);
                    COUNT++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

        }
    }

}


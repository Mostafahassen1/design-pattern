public class Main {
    public static void main(String[] args) {



        Thread thread1 = new Thread(() -> {
            Counter counter1 = Counter.getInstance();
                int result = counter1.addCount();
                System.out.println("Thread 1: " + result);

        });

        Thread thread2 = new Thread(() -> {
            Counter counter2 = Counter.getInstance();
                int result = counter2.addCount();
                System.out.println("Thread 2: " + result);
        });


        thread1.start();    // the thread1  will print  --> 1
        thread2.start();   //  the thread2 will print  ---> 1
          // this error must be the thread1 print ( 1 )&  the thread2 print ( 2 )

    }
}

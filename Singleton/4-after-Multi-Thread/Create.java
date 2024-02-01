public class Counter {
    public int count =0 ;

    private static  Counter instance = null  ;
    public static synchronized Counter getInstance() {
        if (instance == null)
            instance = new Counter();

        return instance;
    }
    public synchronized int addCount() {
        count++;
        return count;
    }
}
/*
In this example, the addCount method is synchronized,
ensuring that only one thread can execute it at a time.

The getInstance method is also synchronized to prevent multiple threads
 from creating multiple instances of the Counter class simultaneously.
 The output will show how the count is updated by both threads.
*/

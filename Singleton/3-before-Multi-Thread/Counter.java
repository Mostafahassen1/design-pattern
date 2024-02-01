public class Counter {
    public int count =0 ;

    private static Counter instance = null  ;
    public static Counter getInstance() {
        if (instance == null)
            instance = new Counter();

        return instance;
    }
    public int addCount() {
        count++;
        return count;
    }
}

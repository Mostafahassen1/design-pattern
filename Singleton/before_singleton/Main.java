public class Main {
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter() ;

        obj1.addCount(); // This object will print 1 
        obj2.addCount(); // This object must be print 2 but will print 1
        // to solve this problem we will use singleton 
    }
}

public class Main {
    public static void main(String[] args) {

        Counter obj1 = Counter.GetInstance() ; // create the new object
        Counter obj2 = Counter.GetInstance(); // refer to the same index(obj1) in memory 

        System.out.println( obj1.addCount() ) ; // in this case the obj1 print 1
        System.out.println(obj2.addCount() ) ;  // and the obj2   print 2
           // because obj1 , obj2 refer to the same index in the memory

    }
}

                //  //  " This is good way with Single Threads "  //  //  

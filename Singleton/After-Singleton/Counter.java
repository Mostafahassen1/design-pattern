public class Counter {
    public int count =0 ;

    private static Counter Instance = null  ;
    public static Counter GetInstance(){
        if( Instance == null )
            Instance = new Counter() ;

        return Instance ;
    }
    public int  addCount(){
        count++ ;
        return count ;
    }
}

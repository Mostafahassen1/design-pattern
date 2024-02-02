public class Main {
    public static void main(String[] args) {
     double salary = 10000 ;

        ICreditCardFactor factor = new ConcreteCreditCardFactory() ;

        ICreditCardProduct product = factor.CARD_PRODUCT(salary) ;

        product.showDetailes();



    }
}

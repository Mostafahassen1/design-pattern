public class ConcreteCreditCardFactory implements  ICreditCardFactor {
    public ICreditCardProduct CARD_PRODUCT(double salary) {
        if( salary > 10000 )
            return new GoldenProduct() ;
        else
            return new SilverProduct() ;
    }
}

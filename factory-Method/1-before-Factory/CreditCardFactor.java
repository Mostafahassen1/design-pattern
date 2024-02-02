public class CreditCardFactor {
    public static ICreditCardProduct getCreditCardFactor(double salary) {

        if (salary > 100000)
            return new GoldenProduct();

        else
            return new SilverProduct();

    }
}





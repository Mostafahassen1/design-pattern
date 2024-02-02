
public class Main {
    public static void main(String[] args) {
        
        IBuilder carBuilder = new CarBuilder() ;

        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildInterior();

        Car  myCar = carBuilder.getResult() ;

        myCar.showResult();


        }
    }

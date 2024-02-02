public class CarBuilder implements  IBuilder {
    private  Car car ;
    public CarBuilder(){
        this.car =new Car() ;
    }

    @java.lang.Override
    public void buildEngine() {
        car.addFeature("Powerful Engine");
    }

    @java.lang.Override
    public void buildWheels() {
        car.addFeature("Powerful Engine");
    }

    @java.lang.Override
    public void buildInterior() {
        car.addFeature("Leather Interior");
    }

    @java.lang.Override
    public Car getResult() {
        return car ;
    }
}

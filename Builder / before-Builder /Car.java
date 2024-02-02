import java.util.LinkedList;

public class Car {
    private LinkedList<String> features;

    public Car() {
        this.features = new LinkedList<>();
    }

    public void addFeature(String feature) {
        features.add(feature);
    }

    public void showFeatures() {
        System.out.println("Car Features:");
        for (String feature : features) {
            System.out.println("- " + feature);
        }
    }
}

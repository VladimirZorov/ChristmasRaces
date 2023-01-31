package christmasRaces.entities.cars;

public abstract class BaseCar implements Car{

    private String model;
    private int horsePower;
    private double cubicCentimeters;

    public BaseCar(String model, int horsePower, double cubicCentimeters) {
        this.model = model;
        this.horsePower = horsePower;
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public double getCubicCentimeters() {
        return 0;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return 0;
    }
}

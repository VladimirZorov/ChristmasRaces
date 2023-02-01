package christmasRaces.entities.cars;

import static christmasRaces.common.ExceptionMessages.INVALID_HORSE_POWER;

public class MuscleCar extends BaseCar {

    private static final double CUBIC_CENTIMETERS = 5000;
    private static final int HpMIN = 400;
    private static final int HpMAX = 600;

    public MuscleCar(String model, int horsePower) {
        super(model, horsePower, CUBIC_CENTIMETERS);
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < HpMIN || horsePower > HpMAX) {
            throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
        }
    }
}

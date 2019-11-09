public class CalculateService {
    public int calculate(int fuelAmount, int fuelRate, int distanceUnit) {
        return fuelAmount * distanceUnit / fuelRate;
    }
}
